
import React, {Component} from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    ListView,
    RefreshControl,
    TouchableHighlight,
    Image,
    Alert,
    View
} from 'react-native';

import Button from './Button'

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;

const HeaderTitleButton = ({ title, buttonTitle, onPressHandler,viewStyle }) =>
(
    <View>
    <View style={[{
        height: 35,
        width: deviceWidth,
        flexDirection: 'row',
        backgroundColor: 'white',
        marginTop: 10,
        // justifyContent: 'center',
        alignItems: 'center',
    },viewStyle]}>
        <View style={{
            height: 15,
            width: 3,
            marginLeft: 8,
            backgroundColor: '#0c83fe',

        }}/>
        <Text style={{
            width: deviceWidth - 96, marginLeft: 8, justifyContent: 'center',
            alignItems: 'center',fontSize:15,
        }}>
            {title}
        </Text>
        <Button title={buttonTitle} buttonStyle={{alignItems: 'flex-end', height: 40, justifyContent: 'flex-end'}}
                onPress={() => onPressHandler(title)} textStyle={{color: '#b5b6b7'}}/>

    </View>
    <View style={{width: deviceWidth, height: 0.7, backgroundColor: '#e4e5e6'}}/>
</View>
)

export default HeaderTitleButton;