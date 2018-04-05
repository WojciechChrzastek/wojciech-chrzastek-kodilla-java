package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    private List<Company> companiesList = new ArrayList<>();
    private List<Employee> employeesList = new ArrayList<>();

    public SearchFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Company> retrieveCompaniesByAnyGivenNameFragment(final String nameFragment) {
        companyDao.retrieveCompaniesByAnyGivenNameFragment(nameFragment);
        return companiesList;
    }

    public List<Employee> retrieveEmployeesByAnyGivenLastNameFragment(final String lastNameFragment) {
        employeeDao.retrieveEmployeesByAnyGivenLastNameFragment(lastNameFragment);
        return employeesList;
    }
}
