import React, { Component,PropTypes } from 'react';
import {
  View,
  Image,
  Text,
  TouchableWithoutFeedback,
  TextInput,
  StyleSheet
} from 'react-native';

import Button from '../../Common/Components/Button'

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var deviceHeight = Dimensions.get('window').height;

export default class UserLoginPage extends Component {



  render() {
    return (
      <View style = {styles.view}>
        <Image source={require('../../images/login_background.png')} style={styles.loginBackground}/>
        <View style = {styles.contentView}>
          <View style={styles.buttonsView}>
            <Button title='密码登陆' buttonStyle={styles.buttonSelect}/>
            <Button title='密码登陆'/>
          </View>
          <View style={styles.inputView}>
            <View style={styles.inputIcon}>
              <TextInput style={styles.input} placeholder="请输入关键字" placeholderTextColor="#adadad"/>
            </View>
          </View>
          <View style={{alignItems:'flex-end',width:260}}>
            <Button title='找回密码' color='#ffffff'/>
          </View>
            <View style={{marginTop:20,}}>
                <Button title='' source={require('../../images/btn_login.png')} buttonStyle={styles.loginButton}/>
            </View>
        </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  view:{
    flex:1,
    alignItems:'center',
    backgroundColor:'#c8ab7c',
  },
  contentView:{
    // justifyContent: 'center',
    alignItems:'center',
    marginTop:130,
    width:260,
  },
  inputView:{
    // justifyContent: 'center',
    alignItems:'center',
    backgroundColor:'#ffffff',
    height:90,
    width:260,
  },
  buttonSelect:{
    backgroundColor:'#0c83fe',
    color:'#f2f9ff',
  },
  buttonsView:{
    flexDirection: 'row',
  },
  inputIcon:{
    flexDirection: 'row',
  },
    loginBackground:{
        position:'absolute',
        width:deviceWidth,
        height:deviceHeight,
    },
    loginButton:{
        width:230,
        height:45,
    }
})
