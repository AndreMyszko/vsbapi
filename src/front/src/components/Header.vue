<template>

    <nav class="navbar fixed-top navbar-expand-lg navbar-light bg-light">
      <div class="container">
        <a class="navbar-brand" href="#"><h3>{{title}}</h3></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link" href="#">
                <b-icon icon="house-fill"></b-icon>
                Home
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">
                <b-icon icon="people-fill"></b-icon>
                Users
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">
                <b-icon icon="graph-up"></b-icon>
                Graphics
              </a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

</template>

<script>
export default {
    name: 'Header',
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