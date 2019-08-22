package com.demo.spring.restFull;

import java.util.List;

import com.demo.spring.model.Rol;
import com.demo.spring.service.RolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "/rol")
public class RolResource {

    @Autowired
    private RolService rolService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Rol> index(){
        return this.rolService.findAll();
    }

}