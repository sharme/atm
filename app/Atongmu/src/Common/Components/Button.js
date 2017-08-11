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
        if (this.props.title != null && this.props.title.length > 0) {
            return <Text style={this.props.textStyle}>{this.props.title}</Text>;
        } else {
            return <View/>;
        }
    }

    buttonText() {

        if (this.props.source != null) {
            var buttonImage = [];
            buttonImage.push(<Image source={this.props.source} style={this.props.imageStyle} key="myButtonImage">
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
                                underlayColor={'transparent'} onPress={this.props.onPress} key="myButton">
                <View style={[this.props.contentViewStyle, {flex: 1,alignItems: 'center',
                    justifyContent: 'center'}]}>
                    {this.buttonText()}
                </View>
            </TouchableHighlight>
        );
    }
}