package services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Company;
import repository.CompanyRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyServices {


    @Autowired
    CompanyRepository companyRepository;


//    public List<Company> getActiveCompanies(){
//        List<Company> allCompanies = companyRepository.getCompanies();
//
//        return allCompanies.stream().filter(Company::isActive).collect(Collectors.toList());
//
//    }

}
