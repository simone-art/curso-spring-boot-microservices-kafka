package com.portal.api.controller;

import com.portal.api.dto.OwnerPostDto;
import com.portal.api.service.OwnerPostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owner")
public class OwnerPostController {

    private final Logger LOG = (Logger) LoggerFactory.getLogger(OwnerPostController.class);


    @Autowired
    private OwnerPostService ownerPostService;


    @PostMapping
    public ResponseEntity createOwnerCar (@RequestBody OwnerPostDto ownerPostDto){
        LOG.info("USANDO API REST - Criando novo usuário: {}", ownerPostDto);
        ownerPostService.createOwnerCar(ownerPostDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
