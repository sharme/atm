'use strict';

// import React from 'react'
import React, {Component} from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    Image,
    View
} from 'react-native';


// import { Provider } from 'react-redux'
import {Navigator} from 'react-native-deprecated-custom-components'
import App from './Containers/app'
import {
    Scene,
    Router,
    Actions,
    Reducer,
    ActionConst,
} from 'react-native-router-flux';

import Button from 'react-native-button';

import Icon from 'react-native-vector-icons/Ionicons';

/**
 * 界面对象 开始
 */
import AboutMe from './Containers/AboutMe'
import ExhibitionCompanyList from './Containers/ExhibitionCompanyList'
import ExhibitionActivityList from './Containers/ExhibitionActivityList'
import OtherContainer from './Containers/OtherContainer'
import HomeContainers from './Containers/HomeContainers'
import DesignList from './Containers/DesignList'
import UserLoginPage from './Modules/User/UserLoginPage'
import UserRegisterPage from './Modules/User/UserRegisterPage'
var Dimensions = require('Dimensions');
/**
 * 界面对象 结束
 */

export default class AppRouter extends Component {
    render() {
        return (
            <Router>
                <Scene key="modal" modal hideNavBar>
                    <Scene key="root" hideNavBar titleStyle={{color: 'white'}}>
                        <Scene key="tabbar" gestureEnabled={false} tabs activeBackgroundColor='#ddd' initial>
                            <Scene key="home" component={HomeContainers} title="找展会" tabBarLabel="找展会" initial
                                   hideNavBar modal
                            />
                            <Scene key="exhibition" component={ExhibitionActivityList} tabBarLabel="活动" title="活动"
                            />
                            <Scene key="me" component={AboutMe} title="我的" tabBarLabel="我的"/>
                        </Scene>

                    </Scene>
                    <Scene key="login" titleStyle={{color: 'white'}} leftButtonImage={require('./images/back.png')}>
                        <Scene key="loginPage" component={UserLoginPage} title="" hideNavBar/>
                        <Scene key="registerPage" component={UserRegisterPage} title="注册" navTransparent
                               onLeft={Actions.pop}/>
                    </Scene>


                </Scene>

            </Router>

        );
    }
}
//navigationBarTitleImage navTransparent
const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
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
});


//https://github.com/yongqianvip/RN-ListViewLoadMore
