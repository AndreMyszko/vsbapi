<template>

<div class="container bg-light mb-2 pt-3">
  

  <h4>
    <b-icon icon="house-fill"></b-icon>
    Home
  </h4>
  <hr>
  <h5>{{title}}</h5>
  <p>Home page acessível à todos os usuários, tela para cadastro e login....</p>
  <br>
</div>

</template>

<script>
export default {
  name: 'Home',
  data(){
    return {
      title: ''
    }
  },
  mounted() {
    fetch("api/home") 
      .then((response) => response.text())
      .then((data) => {
        this.title = data;
      })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    .container{
        border-radius: 12px;
    }
</style>
