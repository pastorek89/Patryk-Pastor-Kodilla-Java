package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyDao company;

    @Autowired
    private EmployeeDao employee;

    @Autowired
    private CompanyFacade companyFacade;

    @Test
    public void testFindEmployees() throws CompaniesWorkOrganisationException {
        //Given
        Employee elzaZBajki = new Employee("Elza", "ZBajki");
        Employee patryk = new Employee("Patryk", "Pastoruch");
        Employee kuba = new Employee("Kubuś", "Puchatek");

        employee.save(elzaZBajki);
        int elzaId = elzaZBajki.getId();
        employee.save(patryk);
        int patrykId = patryk.getId();
        employee.save(kuba);
        int kubaId = kuba.getId();

        //When
        List<Employee> employees = companyFacade.findEmployees("%uch%");

        //Then
        Assert.assertEquals(2, employees.size());

        //Clean Up
        try {
            employee.deleteById(elzaId);
            employee.deleteById(patrykId);
            employee.deleteById(kubaId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindCompanies() throws CompaniesWorkOrganisationException {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMachsters = new Company("Data Machsters");
        Company greyMatter = new Company("Grey Matter");

        company.save(softwareMachine);
        int softId = softwareMachine.getId();
        company.save(dataMachsters);
        int dataId = dataMachsters.getId();
        company.save(greyMatter);
        int greyId = greyMatter.getId();

        //When
        List<Company> companies = companyFacade.findCompanies("%ach%");

        //Then
        Assert.assertEquals(2, companies.size());

        //Clean Up
        try {
            company.deleteById(softId);
            company.deleteById(dataId);
            company.deleteById(greyId);
        } catch (Exception e) {
            //do nothing
        }
    }
}




