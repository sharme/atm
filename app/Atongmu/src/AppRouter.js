'use strict';

// import React from 'react'
import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
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
/**
 * 界面对象 结束
 */

 export default class AppRouter extends Component {
   render() {
     return (
       <Router>
          <Scene key="root" hideNavBar modal>
              <Scene key="tabbar" gestureEnabled={false} tabs activeBackgroundColor='#ddd' initial>
                   <Scene key="home" component={HomeContainers} title="找展会" tabBarLabel="找展会" initial/>
                   <Scene key="exhibition" component={ExhibitionActivityList} tabBarLabel="活动" title="活动"/>
                   <Scene key="me" component={AboutMe} title="我的" tabBarLabel="我的"/>
              </Scene>
              <Scene key="login" component={AboutMe} title="Login"/>
              <Scene key="register" component={OtherContainer} title="Register"/>
              <Scene key="home" component={OtherContainer}/>
          </Scene>
      </Router>

     );
   }
 }

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
