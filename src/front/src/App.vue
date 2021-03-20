<template>
  <div id="app">

    <Header />
    <Home />
    <TableUser />

    <router-view/>    
      
  </div>
</template>

<script>
import Header from './components/Header'
import Home from './components/Home.vue'
import TableUser from './components/TableUser'

export default {
  name: 'App',
  components: {
    Header,
    Home,
    TableUser
  }
}
</script>

<!--
<style>
#app {
}
</style>
-->
