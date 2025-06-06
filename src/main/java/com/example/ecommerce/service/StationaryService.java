package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Stationary;
import com.example.ecommerce.repository.StationaryRepository;

@Service
public class StationaryService {
    @Autowired
    private StationaryRepository stationaryRepository;

    public List<Stationary> getAllStationary() {
        return stationaryRepository.findAll();
    }

    public Stationary getStationaryById(Long id) {
        return stationaryRepository.findById(id).orElse(null);
    }

    public List<Stationary> searchStationaryByName(String keyword) {
        return stationaryRepository.findByNameContainingIgnoreCase(keyword);
    } 
}
