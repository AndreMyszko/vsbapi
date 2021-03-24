<template>
<div>
    <h5>New User</h5>

    <form class="row g-3">
    <div class="col-12">
        <input type="text" class="form-control" id="inputAddress" placeholder="nome">
    </div>

    <div class="col-md-6">
        <input type="email" class="form-control" id="inputEmail4" placeholder="email">
    </div>
    <div class="col-md-6">
        <input type="password" class="form-control" id="inputPassword4" placeholder="senha">
    </div>


    <div class="col-md-12">
    <fieldset class="row mb-3">
        <div class="col-sm-10 col-md-6">
            <legend class="col-form-label col-sm-2 pt-0">Role:</legend>

            <div class="form-check">
                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
                <label class="form-check-label" for="gridRadios1">User</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
                <label class="form-check-label" for="gridRadios2">Admin</label>
            </div>
        </div>
        
        <div class="col-sm-10 col-md-6">
            <legend class="col-form-label col-sm-2 pt-0">Status:</legend>

            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="autoSizingCheck">
                <label class="form-check-label" for="autoSizingCheck">Ativo</label>
            </div>
        </div>

    </fieldset>
    </div>


    <div class="col-12">
        <button type="submit" class="btn bg-dark">Registrar</button>
    </div>

    </form>




</div>
</template>

<script>
export default {
    name: 'RegisterUser'
}
</script>

<style scoped>
.btn{
  border-radius: 12px;
}

</style>