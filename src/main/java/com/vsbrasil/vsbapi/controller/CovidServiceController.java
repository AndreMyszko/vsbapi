package com.vsbrasil.vsbapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController()
@RequestMapping("/api")
public class CovidServiceController {

    // instatntiate restTemplate
    @Autowired
    private RestTemplate restTemplate;

    // private static String url_allmoedas = "https://economia.awesomeapi.com.br/all/USD-BRL,EUR-BRL,BTC-BRL"; 
    public static String url_covidstatus = "https://covid19-api.org/api/status";

    // restTemplate test with countries api
    @GetMapping("/covid-status")
    public List<Object> all(){
        Object[] covidStatusObjects  = restTemplate.getForObject(url_covidstatus, Object[].class);
        return Arrays.asList(covidStatusObjects);
    }
    
}