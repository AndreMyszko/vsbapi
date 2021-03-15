<template>
<h1>{{title}}</h1>
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
<!--
<style scoped>
</style>
-->
