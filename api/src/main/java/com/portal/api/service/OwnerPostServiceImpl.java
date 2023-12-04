package com.portal.api.service;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.OwnerPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OwnerPostServiceImpl implements OwnerPostService{

    @Autowired
    private CarPostStoreClient client;

    @Override
    public void createOwnerCar(OwnerPostDto ownerPostDto) {
        client.ownerPostClient(ownerPostDto);

    }
}
