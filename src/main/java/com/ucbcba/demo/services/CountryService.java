package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Country;

public interface CountryService {

    Iterable<Country> listAllCountries();

    void saveCountry(Country country);

    Country getCountry(Integer id);

    void deleteCountry(Integer id);
}
