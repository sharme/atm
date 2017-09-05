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
    Alert,
} from 'react-native';
import {
    DrawerNavigator
 } from 'react-navigation';

 var Dimensions = require('Dimensions');
 var deviceWidth = Dimensions.get('window').width;
 var deviceHeight = Dimensions.get('window').height;

 export default class ExhibitionDetail extends Component {
    
        static navigationOptions = {
            header: false , // 覆盖预设中的此项
            tabBarLabel:'首页',  
            tabBarIcon:({focused,tintColor}) => (  
              <TabBarItem  
                tintColor={tintColor}  
                focused={focused}  
                normalImage={require('../images/home_tab_unselect.png')}  
                selectedImage={require('../images/home_tab_select.png')}  
              />  
            ),
              
        }
    }
 
