package com.example.dashboard.service;

import com.example.dashboard.entity.CDA;
import com.example.dashboard.repository.CDARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {
    @Autowired
    private CDARepository cdaRepository;

    public List<CDA> getCDALatestData(Integer days){
        return cdaRepository.findCDALatestData(days);
    }
}
