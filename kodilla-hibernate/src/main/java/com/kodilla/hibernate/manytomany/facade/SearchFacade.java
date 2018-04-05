package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    public SearchFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Company> retrieveCompaniesByAnyGivenNameFragment(final String nameFragment) {
        return companyDao.retrieveCompaniesByAnyGivenNameFragment(nameFragment);
    }

    public List<Employee> retrieveEmployeesByAnyGivenLastNameFragment(final String lastNameFragment) {
        return employeeDao.retrieveEmployeesByAnyGivenLastNameFragment(lastNameFragment);
    }
}
