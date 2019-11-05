package repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pojo.Company;
import pojo.User;
import sun.reflect.generics.tree.Tree;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CompanyRepository extends AbstractRepository {


    public List<Company> getCompanies(){

        Connection connection = getConnection();


        try (Statement st = connection.createStatement()) {

            st.execute("SELECT id, name, year from Company");
            return getCompanies(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<Company> getCompanies(Statement st) throws SQLException {

        List<Company> companyList = new ArrayList<>();
        ResultSet rs = st.getResultSet();

        while (rs.next()) {

            Company company = new Company();
            company.setId(rs.getInt(1));
            company.setName(rs.getString(2));
            company.setYear(rs.getInt(3));

            companyList.add(company);
        }
        return companyList;
    }

}
