<template>
  <div id="app">

    <Header />
    <br><br><br>
    <Home />
    <User />
    <Admin />
    <br><br><br>
    <Footer />
  
  </div>
</template>

<script>
import Header from './components/Header'
import Home from './views/Home'
import User from './views/User'
import Admin from './views/Admin'
import Footer from './components/Footer'

export default {
  name: 'App',
  components: {
    Header,
    Home,
    User,
    Admin,
    Footer
  }

}
</script>

<!-- GENERAL CSS, NOT SCOPED -->
<style>
#app {
  opacity: 95%;
}
</style>

