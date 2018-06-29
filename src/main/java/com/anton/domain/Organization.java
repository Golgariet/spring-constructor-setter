package com.anton.domain;

import com.anton.service.BusinessService;
import com.anton.serviceimpl.CloudServiceImpl;

public class Organization {

    private String companyName;
    private int yearOfIncorporation;
    private String postalCode;
    private int employeeCount;
    private String slogan;
    private BusinessService businessService;


//    public Organization(){
//    }

    public Organization(String companyName, int yearOfIncorporation) {
        this.companyName = companyName;
        this.yearOfIncorporation = yearOfIncorporation;
    }

    public String corporateSlogan() {
        return slogan;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String corporateService(){
        return businessService.offerService(companyName);
    }

    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "companyName='" + companyName + '\'' +
                ", yearOfIncorporation=" + yearOfIncorporation +
                ", postalCode='" + postalCode + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
