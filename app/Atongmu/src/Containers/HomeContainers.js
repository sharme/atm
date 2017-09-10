/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, {Component} from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    ListView,
    RefreshControl,
    TouchableHighlight,
    Image,
    StatusBar,
    Alert,
    View
} from 'react-native';
import {
    DrawerNavigator
 } from 'react-navigation';

import Button from '../Common/Components/Button'

import BannerImages from '../Common/Components/BannerImages'
import SearchBarView from '../Common/Components/SearchBarView'
import Footer from '../Common/Components/Footer'
import ColorUtils from '../Util/ColorUtils'
import TabBarItem from '../Common/Components/TabBarItem'
import HeaderTitleButton from '../Common/Components/HeaderTitleButton'
import ActivityItemCell from '../Common/Components/ActivityItemCell'
import BasePage from './BasePage'

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
//行业 城市  时间  view高度
var homeMenuHeight = 65;


var IMGS = [
    'http://img.showguide.cn/uploads/try/1478743652EXPOPARTES1111.jpg',
    'http://h.hiphotos.baidu.com/image/h%3D220/sign=a67cd12f9582d158a4825eb3b00b19d5/aa18972bd40735fa91b8197897510fb30e2408a2.jpg',
    'http://img.showguide.cn/uploads/try/1478743652EXPOPARTES1111.jpg',
    'http://img.showguide.cn/uploads/try/1478743652EXPOPARTES1111.jpg',
];

export default class HomeContainers extends BasePage {

    static navigationOptions = {
        header: false , // 覆盖预设中的此项
        tabBarLabel:'首页',  
        tabBarIcon:({focused,tintColor}) => (  
          <TabBarItem  
            tintColor={tintColor}  
            focused={focused}  
            normalImage={require('../images/home_tab_unselect.png')}  
            selectedImage={require('../images/home_tab_select.png')}  
          />  
        ),
      
          
    }
    // 初始化模拟数据
    constructor(props) {
        super(props);
        const ds = new ListView.DataSource({rowHasChanged: (r1, r2) => r1 !== r2});
        this.state = {
            dataSource: ds.cloneWithRows([
                'John', 'Joel', 'James', 'Jimmy', 'Jackson', 'Jillian', 'Julie', 'Devin'
            ]),
            swiperShow:false,
            isrefreshing:true,
            isLoadMore:false,
            statusBGC:'red',
        };
        this._renderRow=this._renderRow.bind(this);
    }

    onPress(){
        this.props.navigation.navigate('Login',{ transition: 'forVertical' });
    }

    _renderRow(rowData: string, sectionID: number, rowID: number) {
        return (
            <ActivityItemCell dataSource={rowData}  onPressHandler={(str)=>this.props.navigation.navigate('ExDetail')}/>
        );
    }

    homeMenu() {
        return (
            <View style={{
                flexDirection: 'row', alignItems: 'center',
                justifyContent: 'center',
            }}>
            
                {this.homeMenuButton('城市', require('../images/home_menu_two.png'))}
                {this.homeMenuButtonLine()}
                {this.homeMenuButton('行业', require('../images/home_menu_two.png'))}
                {this.homeMenuButtonLine()}
                {this.homeMenuButton('时间', require('../images/home_menu_two.png'))}
            </View>
        );
    }

    homeMenuButton(text, imgSource) {
        return (
            <TouchableHighlight style={{
                width: deviceWidth / 3.0,
                height: homeMenuHeight,
                alignItems: 'center',
                justifyContent: 'center',
                backgroundColor: 'white'
            }} onPress={() => console.log()} activeOpacity={0.8}
                                underlayColor={'#edeceb'}>
                <View>
                    <Image source={imgSource} style={{width: 25, height: 25}} resizeMode="stretch"/>
                    <Text style={{fontSize: 12, color: '#343536', marginTop: 8}}>{text}</Text>
                </View>
            </TouchableHighlight>
        );
    }

    //城市  行业 时间  分割线
    homeMenuButtonLine() {
        return (
            <View style={{width: 1, height: 46, backgroundColor: '#e4e5e6'}}/>
        );
    }


    componentDidMount(){
        setTimeout(()=>{
            this.setState({swiperShow:true});
        },0);
        setTimeout(() => {
            this.setState({isrefreshing:false});
            // Alert.alert(
            //     'Alert Title',
            //     'bbb',
            // )
        }, 7000);
    }

    renderSwiper(){
        if(this.state.swiperShow){
            return (
                <BannerImages images={IMGS} itemClick={(key) => Alert.alert(
                    'Alert Title',
                    key,
                )}/>
            );
        }else {
            return <View style={{height:185}}></View>;
        }
    }


    render() {
        return (
            <View style={styles.container}>
                {/* //transparent #0e8bff*/}
            <StatusBar barStyle={'light-content'} backgroundColor={'#009DF0'} />


                {this.renderSwiper()}

                <SearchBarView/>
                {this.homeMenu()}
                <HeaderTitleButton  title={'近期展会'} buttonTitle={'查看全部'} onPressHandler={(str)=>Alert.alert(
                                            'Alert Title',
                                            str,
                                        )} />
                {/* {this.homeListTitle()} */}
                <ListView
                    style={styles.listView}
                    dataSource={this.state.dataSource}
                    renderRow={this._renderRow}
                    onEndReached={() => {
                        this.setState({isLoadMore:true});
                        setTimeout(() => {
                            this.setState({isLoadMore:false});
                            {/* Alert.alert(
                                'Alert Title',
                                'cccc',
                            ) */}
                        }, 5000);
                    }}
                    removeClippedSubviews={false}
                    onEndReachedThreshold={10}
                    renderFooter={()=>{
                        return this.state.isLoadMore ? <Footer /> : <View />;
                    } }
                    refreshControl={
                        <RefreshControl
                            style={styles.refreshControlBase}
                            refreshing={this.state.isrefreshing}
                            onRefresh={() =>{
                                {/* Alert.alert(
                                            'Alert Title',
                                            'aaa',
                                        ) */}
                                // setTimeout(() => {
                                //     this.state.isrefreshing=true;
                                //     Alert.alert(
                                //         'Alert Title',
                                //         'aaa',
                                //     )
                                // }, 3000);

                            } }
                            title="Loading..."
                            colors={['#ffaa66cc', '#ff00ddff', '#ffffbb33', '#ffff4444']}
                        />
                    }
                />
            </View>
        );
    }
}

const styles = StyleSheet.create({

    refreshControlBase: {
        backgroundColor: 'transparent'
    },
    listView: {
        flex: 1,
        width: Dimensions.get('window').width,
        backgroundColor: 'white',

    },
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#edf1fe',
    },
    welcome: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
    instructions: {
        textAlign: 'center',
        color: '#333333',
        marginBottom: 5,
    },
    banner: {
        width: deviceWidth,
        height: 100,
    },
});
