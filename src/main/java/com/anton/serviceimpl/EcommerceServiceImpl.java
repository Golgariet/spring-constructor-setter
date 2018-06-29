package com.anton.serviceimpl;

import com.anton.service.BusinessService;

import java.util.Random;

public class EcommerceServiceImpl implements BusinessService {
    @Override
    public String offerService(String companyName) {
        Random random = new Random();
        String service = "\nAs an organization, " + companyName +
                " provides an outstanding Ecommerce platform." +
                "\nThe annual revenue exceeds" + random.nextInt(revenue) + "dollars.";
        return service;
    }
}
