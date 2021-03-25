import Vue from 'vue'
import App from './App.vue'
//import DataTable from 'primevue/datatable'
//import Column from 'primevue/column'

// import VueRouter from 'vue-router'
// import Home from './views/Home.vue'
// import User from './views/User.vue'


// Vue.use(VueRouter);
// const routes = [
//   {path: '/', component:Home},
//   {path: '/users', component:User},
// ]

Vue.config.productionTip = false

//Vue.component('DataTable', DataTable);
//Vue.component('Column', Column);

new Vue({
  // router:routes,
  render: h => h(App),
}).$mount('#app')


