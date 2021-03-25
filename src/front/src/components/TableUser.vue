<template>

  <div>
    <h5>All Users</h5>
 
  <!-- <form class=" col-md-6 d-flex mb-2">
    <input class="form-control me-2" type="search" placeholder="Buscar usuários" aria-label="Search">
    <button class="btn bg-dark text-light ml-2" type="submit">Pesquisar</button>
  </form>
  <table class="table">
    <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Role</th>
        <th scope="col">Active</th>
        <th scope="col">Editar</th>
        <th scope="col">Excluir</th>
      </tr>
    </thead>

    <tbody>
      <tr>
        <th scope="row">1</th>
        <td>Andre Myszko</td>
        <td>email@email.com</td>
        <td>admin</td>
        <td>true</td>
        <td><button type="submit" class="btn bg-primary text-light"> > </button></td>
        <td><button type="submit" class="btn bg-danger text-light"> X </button></td>
      </tr>
    </tbody>
  </table> -->
 </div>
</template>

<script>

import UserService from '../service/UserService';

export default {
    name: 'TableUser',
    data(){
      return{
        users : null
      }
    },
    userService : null,
    created(){
      this.userService = new UserService();
    },
    mounted(){
      this.userService.getAll().then(data => {
        console.log(data);
      })
    }
}
</script>

<style scoped>

.btn{
  border-radius: 12px;
}

</style>

<!--Apenas mais linhas comentadas da teblea para testes, pode ser excluido... -->
    <!-- <tbody>
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
      </tbody> -->
