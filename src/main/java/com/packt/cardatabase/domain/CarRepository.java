package com.packt.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository <Car, Long> {

    //  Fetch cars by brand
    @Query("select c from Car where c.brand=?1")
    List<Car> findByBrand(String brand);

    //  Fetch cars by brand and model
    @Query("select c from Car where c.brand=?1")
    List<Car> findByBrandAndModel(String brand, String model);

    //  Fetch cares by brand and colour
    List<Car> findByBrandAndColour(String brand, String colour);

}
