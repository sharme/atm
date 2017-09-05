import React, {Component} from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    ListView,
    TouchableHighlight,
    Image,
    Alert,
    TextInput,
    View
} from 'react-native';

var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var viewWidth = deviceWidth - 20;
var viewHeight = 36;

export default class SearchBarView extends Component {
    render() {
        return (
            <View style={styles.view}>
                <TouchableHighlight style={{
                    width: 70, height: viewHeight, alignItems: 'center',
                    justifyContent: 'center'
                }} onPress={()=>console.log()} activeOpacity={0.6} underlayColor={'transparent'}>
                    <View style={{
                        flexDirection: 'row', alignItems: 'center',
                        justifyContent: 'center'
                    }}>
                        <Text style={{
                            textAlign: 'center',
                            justifyContent: 'center',
                            color: '#696a6b'
                        }}>
                            上海市
                        </Text>
                        <Image source={require('../../images/down_icon_unselect.png')}
                               style={{width: 10, height: 6, justifyContent: 'center', marginLeft: 4,}}/>
                    </View>
                </TouchableHighlight>
                <View style={styles.line}/>
                <TextInput style={styles.input} placeholder="请输入关键字" underlineColorAndroid='transparent' placeholderTextColor="#adadad"/>
                <Image source={require('../../images/search_icon.png')}
                       style={{alignItems: 'flex-end', width: 16, height: 16,marginRight:8}}/>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    line: {
        height: viewHeight - 20,
        width: 1,
        backgroundColor: '#b2b2b2',
        marginTop: 2,
    },
    view: {
        height: viewHeight,
        width: viewWidth,
        flexDirection: 'row',
        position: 'absolute',
        top: 42,
        left: 10,
        justifyContent: 'center',
        alignItems: 'center',
        flex: 1,
        borderRadius: 2,
        backgroundColor: '#feffff',
    },
    input: {
        flex: 1,
        fontSize: 13,
        color: '#000000',
        marginLeft: 12,
    },
    address: {
        color: '#000000',
    }


});
