import axios from 'axios';

export default class UserService{
    url = "http://localhost:8082/api"

    getAll(){
        return axios.get(this.url + "/all-users");
    }
}