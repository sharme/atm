import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  ListView,
  TouchableOpacity,
  Image,
  Alert,
  TextInput,
  View
} from 'react-native';

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var viewWidth = deviceWidth-20;
var viewHeight = 34;

export default class SearchBarView extends Component {
  render(){
    return(
      <View style={styles.view}>
        <Text style={{width:60,height:viewHeight}}>
        adfasdfsdf
        </Text>
        <View style={styles.line}/>
        <TextInput style={styles.input} placeholder="请输入关键字" placeholderTextColor="#adadad"/>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  line:{
    height:viewHeight-4,
    width:1,
    backgroundColor:'#b2b2b2',
    marginTop:2,
  },
  view:{
    height:viewHeight,
    width:viewWidth,
    flexDirection: 'row',
    position:'absolute',
    top:20,
    left:10,
    flex:1,
    backgroundColor:'#ffffff',
  },
  input:{
    flex:1,
    fontSize:13,
    color:'#000000',
    marginLeft:2,
  },
  address:{
    color:'#000000',
  }



});
