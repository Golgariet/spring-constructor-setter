package com.anton.serviceimpl;

import com.anton.service.RecruitmentService;

import java.util.Random;

public class AgencyRecuitmentServiceImpl implements RecruitmentService {
    @Override
    public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
        Random random = new Random();
        String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " + random.nextInt(numberOfRecruitments)
                + " employees " + "using various hiring agencies.";
        return hiringFacts;
    }
}
