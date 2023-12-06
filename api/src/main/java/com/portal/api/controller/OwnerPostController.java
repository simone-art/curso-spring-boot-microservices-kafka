package com.portal.api.controller;

import com.portal.api.dto.OwnerPostDto;
import com.portal.api.service.OwnerPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owner")
public class OwnerPostController {

    @Autowired
    private OwnerPostService ownerPostService;


    @PostMapping
    public ResponseEntity createOwnerCar (@RequestBody OwnerPostDto ownerPostDto){
        ownerPostService.createOwnerCar(ownerPostDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
