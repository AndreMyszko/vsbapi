package com.vsbrasil.vsbapi.integration;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController()
@RequestMapping("/api")
public class CovidServiceController {


    @GetMapping("/covid-status")
    public List<Object> all(){

        // URL
        String url_covidstatus = "http://jsonplaceholder.typicode.com/comments";


        Gson gson = new GsonBuilder().create();
    
        Object[] covidStatusObjects = gson.fromJson(url_covidstatus, Object[].class);

        return Arrays.asList(covidStatusObjects);

    }
    
}