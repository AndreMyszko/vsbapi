<template>
<h1>{{title}}</h1>
</template>

<script>
export default {
  name: 'Test',
  data(){
    return {
      title: ''
    }
  },
  mounted() {
    fetch("api/test") 
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
