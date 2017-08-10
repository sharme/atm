import React, {Component, PropTypes} from 'react';
import {
    View,
    Image,
    Text,
    TouchableWithoutFeedback,
    TextInput,
    StyleSheet,
    Alert,
} from 'react-native';

import Button from '../../Common/Components/Button'

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var deviceHeight = Dimensions.get('window').height;
var contentWidth = 260;
var buttonMenuHeight = 40;

export default class UserLoginPage extends Component {

    constructor(props) {
        super(props);
        this.state = {
            passwordStyle: [styles.buttonMenu, styles.buttonSelect],
            codeStyle: [styles.buttonMenu],
        }
    }

    setPassOrCode(isPass){
        //点击哪个按钮后改变为选择状态
        if(isPass){
            this.setState({passwordStyle:[styles.buttonMenu, styles.buttonSelect],
                codeStyle : [styles.buttonMenu]});
        }else{
            this.setState({passwordStyle:[styles.buttonMenu],
                codeStyle : [styles.buttonMenu, styles.buttonSelect]});
        }
    }

    render() {
        return (
            <View style={styles.view}>
                <Image source={require('../../images/login_background.png')} style={styles.loginBackground}/>
                <View style={styles.contentView}>
                    <View style={styles.buttonsView}>
                        <Button title='密码登陆' buttonStyle={this.state.passwordStyle}
                                textStyle={styles.buttonMenuText}
                                contentViewStyle={styles.buttonContentStyle}
                                onPress={() => this.setPassOrCode(true)}/>

                        <Button title='验证码登陆' buttonStyle={this.state.codeStyle} textStyle={styles.buttonMenuText}
                                contentViewStyle={styles.buttonContentStyle}
                                onPress={() => this.setPassOrCode(false)}/>
                    </View>
                    <View style={styles.inputView}>
                        <View style={styles.inputIcon}>
                            <TextInput style={styles.input} placeholder="请输入关键字" placeholderTextColor="#adadad"/>
                        </View>
                    </View>
                    <View style={{alignItems: 'flex-end', width: 260, marginTop: 6}}>
                        <Button title='找回密码' color='#ffffff' buttonStyle={{
                            alignItems: 'flex-end',
                            width: 80,
                            height: 30,
                            backgroundColor: 'transparent'
                        }} textStyle={{color: '#ffffff',fontSize:11}} onPress={() => console.log("")}/>
                    </View>
                    <View style={{marginTop: 5}}>
                        <Button title='' source={require('../../images/btn_login.png')}
                                imageStyle={styles.loginButton} buttonStyle={styles.loginButton}
                                contentViewStyle={styles.loginButton} onPress={() => Alert.alert(
                            'Alert Title',
                            'aaa',
                        )}/>
                        <Button title='' source={require('../../images/btn_register.png')}
                                imageStyle={styles.loginButton} buttonStyle={[styles.loginButton,{marginTop:10}]}
                                contentViewStyle={[styles.loginButton]} onPress={() => Alert.alert(
                            'Alert Title',
                            'aaa',
                        )}/>
                    </View>
                </View>
            </View>
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
    inputView: {
        // justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#deebf1',
        height: 100,
        width: contentWidth,
        marginTop:20,
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
    inputIcon: {
        flexDirection: 'row',
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
