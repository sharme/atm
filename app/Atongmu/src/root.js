'use strict';

import React from 'react'

// import { Provider } from 'react-redux'
import {Navigator} from 'react-native-deprecated-custom-components'
import App from './Containers/app.js'

class Root extends React.Component {
	render() {
		return (
				// <Navigator
				//     initialRoute={{ component: App }}
				//     configureScene={(route, routeStack) => {
				//         return Navigator.SceneConfigs.FloatFromRight;
				//     }}
				//     renderScene={(route, navigator) => {
				//     	let Component = route.component;
				//         return <Component {...route.params} navigator={navigator} />
				//     }} />
				<App/>
		);
	}
}
export default Root;
//https://github.com/yongqianvip/RN-ListViewLoadMore
