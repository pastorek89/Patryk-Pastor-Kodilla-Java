package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }

    }

    @Test
    public void testFindEmployeeByName() {

        //Given
        Employee patrykPastor = new Employee("Patryk", "Pastor");
        Employee andrzejMatusiak = new Employee("Andrzej", "Matusiak");
        Employee karolinaBorek = new Employee("Karolina", "Borek");

        employeeDao.save(patrykPastor);
        int patrykPastorId = patrykPastor.getId();
        employeeDao.save(andrzejMatusiak);
        int andrzejMatusiakId = andrzejMatusiak.getId();
        employeeDao.save(karolinaBorek);
        int karolinaBorekId = karolinaBorek.getId();

        //When
        List<Employee> employeesListWithFollowingLastname = employeeDao.findEmployeeByName("Matusiak");

        //Then
        Assert.assertEquals(1, employeesListWithFollowingLastname.size());

        //CleanUp
        try {
            employeeDao.deleteById(patrykPastorId);
            employeeDao.deleteById(andrzejMatusiakId);
            employeeDao.deleteById(karolinaBorekId);

        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindCompanyByFirstThreeCharacters() {

        //Given
        Company tietoCorp = new Company("Tieto Corporation");
        Company asseco = new Company("Asseco");
        Company tiestoCorp = new Company("Tiesto Corporation");

        companyDao.save(tietoCorp);
        int tietoCorpId = tietoCorp.getId();
        companyDao.save(tiestoCorp);
        int tiestoCorpId = tiestoCorp.getId();
        companyDao.save(asseco);
        int assecoId = asseco.getId();

        //When
        List<Company> companiesWithThreeFirstChars = companyDao.findCompanyByFirstThreeCharacters("Tie");

        //Then
        Assert.assertEquals(2,companiesWithThreeFirstChars.size());

        //Clean up
        try {
            companyDao.deleteById(tietoCorpId);
            companyDao.deleteById(tiestoCorpId);
            companyDao.deleteById(assecoId);

        } catch (Exception e) {
            //do nothing
        }

    }
}

