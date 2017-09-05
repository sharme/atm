/**
 * Created by zhiyuli on 2017/09/05.
 */
import React, { Component } from 'react';
import {
    AppRegistry,
    Alert,
    View
} from 'react-native';

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var deviceHeight = Dimensions.get('window').height;
const DeviceUtil = {
    deviceWH:()=>{
        var dwh = {width:deviceWidth,height:deviceHeight};
        return dwh
    },

}

export default DeviceUtil;