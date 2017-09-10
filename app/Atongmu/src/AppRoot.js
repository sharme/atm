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
import { StackNavigator, TabNavigator } from 'react-navigation';
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
import ExhibitionDetail from './Modules/Exhibition/ExhibitionDetail'
import CardStackStyleInterpolator from 'react-navigation/src/views/CardStackStyleInterpolator';
const TransitionConfiguration = () => ({
  screenInterpolator: (sceneProps) => {
    const { scene } = sceneProps;
    const { route } = scene;
    const params = route.params || {};
    const transition = params.transition || 'forHorizontal';
    return CardStackStyleInterpolator[transition](sceneProps);
  },
});

const TabContainer = TabNavigator(
    {
      Main: { screen: HomeContainers},
      Exhibition: { screen: ExhibitionActivityList },
      About: { screen: AboutMe }
    },
    {
      lazy: true,
      tabBarPosition: 'bottom',
      tabBarOptions: {
        activeTintColor: '#3e9ce9',
        inactiveTintColor: '#999999',
        showIcon: true,
        style: {
          backgroundColor: '#fff'
        },
        indicatorStyle: {
          opacity: 0
        },
        tabStyle: {
          padding: 0
        }
      }
    }
  );
  
  const AppRoot = StackNavigator(
    {
        Home: {
            screen: TabContainer,
            navigationOptions: {
              headerLeft: null
            }
          },
      Login: { screen: UserLoginPage },
      ExDetail:{screen: ExhibitionDetail},
      Register: { screen: UserRegisterPage }
    },
    {
      headerMode: 'screen',
      navigationOptions: {
        headerStyle: {
          backgroundColor: '#3e9ce9'
        },
        headerTitleStyle: {
          color: '#fff',
          fontSize: 20
        },
        headerTintColor: '#fff'
      },
      transitionConfig: TransitionConfiguration
    }
  );
  
  export default AppRoot;