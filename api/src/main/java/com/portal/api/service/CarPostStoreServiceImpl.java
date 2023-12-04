package com.portal.api.service;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.CarPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService{

    @Autowired
    private CarPostStoreClient client;
    @Override
    public List<CarPostDto> getAllCarForSales() {
        return client.carForSaleClient();
    }

    @Override
    public void updateCarForSale(CarPostDto carPostDto, String id) {
        client.updateCarForSaleClient(carPostDto, id);
    }

    @Override
    public void removeCarForSale(String id) {
        client.deleteCarForSaleClient(id);
    }
}
