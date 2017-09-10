import React, { Component, PropTypes } from 'react';
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

import DeviceUtil from '../../Util/DeviceUtil'
import ColorUtils from '../../Util/ColorUtils'
import ViewLine from '../../Common/Components/ViewLine'



var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var deviceHeight = Dimensions.get('window').height;

export default class ExhibitionDetail extends Component {

    static navigationOptions = {
        title: '展会详情',


    }

    detailView() {
        return (
            <View style={styles.content}>
                <View style={{}}>
                    <Text style={{ height: 40, width: DeviceUtil.deviceWH.width - 20, marginTop: 20, fontSize: 18 }}>最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加</Text>
                    <Text style={{ height: 25, width: DeviceUtil.deviceWH.width - 20, marginTop: 10 }}>2017-09-08 13:00</Text>
                </View>
            </View>
        );
    }
    imageView() {
        return (
            <View style={styles.content}>
                <Image source={require('../../images/home_item_test.png')}  resizeMode='cover' style={
                    {width: DeviceUtil.deviceWH.width-20 ,height:90}
                }/>
                <Text style={{ width: DeviceUtil.deviceWH.width - 20, marginTop: 20, fontSize: 14 }}>最近的展会，北京很精彩，世界奢侈品展览，更多精彩欢迎参加</Text>

            </View>
        );
    }
    render() {
        return (
            <View style={{ flex: 1, backgroundColor: 'white' }}>
                {this.detailView()}
                <ViewLine lineStyle={{marginBottom:12}}/>
                {this.imageView()}
                
            </View>
        )
    }


}
const styles = StyleSheet.create({
    content: {
        alignItems: 'center',
        paddingLeft: 10,
        paddingRight: 10
    }
});

