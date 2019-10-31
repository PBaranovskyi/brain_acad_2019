package myfirstspringprj;

import mainclasses.dbpack.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import services.UserServices;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UserServices userServices;

    @ResponseBody
    @RequestMapping("/users")
    public java.util.List<User> getUsers(){

        List<User> userList = userServices.getActiveUsers();

//        StringBuilder sb = new StringBuilder();
//        for (User user : userList) {
//            System.out.println(user);
//            sb.append(user).append("/n");
//        }
        return userList;
    }

}
