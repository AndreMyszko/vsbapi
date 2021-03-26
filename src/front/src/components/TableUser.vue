<template>

  <div>
    <h5>All Users</h5>
    <template>
      <div>
        <b-table striped hover :items="items" :fields="fields" ></b-table>
      </div>
    </template>
 </div>

</template>


<script>
import UserService from '../service/UserService';
export default {
    name: 'TableUser',
    data(){
      return{

        fields: ['ID', 'nome', 'email', 'role', 'senha', 'ativo'],
        items: [
          {
            ID: 1, 
            nome: 'Andre', 
            email: 'email@email.com', 
            role: 'admin', 
            senha: '123',
            ativo: true
          },
          {
            ID: 2, 
            nome: 'Mithrandir', 
            email: 'email@email.com', 
            role: 'admin', 
            senha: '321',
            ativo: true
          },
          {
            ID: 3, 
            nome: 'Palpatine', 
            email: 'email@email.com', 
            role: 'user', 
            senha: '555',
            ativo: false
          }
        ]
      }
    },
    userService : null,

    created(){
      this.userService = new UserService();
    },

    mounted(){
      this.userService.getAll().then(data => {
        this.userService = data.data;

        
        console.log(this.userService);

        //??????????????????????????????????

      })
    }
}
</script>

<style scoped>

.btn{
  border-radius: 12px;
}

</style>