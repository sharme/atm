import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  SectionList,
  Alert,
  Image,
  TouchableHighlight,
  TouchableOpacity,
  View
} from 'react-native';

import TabBarItem from '../Common/Components/TabBarItem'
import Button from '../Common/Components/Button'
import DeviceUtil from '../Util/DeviceUtil'

var deviceWidth = DeviceUtil.deviceWH.width;
var topHeight = 134;
var topContentMarginTop=22;

export default class AboutMe extends Component {

  static navigationOptions = {
    tabBarLabel:'我的',  
    header: false , // 覆盖预设中的此项
    tabBarIcon:({focused,tintColor}) => (  
      <TabBarItem  
        tintColor={tintColor}  
        focused={focused}  
        normalImage={require('../images/me_tab_unselect.png')}  
        selectedImage={require('../images/me_tab_select.png')}  
      />  
    ),
  }

  // 初始化模拟数据
  constructor(props) {
    super(props);
    this.state = {
      dataSource: [{key:'k1',data:[{title:'我的报名',icon:require('../images/me/me_item_activity.png')}, {title:'我的关注',icon:require('../images/me/me_item_focus.png')}]}, {key:'k2',data:[{title:'设置',icon:require('../images/me/me_item_set.png')}]}, {key:'k3',data:[{title:'退出',icon:require('../images/me/me_item_eixt.png')}]}
      ]
    }
  }
  _renderRow(rowData: string,sectionID: number, rowID: number) {
    return (
        <TouchableOpacity>
          <View>
            <View style={styles.row}>
              <Text style={{fontSize:16,color:'blue'}}>
                {'> ' + rowData}
              </Text>
            </View>
          </View>
        </TouchableOpacity>
    );
  }
  topView(){
    return (<View style={{width:deviceWidth,height:topHeight}}>
      <Image source={require('../images/me/me_top_bg.png')} resizeMode='stretch' style={{position: 'absolute',width:deviceWidth,height:topHeight}}/>
      <View style={{flexDirection:'row',alignItems:'center',width:deviceWidth,height:topHeight}}>
        <Image source={require('../images/me/demo_head.jpg')} style={{marginLeft:20,width:60,height:60,borderRadius: 30,marginTop:topContentMarginTop,}}/>
        <Text style={{marginTop:topContentMarginTop,marginLeft:10,backgroundColor:'transparent',color:'white',fontSize:16,}}>
          一道美丽的风景
        </Text>
        <Button keyId='edit' onPress={(str)=>this.props.navigation.navigate('Login',{ transition: 'forVertical' })} source={require('../images/me/me_white_edit.png')} buttonStyle={{width:100,height:50,marginTop:topContentMarginTop}} imageStyle={{width:20,height:15,marginRight:70}}/>
      </View>
    </View>);
  }
  _renderItemComponent (item,section){  
    console.log(item);  
    
    return(  
      <TouchableHighlight activeOpacity={0.6}
      underlayColor={'transparent'} onPress={()=>Alert.alert(
                                            'Alert Title',
                                            item.index+"-index",
                                        )} key={item.index+"1"}>
      <View style={{flexDirection:'row',backgroundColor:'white',height:44,alignItems:'center'}} key={item.index+"3"}>  
        <Image source={item.item.icon} style={{width:25,height:25,marginLeft:10}} resizeMode='stretch'/>
        <Text style={{marginLeft:20,color:'#333435',width:deviceWidth-80}}>{item.item.title}</Text>  
        <Image source={require('../images/list_right.png')} style={{width:10,height:15}} resizeMode='stretch'/>
      </View>  
      </TouchableHighlight>
    );  
  }  
  _sectionHeader(section){  
    return(  
      <View style={{height:10,width:deviceWidth,backgroundColor:'transparent'}}>  
      </View>  
    );  
  }  
  _extraUniqueKey(item ,index){
    return "index"+index+item;
} 
  render() {
    return (
      <View style={styles.container}>
        {this.topView()}
        <SectionList  
        key={'sectionKey'}
        renderItem={this._renderItemComponent}  
        renderSectionHeader={this._sectionHeader}  
        ItemSeparatorComponent={() => <View key='itemSep' style={{backgroundColor:'#e4e5e6',height:0.5,width:deviceWidth}}/>}
        sections={this.state.dataSource}  
        keyExtractor = {this._extraUniqueKey}// 每个item的key
      />  

      </View>
    );
  }
}

const styles = StyleSheet.create({
  row: {
    flexDirection: 'row',
    justifyContent: 'center',
    padding: 10,
    height:44,
    backgroundColor: '#F6F6F6',
  },
  listView:{
    flex:1,
    width:deviceWidth,
  },
  container: {
    flex: 1,
    // justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#edf0ff',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});
