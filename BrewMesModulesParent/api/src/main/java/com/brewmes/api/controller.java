package com.brewmes.api;

import com.brewmes.common.services.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@ComponentScan(basePackages = "dk.sdu.mmmi.helloservice")
public class controller {



    @Autowired
    IHelloService helloService;


    @GetMapping("/hello")
    public ResponseEntity<Object> getHello() {
        return new ResponseEntity<Object>(helloService.getName(), HttpStatus.OK);
    }





}
