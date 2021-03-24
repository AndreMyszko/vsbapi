<template>

<div class="container bg-light">
    <h4>Users</h4>
    <RegisterUser />
    <hr>
    <TableUser />
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
