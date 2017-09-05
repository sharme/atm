import React, {Component} from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    TouchableHighlight,
    Image,
    View
} from 'react-native';

/**
 * 自定义按钮
 */
export default class Button extends Component {
    constructor(props) {
        super(props);
    }
    textView() {
        var buttonText = [];
        if(this.props.iconSource !== null){
            buttonText.push(<Image source={this.props.iconSource} resizeMode="contain" style={this.props.iconStyle} key="myButtonImageIcon"/>);
        }if (this.props.title != null && this.props.title.length > 0) {
            buttonText.push(<Text style={this.props.textStyle} key="myButtonTitle">{this.props.title}</Text>);
        } else {
            buttonText.push(<View key="myButtonNullText"/>);
        }
        
        return buttonText;
    }

    buttonText() {

        if (this.props.source != null) {
            var buttonImage = [];
            buttonImage.push(<Image source={this.props.source} style={this.props.imageStyle}  resizeMode="contain" key="myButtonImage">
                {this.textView()}
            </Image>);
            return buttonImage;
        } else {
            return this.textView();
        }
    }

    render() {
        return (
            <TouchableHighlight style={this.props.buttonStyle} activeOpacity={0.8}
                                underlayColor={'transparent'} onPress={()=>this.props.onPress(this.props.keyId)} key={this.props.keyId}>
                <View style={[this.props.contentViewStyle, {flex:1,alignItems: 'center',
                    justifyContent: 'center'}]}>
                    {this.buttonText()}
                </View>
            </TouchableHighlight>
        );
    }
}