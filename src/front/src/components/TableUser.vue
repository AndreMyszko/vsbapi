<template>

<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Role</th>
      <th scope="col">Active</th>
    </tr>
  </thead>

  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Andre Myszko</td>
      <td>email@email.com</td>
      <td>admin</td>
      <td>true</td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <th scope="row">2</th>
      <td>Mithrandir</td>
      <td>email@email.com</td>
      <td>admin</td>
      <td>true</td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <th scope="row">3</th>
      <td>Tarkûn</td>
      <td>email@email.com</td>
      <td>user</td>
      <td>false</td>
    </tr>
  </tbody>
    <tbody>
        <tr>
        <th scope="row">4</th>
        <td>Olórin</td>
        <td>email@email.com</td>
        <td>user</td>
        <td>true</td>
        </tr>
    </tbody>
    <tbody>
        <tr>
        <th scope="row">5</th>
        <td>Incánus</td>
        <td>email@email.com</td>
        <td>user</td>
        <td>true</td>
        </tr>
    </tbody>
    <tbody>
        <tr>
        <th scope="row">6</th>
        <td>Gandalf</td>
        <td>email@email.com</td>
        <td>user</td>
        <td>true</td>
        </tr>
    </tbody>
</table>

</template>

<script>
export default {
    name: 'TableUser'
}
</script>

<style scoped>

</style>