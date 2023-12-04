package com.portal.api.service;

import com.portal.api.dto.CarPostDto;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPostStoreService {
    List<CarPostDto> getAllCarForSales();
    void updateCarForSale(CarPostDto carPostDto, String id);
    void removeCarForSale(String id);
}
