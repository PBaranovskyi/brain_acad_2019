package myfirstspringprj;

import mainclasses.dbpack.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import services.UserServices;

@RestController
public class UsersController {

    @Autowired
    UserServices userServices;


    @ResponseBody
    @GetMapping("/users")
    public java.util.List<User> getUsers(@RequestParam(required = false) Integer companyId){

        if (companyId == null) {
            return userServices.getActiveUsers();
        }

        return userServices.getUsersByCompany(companyId);
    }


    @ResponseBody
    @PostMapping("/users")
    public java.util.List<User> getUsersPost(@RequestParam(required = false) Integer companyId){

        if (companyId == null) {
            return userServices.getActiveUsers();
        }

        return userServices.getUsersByCompany(companyId);
    }
}
