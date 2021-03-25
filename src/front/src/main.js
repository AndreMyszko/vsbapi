import Vue from 'vue'
import Vuex from 'vuex'
import App from './App.vue'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.use(Vuex)
Vue.use(BootstrapVue)
Vue.use(IconsPlugin)

// ***TABLES AND COLUMNS***
// import PrimeVue from '../node_modules/primevue/config';
// import DataTable from '../node_modules/primevue/datatable';
// import DropDown from '../node_modules/primevue/dropdown'
// import Column from '../node_modules/primevue/column';

// Vue.use(PrimeVue);
// Vue.component('DataTable', DataTable);
// Vue.component('Column', Column);
// Vue.component('DropDown', DropDown);


// ***ROUTER***
// import VueRouter from 'vue-router'
// import Home from './views/Home.vue'
// import User from './views/User.vue'

// Vue.use(VueRouter);
// const routes = [
//   {path: '/', component:Home},
//   {path: '/users', component:User},
// ]


Vue.config.productionTip = false


new Vue({
  //router:routes,
  render: h => h(App),
}).$mount('#app')


