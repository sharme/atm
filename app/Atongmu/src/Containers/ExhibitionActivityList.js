/**
*展会活动列表
Lewin
*/
import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  ListView,
  Image,
  Alert,
  TouchableOpacity,
  View
} from 'react-native';

import TabBarItem from '../Common/Components/TabBarItem'
import HeaderTitleButton from '../Common/Components/HeaderTitleButton'
import ActivityItemCell from '../Common/Components/ActivityItemCell'
import Button from '../Common/Components/Button'


var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;
var navBarHeight = (110/667)*Dimensions.get('window').height;

var menuHeight = 80;
var menuWidth = deviceWidth-40;
var menuItemW = menuWidth/3.0;

export default class ExhibitionActivityList extends Component {
  static navigationOptions = {
    header:false,
    tabBarLabel:'活动',  
    tabBarIcon:({focused,tintColor}) => (  
      <TabBarItem  
        tintColor={tintColor}  
        focused={focused}  
        normalImage={require('../images/activity_tab_unselect.png')}  
        selectedImage={require('../images/activity_tab_select.png')}  
      />  
    ),
  }
  // 初始化模拟数据
  constructor(props) {
    super(props);
    const ds = new ListView.DataSource({rowHasChanged: (r1, r2) => r1 !== r2});
    this.state = {
      dataSource: ds.cloneWithRows([
        '展会列表1---展会活动', '展会列表---展会活动', '北京展会', '上海展会', '广州展会', '深圳展会', '哈哈哈', '你话好多疯狂减肥还是的空间划分空间上的空间发挥科技'
      ])
    };
  }
  _renderRow(rowData: string,sectionID: number, rowID: number) {
    return (
      <ActivityItemCell dataSource={rowData}  onPressHandler={(str)=>Alert.alert(
                'Alert Title',
                str,
            )}/>
    );
  }

  /*
  *顶部菜单
  */
  menuItemView(){
    var itemDataSource=[
      {icon:require('../images/activity/activity_menu_my.png'),title:'我的活动'},
      {icon:require('../images/activity/activity_menu_line.png'),title:'线下'},
      {icon:require('../images/activity/activity_menu_sign.png'),title:'签到赢奖'},
      {icon:require('../images/activity/activity_menu_other.png'),title:'其他'}
    ];
    menuItemW = menuWidth/itemDataSource.length;
    var itemViews = [];
    for(var i = 0; i < itemDataSource.length; i++){  
      var titleStr = itemDataSource[i].title;
      var icon = itemDataSource[i].icon;
      var keyStr = 'menuItem'+i;
      itemViews.push(<Button key={keyStr} keyId={keyStr} onPress={(str)=>Alert.alert(
        'Alert Title',
        str,
    )} title={titleStr} iconSource={icon} iconStyle={{width:40,height:40,marginBottom:6}} textStyle={{color:'#333435',fontSize:14,}}  buttonStyle={{height:menuHeight,width:menuItemW}}/>);  
    }  
    return itemViews;
  }

  render() {
    return (
      <View style={styles.container}>
        <Image source={require('../images/activity_nav_background.png')} style={{width:deviceWidth,height:navBarHeight}} resizeMode='stretch'/>
       <View style={styles.menuView}>
         {this.menuItemView()}
       </View>
       <HeaderTitleButton  title={'近期活动'} buttonTitle={'查看全部'} onPressHandler={(str)=>Alert.alert(
                                            'Alert Title',
                                            str,
                                        )} viewStyle={{marginTop:24,}}/>
        <ListView
          style = {styles.listView}
          dataSource={this.state.dataSource}
          removeClippedSubviews={false}
          renderRow={this._renderRow}
        />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  
  listView:{
    flex:1,
    width:Dimensions.get('window').width,
  },
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#FFF',
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
  menuView:{
    flexDirection:'row',
    width:menuWidth,
    height:menuHeight,
    marginTop:-35,
    backgroundColor:'#fff',
    borderColor: '#dddddd',
    borderRadius: 8,
    borderWidth:1,
    shadowColor:'#dddddd',
    shadowOffset:{h:5,w:5},
    shadowRadius:8,
    shadowOpacity:0.9,
  }
});
