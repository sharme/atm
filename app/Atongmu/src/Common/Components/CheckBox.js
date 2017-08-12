'use strict';

import React from 'react';
import {
  View,
  Text,
  StyleSheet,
  Image,
  TouchableHighlight
} from "react-native"

 
export default class CheckBox extends React.Component{


    render() {
        return (
            <TouchableHighlight style={this.props.buttonStyle} activeOpacity={0.8}
                                underlayColor={'transparent'} onPress={this.props.onPress} key="myButton">
                <View style={[this.props.contentViewStyle, {flex: 1,alignItems: 'center',
                    justifyContent: 'center'}]}>
                    {this.buttonText()}
                </View>
            </TouchableHighlight>
        );
    }
}
var styles = StyleSheet.create({
  container: {
    flexDirection: 'row',
    alignItems: 'center',
    marginBottom: 5,
  },

});