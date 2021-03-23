<template>
    <footer class="footer fixed-bottom mt-auto py-3 bg-light">
        <div>
            <p class="navbar-brand ml-4" href="#">{{title}}</p>
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