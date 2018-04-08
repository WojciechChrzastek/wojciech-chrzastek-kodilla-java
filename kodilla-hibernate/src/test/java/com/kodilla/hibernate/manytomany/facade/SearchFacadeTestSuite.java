package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchFacade searchFacade;

    @Test
    public void testSearchFacade() {
        //Given
        Employee johnSmith = new Employee("Jack", "Sparrow");
        Company softwareMachine = new Company("Black Pearl");

        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();

        //When
        List<Employee> employeesByAnyGivenLastNameFragment = searchFacade.retrieveEmployeesByAnyGivenLastNameFragment("o");
        List<Company> companiesByAnyGivenNameFragment = searchFacade.retrieveCompaniesByAnyGivenNameFragment("e");

        //Then
        Assert.assertEquals(1, employeesByAnyGivenLastNameFragment.size());
        Assert.assertEquals(1, companiesByAnyGivenNameFragment.size());

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
