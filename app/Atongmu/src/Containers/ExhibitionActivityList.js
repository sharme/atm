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
  TouchableOpacity,
  View
} from 'react-native';

var Dimensions = require('Dimensions');

export default class ExhibitionActivityList extends Component {
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
        <TouchableOpacity>
          <View>
            <View style={styles.row}>
              <Text style={{fontSize:16,color:'blue'}}>
                {rowData}
              </Text>
            </View>
          </View>
        </TouchableOpacity>
    );
  }
  render() {
    return (
      <View style={styles.container}>

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
});
