/**
 * Created by zhiyuli on 2017/8/12.
 */
import React, {Component, PropTypes} from 'react';
import {
    View,
    Image,
    Text,
    TouchableWithoutFeedback,
    TextInput,
    StyleSheet,
    Keyboard,
    Animated,
    ScrollView,
    Alert,
} from 'react-native';

import {
    DrawerNavigator
 } from 'react-navigation';

import Button from '../../Common/Components/Button'
import CheckBox from '../../Common/Components/CheckBox'

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var deviceHeight = Dimensions.get('window').height;
var contentWidth = 260;
var contentHeight = 165;

export default class UserRegisterPage extends Component {

    static navigationOptions = {
        title:'注册',
        headerStyle: {
            backgroundColor: 'transparent'
          }
    };

    constructor(props) {
        super(props);
        this.state = {
            password: '',//密码
            codeMobile: '',//验证码登录手机号
            code: '',//手机号
            currentPage: 0,

        }
    }

    //手机号码icon View
    mobileIconView() {
        return (
            <Image source={require('../../images/mobile_icon.png')}
                   style={styles.inputIcon}/>
        );
    }

    //输入框view  验证码登录输入框
    inputCodeView() {
        return (<View style={styles.inputView}>
            <View style={styles.inputContent}>
                {this.mobileIconView()}
                <TextInput style={styles.input} placeholder="请输入手机号" keyboardType='phone-pad'
                           placeholderTextColor="#adadad" ref={(input) => {
                    this.codeMobile = input;
                }} onChangeText={(text) => this.setState({codeMobile: text})}/>
            </View>
            <View style={styles.inputLine}/>
            <View style={styles.inputContent}>
                <Image source={require('../../images/mobile_code_icon.png')}
                       style={[styles.inputIcon, {height: 16}]} resizeMode="stretch"/>
                <TextInput style={[styles.input, {width: 134}]} placeholder="请输入验证码"
                           placeholderTextColor="#adadad" onChangeText={(text) => this.setState({code: text})}/>
                <Button title='获取验证码' textStyle={{color: '#5ea1fb', fontSize: 13}} onPress={() => console.log("")}/>
            </View>
            <View style={styles.inputLine}/>
            <View style={styles.inputContent}>
                <Image source={require('../../images/password_icon.png')}
                       style={[styles.inputIcon, {height: 16}]} resizeMode="stretch"/>
                <TextInput style={styles.input} placeholder="请输入密码" password={true}
                           placeholderTextColor="#adadad" onChangeText={(text) => this.setState({password: text})}/>
            </View>
        </View>);
    }

    buttonRegister() {
        return (
            <View style={{marginTop: 5}}>

                <Button title='注册并登录'
                        textStyle={{color:'white',fontSize:16}} buttonStyle={[styles.loginButton, {marginTop: 10}]}
                        contentViewStyle={[styles.loginButton]} />
            </View>
        );
    }

    render() {
        return (
            <TouchableWithoutFeedback onPressIn={Keyboard.dismiss}>
                <View style={styles.view}>

                    <Image source={require('../../images/login_background.png')} style={styles.loginBackground}/>
                    <View style={styles.contentView}>
                        {this.inputCodeView()}
                    </View>
                    {this.buttonRegister()}
                </View>
            </TouchableWithoutFeedback>
        );
    }


}
const styles = StyleSheet.create({
    view: {
        flex: 1,
        alignItems: 'center',
        marginTop:-66,
    },
    contentView: {
        // justifyContent: 'center',
        alignItems: 'center',
        marginTop: 82,
        width: contentWidth,

    },
    inputView: {
        // justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#deebf1',
        height: contentHeight,
        width: contentWidth,
        marginTop: 20,
        borderRadius:2,
    },
    inputContent: {
        flexDirection: 'row',
        width: contentWidth,
    },
    input: {
        width: 180,
        height: contentHeight / 3,
        marginLeft: 10,
        fontSize: 14,
    },
    inputIcon: {
        width: 12,
        height: 18,
        alignItems: 'flex-start',
        marginLeft: 18,
        marginTop: 18,
    },
    inputLine: {
        backgroundColor: '#9eabbd',
        width: contentWidth - 40,
        height: 1,
        alignItems: 'center',
    },
    loginBackground: {
        position: 'absolute',
        width: deviceWidth,
        height: deviceHeight,
    },
    loginButton: {
        width: contentWidth,
        height: 40,
        backgroundColor:'#f7b527'
    }
})