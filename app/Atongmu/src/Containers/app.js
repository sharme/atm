import React from 'react';
import {
  View,
  Text
} from 'react-native';
// import { connect } from 'react-redux'

import HomeContainers from './HomeContainers'
import OtherContainer from './OtherContainer'
import TabNavigator from 'react-native-tab-navigator'
import Icon from 'react-native-vector-icons/Ionicons';
import {
  Navigator
} from 'react-native-deprecated-custom-components'

class App extends React.Component {
    constructor(props) {
      super(props);

      this.state = {
        selectedTab: 'home'
      };
    }

    render() {

        return ( <
            TabNavigator tabBarStyle = {
              {
                backgroundColor: 'white'
              }
            }
            style = {
              {
                backgroundColor: 'white'
              }
            } >
            <
            TabNavigator.Item title = "Home"
            selected = {
              this.state.selectedTab === 'home'
            }
            renderIcon = {
              () => < Icon name = {
                'ios-home'
              }
              size = {
                30
              }
              color = {
                'gray'
              }
              />}
              renderSelectedIcon = {
                () => < Icon name = {
                  'ios-home'
                }
                size = {
                  30
                }
                color = {
                  '#4E78E7'
                }
                />}
                onPress = {
                  () => this.setState({
                    selectedTab: 'home'
                  })
                } >
                <
                HomeContainers { ...this.props
                }
                navigator / >

                <
                /TabNavigator.Item>

                <
                TabNavigator.Item
                title = "Other"
                selected = {
                  this.state.selectedTab === 'other'
                }
                renderIcon = {
                  () => < Icon name = {
                    'ios-more'
                  }
                  size = {
                    30
                  }
                  color = {
                    'gray'
                  }
                  />}
                  renderSelectedIcon = {
                    () => < Icon name = {
                      'ios-more'
                    }
                    size = {
                      30
                    }
                    color = {
                      '#4E78E7'
                    }
                    />}
                    onPress = {
                      () => this.setState({
                        selectedTab: 'other'
                      })
                    } >
                    <
                    OtherContainer { ...this.props
                    }
                    /> < /
                    TabNavigator.Item > <
                    /TabNavigator>
                  );
                }

              }

              export default App;
