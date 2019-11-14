package myfirstspringprj;

import fxclient.to.UserRequestTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import repository.UserRepository;
import fxclient.to.User;
import services.UserServices;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UsersController {

    @Autowired
    UserServices userServices;

    @Autowired
    UserRepository repository;



    @ResponseBody
    @GetMapping("/users")
    public java.util.List<User> getUsers(@RequestParam(required = false) Integer companyId){

        if (companyId == null) {
            return userServices.getActiveUsers();
        }

        return userServices.getUsersByCompany(companyId);
    }


//    @ResponseBody
//    @PostMapping("/users")
//    public java.util.List<User> getUsersPost(@RequestParam(required = false) Integer companyId){
//
//        if (companyId == null) {
//            return userServices.getActiveUsers();
//        }
//
//        return userServices.getUsersByCompany(companyId);
//    }


    @ResponseBody
    @PostMapping("/users/add")
    public String addUser(@RequestBody UserRequestTO user, HttpServletRequest request){


        //http://localhost:8083/users/add?age=55&companyId=2&name=Nastya
        repository.addUser(user.getAge(), user.getCompanyId(), user.getName());
        return "200";
    }
}
