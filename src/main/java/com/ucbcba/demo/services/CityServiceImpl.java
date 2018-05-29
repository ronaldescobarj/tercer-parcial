package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.City;
import com.ucbcba.demo.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Autowired
    @Qualifier(value = "cityRepository")
    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public Iterable<City> listAllCities() {
        return this.cityRepository.findAll();
    }

    public void saveCity(City city) {
        this.cityRepository.save(city);
    }

    public City getCity(Integer id) {
        return this.cityRepository.findOne(id);
    }

    public void deleteCity(Integer id) {
        this.cityRepository.delete(id);
    }
}
