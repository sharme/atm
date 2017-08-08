import React, { Component } from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    TouchableOpacity,
    Image,
    View
} from 'react-native';

/**
 * 自定义按钮
 */
export default class Button extends Component{
    constructor(props) {
        super(props);

    }
    buttonImage(){
        var buttonImageView = [];
        buttonImageView.push(
        <TouchableOpacity>
            <Image source={this.props.source} style={this.props.buttonStyle}>
                {this.buttonText()}
            </Image>
        </TouchableOpacity>);
        return buttonImageView;
    }
    buttonText(){
        if(this.props.title != null && this.props.title.length > 0){
            return <Text style={this.props.textStyle}>{this.props.title}</Text>;
        }else{
            return <View/>;
        }
    }
    render() {
        return (
        <View>
            {this.buttonImage()}

        </View>);
    }
}