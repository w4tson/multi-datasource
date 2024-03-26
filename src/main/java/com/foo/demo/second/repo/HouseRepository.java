package com.foo.demo.second.repo;

import com.foo.demo.second.domain.House;
import org.springframework.data.repository.CrudRepository;

public interface HouseRepository extends CrudRepository<House, Long> {
}
