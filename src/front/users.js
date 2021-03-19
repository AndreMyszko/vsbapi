import { http } from './vue.config';

export default {
    list:() => {
        return http.get('all-users');
    }
}
