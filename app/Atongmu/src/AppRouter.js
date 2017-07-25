'use strict';

import React from 'react'

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

// class Root extends React.Component {
// 	render() {
// 		return (
// 				// <Navigator
// 				//     initialRoute={{ component: App }}
// 				//     configureScene={(route, routeStack) => {
// 				//         return Navigator.SceneConfigs.FloatFromRight;
// 				//     }}
// 				//     renderScene={(route, navigator) => {
// 				//     	let Component = route.component;
// 				//         return <Component {...route.params} navigator={navigator} />
// 				//     }} />
// 				// <App/>
// 		);
// 	}
// }
// export default Root;
const AppRouter = () =>(
  <Router>
    <Scene key="lightbox" lightbox leftButtonTextStyle={{color: 'green'}} backButtonTextStyle={{color: 'red'}}>
      <Scene key="modal" modal hideNavBar>
          <Scene key="tabbar"
             gestureEnabled={false}
             tabs
             activeBackgroundColor='#ddd'
             initial
            >
                <Scene key="home" component={HomeContainers} title="主页" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
                <Scene key="exhibition" component={ExhibitionActivityList} title="展会" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
                <Scene key="design" component={DesignList} title="设计师" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
                <Scene key="me" component={AboutMe} title="我的" icon={< Icon name = {'ios-home'} size = {30} color = {'gray'}/>}/>
          </Scene>
          <Scene key="other" component={OtherContainer}/>
      </Scene>
    </Scene>
  </Router>
);
export default AppRouter;

//https://github.com/yongqianvip/RN-ListViewLoadMore
