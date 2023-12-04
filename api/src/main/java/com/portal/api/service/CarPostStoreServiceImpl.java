package com.portal.api.service;

import com.portal.api.dto.CarPostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService{
    @Override
    public List<CarPostDto> getAllCarForSales() {
        return null;
    }

    @Override
    public void updateCarForSale(CarPostDto carPostDto, String id) {

    }

    @Override
    public void removeCarForSale(String id) {

    }
}
