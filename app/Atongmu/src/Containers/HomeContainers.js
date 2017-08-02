/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  ListView,
  TouchableOpacity,
  Image,
  Alert,
  View
} from 'react-native';

import BannerImages from '../Common/Components/BannerImages'
import SearchBarView from '../Common/Components/SearchBarView'


var Dimensions = require('Dimensions');
var deviceWidth = Dimensions.get('window').width;

var IMGS = [
  'http://img.showguide.cn/uploads/try/1478743652EXPOPARTES1111.jpg',
  'http://h.hiphotos.baidu.com/image/h%3D220/sign=a67cd12f9582d158a4825eb3b00b19d5/aa18972bd40735fa91b8197897510fb30e2408a2.jpg',
  'http://img.showguide.cn/uploads/try/1478743652EXPOPARTES1111.jpg',
  'http://img.showguide.cn/uploads/try/1478743652EXPOPARTES1111.jpg',
];

export default class HomeContainers extends Component {
  // 初始化模拟数据
  constructor(props) {
    super(props);
    const ds = new ListView.DataSource({rowHasChanged: (r1, r2) => r1 !== r2});
    this.state = {
      dataSource: ds.cloneWithRows([
        'John', 'Joel', 'James', 'Jimmy', 'Jackson', 'Jillian', 'Julie', 'Devin'
      ]),
    };
  }
  _renderRow(rowData: string,sectionID: number, rowID: number) {
    return (
        <TouchableOpacity>
          <View>
            <View style={styles.row}>
              <Text style={{fontSize:16,color:'blue'}}>
                {rowData + '我是测试行号哦~'}
              </Text>
            </View>
          </View>
        </TouchableOpacity>
    );
  }

  render() {
    return (
      <View style={styles.container}>

          <BannerImages images = {IMGS} itemClick = {(key) => Alert.alert(
            'Alert Title',
            key,
          )}/>
          <SearchBarView/>
          <ListView
            style = {styles.listView}
            dataSource={this.state.dataSource}
            renderRow={this._renderRow}
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
    width:Dimensions.get('window').width,
  },
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
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
  banner: {
    width: deviceWidth,
    height: 100,
  },
});
