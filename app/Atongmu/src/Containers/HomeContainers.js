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
    TouchableHighlight,
    Image,
    Alert,
    View
} from 'react-native';
import {
    Actions,
} from 'react-native-router-flux';

import Button from '../Common/Components/Button'

import BannerImages from '../Common/Components/BannerImages'
import SearchBarView from '../Common/Components/SearchBarView'
import ColorUtils from '../Common/ColorUtils'

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

export default class HomeContainers extends Component {
    // 初始化模拟数据
    constructor(props) {
        super(props);
        const ds = new ListView.DataSource({rowHasChanged: (r1, r2) => r1 !== r2});
        this.state = {
            dataSource: ds.cloneWithRows([
                'John', 'Joel', 'James', 'Jimmy', 'Jackson', 'Jillian', 'Julie', 'Devin'
            ]),
            swiperShow:false,
        };
    }

    _renderRow(rowData: string, sectionID: number, rowID: number) {
        return (
            <TouchableHighlight onPress={Actions.loginPage} style={{backgroundColor: 'white'}}>
                <View>

                    <View style={styles.row}>
                        <Image source={require('../images/home_item_test.png')} style={{height:90,width:100,alignItems:'flex-start'}}/>
                        <View style={{marginLeft:6,flex:1}}>
                            <Text style={{fontSize: 15,height:38,marginRight:10}}>
                                {rowData + '我是测试行号哦~我是测试行号哦~我是测试行号哦~我是测试行号哦~我是测试行号哦~'}
                            </Text>
                            <View style={{flexDirection:'row',alignItems:'center',marginTop:10,}}>
                                <Image source={require('../images/position_icon.png')} style={{width:10,height:12}}/>
                                <Text style={{marginLeft:4,fontSize:13}}>上海</Text>

                            </View>
                            <View style={{flexDirection:'row',alignItems:'center',flex:1,marginTop:4,width:deviceWidth-100}}>
                               <View style={{flex:1,flexDirection:'row',alignItems:'center'}}>
                                   <Image source={require('../images/time_icon.png')} style={{width:10,height:10}}/>
                                   <Text style={{marginLeft:4,fontSize:13,}}>2017-08-11</Text>
                               </View>

                                <View style={{alignItems:'center',justifyContent:'flex-end',flex:1,flexDirection:'row',marginRight:30}}>

                                    <Text style={{fontSize:13,marginRight:6}}>208</Text>
                                    <Image source={require('../images/num_icon.png')} style={{width:10,height:6,marginRight:5}}/>

                                </View>
                            </View>
                        </View>
                    </View>
                    <View style={{width: deviceWidth, height: 0.7, backgroundColor: '#e4e5e6'}}/>
                </View>

            </TouchableHighlight>
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

    //近期会展 标题栏
    homeListTitle() {
        return (
            <View>
                <View style={{
                    height: 35,
                    width: deviceWidth,
                    flexDirection: 'row',
                    backgroundColor: 'white',
                    marginTop: 10,
                    // justifyContent: 'center',
                    alignItems: 'center',
                }}>
                    <View style={{
                        height: 15,
                        width: 3,
                        marginLeft: 8,
                        backgroundColor: '#0c83fe',

                    }}/>
                    <Text style={{
                        width: deviceWidth - 96, marginLeft: 8, justifyContent: 'center',
                        alignItems: 'center',fontSize:15,
                    }}>
                        近期展会
                    </Text>
                    <Button title="查看全部" buttonStyle={{alignItems: 'flex-end', height: 40, justifyContent: 'flex-end'}}
                            onPress={() => console.log()} textStyle={{color: '#b5b6b7'}}/>

                </View>
                <View style={{width: deviceWidth, height: 0.7, backgroundColor: '#e4e5e6'}}/>
            </View>
        );
    }

    componentDidMount(){
        setTimeout(()=>{
            this.setState({swiperShow:true});
        },0)
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
                {this.renderSwiper()}

                <SearchBarView/>
                {this.homeMenu()}
                {this.homeListTitle()}
                <ListView
                    style={styles.listView}
                    dataSource={this.state.dataSource}
                    renderRow={this._renderRow}
                />
            </View>
        );
    }
}

const styles = StyleSheet.create({

    row: {
        flexDirection: 'row',
        // justifyContent: 'center',
        padding: 10,
        height: 108,
        backgroundColor: 'white',
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
