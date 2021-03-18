// package com.vsbrasil.vsbapi.service;

// import org.springframework.security.core.userdetails.UserDetailsService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;
// import java.util.Optional;

// import com.vsbrasil.vsbapi.entity.User;
// import com.vsbrasil.vsbapi.entity.User_Details;
// import com.vsbrasil.vsbapi.repository.UserRepository;

// @Service
// public class MyUserDetailService implements UserDetailsService {

//     //Call the UserRepository (inject):
//     @Autowired
//     UserRepository userRepository;

//     //Bring to the service some user with this specific name from UserRepository injection:
//     @Override
//     //a autorização precisa de alguma valor único, como por exemplo o email...

//     public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
//         Optional<User> user = userRepository.findByName(name);

//         //Exception para quando o nome do usuário não existe no banco de dados
//         user.orElseThrow(() -> new UsernameNotFoundException("Não há registros do usuário --" + name + "-- não foi encontrado no sistema."));

//         //retorna o usuário da busca
//         return user.map(User_Details::new).get();
//     }

// }