package com.example.dashboard.controller;

import com.example.dashboard.entity.CDA;
import com.example.dashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/data")
    public List<String> getData(){
        return List.of("item1","item2","item3");
    }

    @GetMapping("/CDAData")
    public List<CDA> getCDAData(){
        System.out.println(dashboardService.getCDALatestData(7));
        return dashboardService.getCDALatestData(7);
    }
}
