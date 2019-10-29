package services;


import mainclasses.dbpack.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServices {


    @Autowired
    UserRepository userRepository;


    public List<User> getActiveUsers(){
        List<User> allUsers = userRepository.getUsers();

        return allUsers.stream().filter(User::isActive).collect(Collectors.toList());

    }

}
