package com.brewmes.helloservice;


import com.brewmes.common.services.IHelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String getName() {
        return "John Doe";
    }
}
