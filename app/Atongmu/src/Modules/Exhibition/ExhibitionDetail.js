import React, { Component, PropTypes } from 'react';
import {
    View,
    Image,
    Text,
    TouchableWithoutFeedback,
    TextInput,
    StyleSheet,
    Keyboard,
    Animated,
    SectionList,
    Alert,
} from 'react-native';
import {
    DrawerNavigator
} from 'react-navigation';

import DeviceUtil from '../../Util/DeviceUtil'
import ColorUtils from '../../Util/ColorUtils'
import ViewLine from '../../Common/Components/ViewLine'



var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var deviceHeight = Dimensions.get('window').height;
var detailImgWidth = DeviceUtil.deviceWH.width - 20;
var detailImgHeight = (detailImgWidth / 355) * 220;


var this_ = undefined;

export default class ExhibitionDetail extends Component {

    static navigationOptions = {
        title: '展会详情',
    }

    

    // 初始化模拟数据
    constructor(props) {
        super(props);

        this_ = this;

        this.state = {
            titleContent:{ title: '最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加', time: '2017-09-08 13:00', section: 0 },
            
            dataSource: [
                {
                    key: 'k1', data: [
                        { title: '最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加123', icon: require('../../images/home_item_test.png'), section: 0 },
                        { title: '最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加456.最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加456最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加456最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加456最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加456', icon: require('../../images/home_item_test.png'), section: 0}]
                },
                {
                    key: 'k2', data: [
                        { title: '退出', content: '很好的展会,最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加456.最近的展会，北京很精彩，世界', section: 1 },
                        { title: '退出', content: '很好的展会,最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加456.最近的展会，北京很精彩，世界', section: 1 }
                        ,
                        { title: '退出', content: '很好的展会,最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加456.最近的展会，北京很精彩，世界', section: 1 }
                        ,

                    ]
                }
            ]
        }
    }

    detailView(item) {
        
        return (
            <View style={styles.content}>
                <View style={{}}>
                    <Text style={{ height: 40, width: DeviceUtil.deviceWH.width - 20, marginTop: 20, fontSize: 18 }}>{item.item.title}</Text>
                    <Text style={{ height: 25, width: DeviceUtil.deviceWH.width - 20, marginTop: 10 }}>{item.item.time}</Text>
                </View>
            </View>
        );
    }
    imageView(item) {
        return (
            <View style={styles.content}>
                <Image source={item.item.icon} resizeMode='cover' style={
                    { width: detailImgWidth, height: detailImgHeight }
                } />
                <Text style={{ width: DeviceUtil.deviceWH.width - 20, marginTop: 10, marginBottom: 10, fontSize: 14 }}>{item.item.title}</Text>

            </View>
        );
    }
    _sectionHeader(section) {
        
        if (section.section.key === 'k1') {
            return (
                <View style={styles.content}>
                <View style={{}}>
                    <Text style={{ height: 40, width: DeviceUtil.deviceWH.width - 20, marginTop: 20, fontSize: 18 }}>{this_.state.titleContent.title}</Text>
                    <Text style={{ height: 25, width: DeviceUtil.deviceWH.width - 20, marginTop: 10 }}>{this_.state.titleContent.time}</Text>
                </View>
                <ViewLine/>
            </View>
            )
        }else if (section.section.key === 'k2') {
            return (
                <View>
                    <View style={{ height: 10, backgroundColor: '#EAF3FD' }} />
                    <View style={{ height: 30, flexDirection: 'row' }}>
                        <Text style={{ width: deviceWidth / 2.0 }}>评论</Text><View style={{ width: 1, height: 30, backgroundColor: 'red' }} />
                        <Text style={{ width: deviceWidth / 2.0 }}>评论</Text>
                    </View>
                    <ViewLine lineStyle={{ marginBottom: 0 }} />
                </View>
            )
        } else {
            return (
                <View style={{ height: 1, width: deviceWidth, backgroundColor: 'transparent', }}>
                    <ViewLine lineStyle={{ marginBottom: 0 }} />
                </View>
            );
        }

    }
    _renderItemComponent(item) {
        if (item.item.section === 0) {
            return (
                <View style={[styles.content, { marginTop: 10, }]}>
                    <Image source={item.item.icon} resizeMode='cover' style={
                        { width: detailImgWidth, height: detailImgHeight }
                    } />
                    <Text style={{ width: DeviceUtil.deviceWH.width - 20, marginTop: 20, fontSize: 14 }}>{item.item.title}</Text>

                </View>
            )
        } else {
            return (
                <View style={styles.content}>
                    <Text style={{ width: DeviceUtil.deviceWH.width - 20, marginTop: 20, fontSize: 14,height:200 }}>{item.item.title}</Text>
                </View>
            )
        }
    }
    _extraUniqueKey(item, index) {
        return "index" + index + item;
    }
    render() {
        return (
            <View style={{ flex: 1, backgroundColor: 'white'}}>
                {/* {this.detailView()}
                <ViewLine lineStyle={{ marginBottom: 12 }} />
                {this.imageView()} */}
                <SectionList
                    style={{ flex: 1 }}
                    key={'sectionKey'}
                    renderItem={this._renderItemComponent}
                    renderSectionHeader={this._sectionHeader}
                    ItemSeparatorComponent={() => <View key='itemSep' style={{ backgroundColor: '#e4e5e6', height: 0.1, width: deviceWidth }} />}
                    sections={this.state.dataSource}
                    keyExtractor={this._extraUniqueKey}// 每个item的key
                />
                <ViewLine/>
                <View style={{height:40,width:deviceWidth,flexDirection:'row',}}>
                    
                    <TextInput style={{marginTop:5,marginLeft:20,borderRadius: 10,width:deviceWidth-120,height:30,backgroundColor:'#EEEEEE',justifyContent:'center'}} placeHolder/>
                </View>

            </View>
        )
    }


}
const styles = StyleSheet.create({
    content: {
        alignItems: 'center',
        paddingLeft: 10,
        paddingRight: 10,
        backgroundColor:'white'
    }
});

