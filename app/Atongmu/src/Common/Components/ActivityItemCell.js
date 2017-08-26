/*
展会 活动 cell
Lewin 
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
    Alert,
    View
} from 'react-native';

import Button from './Button'

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;


const ActivityItemCell = ({ dataSource, onPressHandler }) =>
(
    <TouchableHighlight onPress={()=>onPressHandler(dataSource)} style={{backgroundColor: 'white'}}>
    <View>

        <View style={styles.row}>
            <Image source={require('../../images/home_item_test.png')} style={{height:90,width:100,alignItems:'flex-start'}}/>
            <View style={{marginLeft:6,flex:1}}>
                <Text style={{fontSize: 15,height:38,marginRight:10}}>
                    {dataSource + '我是测试行号哦~我是测试行号哦~我是测试行号哦~我是测试行号哦~我是测试行号哦~'}
                </Text>
                <View style={{flexDirection:'row',alignItems:'center',marginTop:10,}}>
                    <Image source={require('../../images/position_icon.png')} style={{width:10,height:12}}/>
                    <Text style={{marginLeft:4,fontSize:13}}>上海</Text>

                </View>
                <View style={{flexDirection:'row',alignItems:'center',flex:1,marginTop:4,width:deviceWidth-100}}>
                   <View style={{flex:1,flexDirection:'row',alignItems:'center'}}>
                       <Image source={require('../../images/time_icon.png')} style={{width:10,height:10}}/>
                       <Text style={{marginLeft:4,fontSize:13,}}>2017-08-11</Text>
                   </View>

                    <View style={{alignItems:'center',justifyContent:'flex-end',flex:1,flexDirection:'row',marginRight:30}}>

                        <Text style={{fontSize:13,marginRight:6}}>208</Text>
                        <Image source={require('../../images/num_icon.png')} style={{width:10,height:6,marginRight:5}}/>

                    </View>
                </View>
            </View>
        </View>
        <View style={{width: deviceWidth, height: 0.7, backgroundColor: '#e4e5e6'}}/>
    </View>

</TouchableHighlight>
)

const styles = StyleSheet.create({
    
        row: {
            flexDirection: 'row',
            // justifyContent: 'center',
            padding: 10,
            height: 108,
            backgroundColor: 'white',
        },
    });

export default ActivityItemCell;