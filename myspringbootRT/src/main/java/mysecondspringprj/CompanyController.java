package mysecondspringprj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.Company;
import pojo.User;
import repository.CompanyRepository;
import services.CompanyServices;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    CompanyServices companyServices;

    @Autowired
    CompanyRepository repository;



    @ResponseBody
    @GetMapping("/companies")
    public List<Company> getCompanies(){

            return repository.getCompanies();
        }


    }



