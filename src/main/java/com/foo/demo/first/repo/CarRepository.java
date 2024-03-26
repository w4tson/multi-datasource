package com.foo.demo.first.repo;

import com.foo.demo.first.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
