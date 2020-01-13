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

    public List<Employee> findEmployees(String lastname) throws CompaniesWorkOrganisationException {
        LOGGER.info("Searching employee...");
        List<Employee> employees = employeeDao.findEmployeeByAnyCharacter(lastname);
        if(employees.size() == 0) {
            LOGGER.error(CompaniesWorkOrganisationException.ERR_EMPLOYEE_NOT_FOUND);
            throw new CompaniesWorkOrganisationException(CompaniesWorkOrganisationException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            LOGGER.info("Done!");
            return employees;
        }
    }

    public List<Company> findCompanies(String companyName) throws CompaniesWorkOrganisationException {
        LOGGER.info("Searching companies...");
        List<Company> companies = companyDao.findCompanyByAnyCharacters(companyName);
        if(companies.size() == 0) {
            LOGGER.error(CompaniesWorkOrganisationException.ERR_COMPANY_NOT_FOUND);
            throw new CompaniesWorkOrganisationException(CompaniesWorkOrganisationException.ERR_COMPANY_NOT_FOUND);
        } else {
            LOGGER.info("Done!");
            return companies;
        }
    }
}
