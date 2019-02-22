// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import App from './App';
import router from './router';

import '../node_modules/jquery/dist/jquery'
import '../node_modules/popper.js/dist/popper'
import '../node_modules/bootstrap/dist/js/bootstrap'

import '../node_modules/bootstrap/dist/css/bootstrap.css'
import './assets/css/custom.css'


Vue.config.productionTip = false;

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: {App},
  template: '<App/>'
})