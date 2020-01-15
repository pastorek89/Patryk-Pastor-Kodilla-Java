package com.kodilla.hibernate.manytomany.facade;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    public List<Employee> findEmployees(String lastname){
        LOGGER.info("Searching employee...");
        List<Employee> employees = employeeDao.findEmployeeByAnyCharacter(lastname);
        if(employees.size() == 0) {
            LOGGER.info("Employee not found");
        } else {
            LOGGER.info("Done!");
        }
        return employees;
    }

    public List<Company> findCompanies(String companyName) {
        LOGGER.info("Searching companies...");
        List<Company> companies = companyDao.findCompanyByAnyCharacters(companyName);
        if(companies.size() == 0) {
            LOGGER.info("Company not found");
        } else {
            LOGGER.info("Done!");
        }
        return companies;
    }
}
