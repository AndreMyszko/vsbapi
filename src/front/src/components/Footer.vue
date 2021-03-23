<template>
    <footer class="footer fixed-bottom py-2 bg-light">
        <div class="container">
            <p class="navbar-brand ml-4 mt-0 mb-0" href="#">{{title}} © (2021) by Visual Studio Spring Boot S.A</p>
        </div>
    </footer>
</template>

<script>
export default {
    name: 'Footer',
    data(){
    return {
      title: ''
    }
  },
  mounted() {
    fetch("/api/home") 
      .then((response) => response.text())
      .then((data) => {
        this.title = data;
      })
  }

}
</script>

<style scoped>

</style>