<template>
  <div id="app">

    <Header />
    <Home />
    <TableUser />
    <Footer />

    <!--<router-view/>-->    
      
  </div>
</template>

<script>
import Header from './components/Header'
import Home from './components/Home.vue'
import Footer from './components/Footer.vue'
import TableUser from './components/TableUser'

export default {
  name: 'App',
  components: {
    Header,
    Home,
    Footer,
    TableUser
  }

}
</script>

<!-- GENERAL CSS, NOT SCOPED
<style>
#app {
}
</style>
-->
