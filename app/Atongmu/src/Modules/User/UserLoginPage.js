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

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var deviceHeight = Dimensions.get('window').height;
var contentWidth = 260;
var contentHeight = 110;
var buttonMenuHeight = 40;

export default class UserLoginPage extends Component {

    static navigationOptions = {
        header:false
    };

    constructor(props) {
        super(props);
        this.state = {
            passwordStyle: [styles.buttonMenu, styles.buttonSelect],
            codeStyle: [styles.buttonMenu],
            passMobile: '',//登录手机号
            password: '',//密码
            codeMobile: '',//验证码登录手机号
            code: '',//手机号
            currentPage: 0,

        }
    }

    setPassOrCode(isPass, isSetScrollView) {
        var scrollView = this.refs.scrollView;
        //点击哪个按钮后改变为选择状态
        if (isPass) {
            this.passMobile.focus();
            this.setState({
                passwordStyle: [styles.buttonMenu, styles.buttonSelect],
                codeStyle: [styles.buttonMenu],
            });
            if (isSetScrollView) {
                scrollView.scrollResponderScrollTo({x: 0, y: 0, animated: true})
            }

        } else {
            this.codeMobile.focus();
            this.setState({
                passwordStyle: [styles.buttonMenu],
                codeStyle: [styles.buttonMenu, styles.buttonSelect],
            });
            if (isSetScrollView) {
                scrollView.scrollResponderScrollTo({x: contentWidth, y: 0, animated: true})
            }

        }
    }

    buttonMenuTop() {
        return (
            <View style={styles.buttonsView}>
                <Button title='密码登陆' buttonStyle={this.state.passwordStyle}
                        textStyle={styles.buttonMenuText}
                        contentViewStyle={styles.buttonContentStyle}
                        onPress={() => this.setPassOrCode(true, true)}/>

                <Button title='验证码登陆' buttonStyle={this.state.codeStyle} textStyle={styles.buttonMenuText}
                        contentViewStyle={styles.buttonContentStyle}
                        onPress={() => this.setPassOrCode(false, true)}/>
            </View>
        );
    }

    //输入框view  登录输入框
    inputPasswordView() {
        return (<View style={styles.inputView}>
            <View style={styles.inputContent}>
                {this.mobileIconView()}
                <TextInput style={styles.input} placeholder="请输入手机号" keyboardType='phone-pad' underlineColorAndroid='transparent'
                           placeholderTextColor="#adadad" ref={(input) => {
                    this.passMobile = input;
                }} onChangeText={(text) => this.setState({passMobile: text})}/>
            </View>
            <View style={styles.inputLine}>
            </View>
            <View style={styles.inputContent}>
                <Image source={require('../../images/password_icon.png')}
                       style={[styles.inputIcon, {height: 16}]} resizeMode="stretch"/>
                <TextInput style={styles.input} placeholder="请输入密码" password={true} underlineColorAndroid='transparent'
                           placeholderTextColor="#adadad" onChangeText={(text) => this.setState({password: text})}/>
            </View>
        </View>);
    }

    //输入框view  验证码登录输入框
    inputCodeView() {
        return (<View style={styles.inputView}>
            <View style={styles.inputContent}>
                {this.mobileIconView()}
                <TextInput style={styles.input} placeholder="请输入手机号" keyboardType='phone-pad' underlineColorAndroid='transparent'
                           placeholderTextColor="#adadad" ref={(input) => {
                    this.codeMobile = input;
                }} onChangeText={(text) => this.setState({codeMobile: text})}/>
            </View>
            <View style={styles.inputLine}>
            </View>
            <View style={styles.inputContent}>
                <Image source={require('../../images/mobile_code_icon.png')}
                       style={[styles.inputIcon, {height: 16}]} resizeMode="stretch"/>
                <TextInput style={[styles.input, {width: 134}]} placeholder="请输入验证码" underlineColorAndroid='transparent'
                           placeholderTextColor="#adadad" onChangeText={(text) => this.setState({code: text})}/>
                <Button title='获取验证码' textStyle={{color: '#5ea1fb', fontSize: 13}} onPress={() => console.log("")}/>
            </View>
        </View>);
    }

    //手机号码icon View
    mobileIconView() {
        return (
            <Image source={require('../../images/mobile_icon.png')}
                   style={styles.inputIcon}/>
        );
    }

    buttonFindPass() {
        return (
            <View style={{alignItems: 'flex-end', width: 260, marginTop: 6}}>
                <Button title='找回密码' color='#ffffff' buttonStyle={{
                    alignItems: 'flex-end',
                    width: 80,
                    height: 30,
                    backgroundColor: 'transparent'
                }} textStyle={{color: '#ffffff', fontSize: 11}} onPress={() => console.log("")}/>
            </View>
        );
    }

    buttonLoginRegister() {
        return (
            <View style={{marginTop: 5}}>
                <Button title='' source={require('../../images/btn_login.png')}
                        imageStyle={styles.loginButton} buttonStyle={styles.loginButton}
                        contentViewStyle={styles.loginButton} onPress={() => Alert.alert(
                    'Alert Title',
                    'aaa:' + this.state.passMobile + '--' + this.state.password,
                )}/>
                <Button title='' source={require('../../images/btn_register.png')}
                        imageStyle={styles.loginButton} buttonStyle={[styles.loginButton, {marginTop: 10}]}
                        contentViewStyle={[styles.loginButton]} onPress={()=>this.props.navigation.navigate('Register')}/>
            </View>
        );
    }

    onAnimationEnd(e) {
        var offSetX = e.nativeEvent.contentOffset.x;
        var currentPage = Math.floor(offSetX / contentWidth);
        this.setState({currentPage: currentPage});
        // Alert.alert(
        //     'Alert Title',
        //     'aaa:'+currentPage,
        // )
        if (currentPage == 1) {
            this.setPassOrCode(false, false);
        } else {
            this.setPassOrCode(true, false);
        }
    }

    render() {
        return (//Keyboard.dismiss
            <TouchableWithoutFeedback onPressIn={Keyboard.dismiss}>
                <View style={styles.view}>
                
                    <Image source={require('../../images/login_background.png')} style={styles.loginBackground}/>
                    <View style={styles.contentView}>
                        {this.buttonMenuTop()}
                        <ScrollView horizontal={true} //水平滑动
                                    ref="scrollView"
                                    pagingEnabled={true}
                                    showsHorizontalScrollIndicator={false}
                                    style={{width: contentWidth, height: contentHeight + 20}}//设置大小
                                    onScroll={Animated.event(
                                        [{nativeEvent: {contentOffset: {x: 520}}}]//把contentOffset.x绑定给this.state.xOffset
                                    )}
                                    scrollEventThrottle={100}
                                    onMomentumScrollEnd={this.onAnimationEnd.bind(this)}>

                            {this.inputPasswordView()}
                            {this.inputCodeView()}

                        </ScrollView>

                        {this.buttonFindPass()}
                        {this.buttonLoginRegister()}
                    </View>
                    <Button title='' source={require('../../images/btn_close.png')}
                        imageStyle={styles.closeBtn} buttonStyle={{position: 'absolute',top: 40,left: 20,}}
                        contentViewStyle={styles.closeBtn} onPress={()=>this.props.navigation.goBack()}/>

                </View>
            </TouchableWithoutFeedback>
        );
    }
}

const styles = StyleSheet.create({
    view: {
        flex: 1,
        alignItems: 'center',
    },
    contentView: {
        // justifyContent: 'center',
        alignItems: 'center',
        marginTop: 180,
        width: contentWidth,
    },
    closeBtn:{
        width:15,
        height:15,
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
    input: {
        width: 180,
        height: contentHeight / 2,
        marginLeft: 10,
        fontSize: 14,
        borderWidth:0,
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
    buttonContentStyle: {
        alignItems: 'center',
        justifyContent: 'center',
        width: contentWidth / 2,
        height: buttonMenuHeight,
        borderColor: '#0c83fe',
        borderWidth: 1,
        borderStyle: 'solid',
    },
    buttonMenuText: {
        color: '#ffffff',
        fontSize: 15,
        textAlign: 'center',
        justifyContent: 'center',
    },
    buttonMenu: {
        width: contentWidth / 2,
        height: buttonMenuHeight,
        backgroundColor: 'transparent',
    },
    buttonSelect: {
        backgroundColor: '#0c83fe',
    },
    buttonsView: {
        flexDirection: 'row',
    },
    inputContent: {
        flexDirection: 'row',
        width: contentWidth,
    },
    loginBackground: {
        position: 'absolute',
        width: deviceWidth,
        height: deviceHeight,
    },
    loginButton: {
        width: contentWidth,
        height: 40,
    }
})
