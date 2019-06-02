import Vue from 'vue'
import App from './App.vue'
import './plugins/axios'
import router from './router'
import store from './store'
import './plugins/element.js'

Vue.config.productionTip = false
import axios from 'axios'
Vue.prototype.$http = axios.create({
  baseURL: 'http://localhost:8080'
})

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
