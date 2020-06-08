import {NativeModules} from 'react-native';

const {ToastExample} = NativeModules;

const ENUM = [ToastExample.SHORT, ToastExample.LONG];

module.exports = {
  show: function (message, key) {
    if (typeof message === 'string' && ENUM.indexOf(key) > -1) {
      return ToastExample.show(message, key);
    }
  },
};
