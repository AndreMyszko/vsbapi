<template>

<div class="container bg-light">
  <h4>Home</h4>
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
