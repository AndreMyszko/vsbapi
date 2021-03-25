<template>

<div class="container bg-light mb-2 pt-3">
    <h4>
        <b-icon icon="people-fill"></b-icon>
        Users
    </h4>
    <hr>
    <RegisterUser />
    <hr>
    <TableUser />
    <br>
</div>

</template>

<script>

import TableUser from '../components/TableUser'
import RegisterUser from '../components/RegisterUser'
export default {
  name: 'Home',
  components: {
      TableUser,
      RegisterUser
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->

<style scoped>
    .container{
        border-radius: 12px;
    }
</style>
