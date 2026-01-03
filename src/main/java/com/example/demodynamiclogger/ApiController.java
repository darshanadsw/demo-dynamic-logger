package com.example.demodynamiclogger;

import com.example.demodynamiclogger.service.MyBusinessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    private final MyBusinessService myBusinessService;

    public ApiController(MyBusinessService myBusinessService) {
        this.myBusinessService = myBusinessService;
    }

    @GetMapping("/slow/{user}")
    public String slowEndpoint(@PathVariable String user) {
        return myBusinessService.performSlowOperation(user);
    }

    @GetMapping("/quick/{user}")
    public String quickEndpoint(@PathVariable String user) {
        return myBusinessService.performQuickOperation(user);
    }
}
