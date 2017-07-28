'use strict';

// import React from 'react'
import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';


// import { Provider } from 'react-redux'
import {Navigator} from 'react-native-deprecated-custom-components'
import App from './Containers/app'
import {
  Scene,
  Router,
  Actions,
  Reducer,
  ActionConst,
} from 'react-native-router-flux';

import Button from 'react-native-button';

import Icon from 'react-native-vector-icons/Ionicons';

/**
 * 界面对象 开始
 */
import AboutMe from './Containers/AboutMe'
import ExhibitionCompanyList from './Containers/ExhibitionCompanyList'
import ExhibitionActivityList from './Containers/ExhibitionActivityList'
import OtherContainer from './Containers/OtherContainer'
import HomeContainers from './Containers/HomeContainers'
import DesignList from './Containers/DesignList'
/**
 * 界面对象 结束
 */

 export default class AppRouter extends Component {
   render() {
     return (
         <Router>
           <Scene key="lightbox" lightbox leftButtonTextStyle={{color: 'green'}} backButtonTextStyle={{color: 'red'}}>
             <Scene key="modal" modal hideNavBar>
                 <Scene key="tabbar" gestureEnabled={false} tabs activeBackgroundColor='#ddd' initial>
                       <Scene key="home" component={HomeContainers} title="主页" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
                       <Scene key="exhibition" component={ExhibitionActivityList} title="展会" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
                       <Scene key="design" component={DesignList} title="设计师" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
                       <Scene key="me" component={AboutMe} title="我的" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
                 </Scene>
                 <Scene key="other" component={OtherContainer}/>
             </Scene>
           </Scene>
         </Router>
      //  <View style={styles.container}>
      //    <Text style={styles.welcome}>
      //      Other
      //    </Text>
      //    <Text style={styles.instructions}>
      //      To get started, edit index.ios.js
      //    </Text>
      //    <Text style={styles.instructions}>
      //      Press Cmd+R to reload,{'\n'}
      //      Cmd+D or shake for dev menu
      //    </Text>
      //  </View>
     );
   }
 }

 const styles = StyleSheet.create({
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
// export default Root;
// const AppRouter = () =>(
//   <Router>
//     <Scene key="lightbox" lightbox leftButtonTextStyle={{color: 'green'}} backButtonTextStyle={{color: 'red'}}>
//       <Scene key="modal" modal hideNavBar>
//           <Scene key="tabbar"
//              gestureEnabled={false}
//              tabs
//              activeBackgroundColor='#ddd'
//              initial
//             >
//                 <Scene key="home" component={HomeContainers} title="主页" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
//                 <Scene key="exhibition" component={ExhibitionActivityList} title="展会" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
//                 <Scene key="design" component={DesignList} title="设计师" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
//                 <Scene key="me" component={AboutMe} title="我的" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
//           </Scene>
//           <Scene key="other" component={OtherContainer}/>
//       </Scene>
//     </Scene>
//   </Router>
// );
// export default AppRouter;

//https://github.com/yongqianvip/RN-ListViewLoadMore
