package com.foo.demo;

import com.foo.demo.first.repo.CarRepository;
import com.foo.demo.second.repo.HouseRepository;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class OnLoad implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Cars\n----");
        CarRepository carRepository = (CarRepository)applicationContext.getBean("carRepository");
        carRepository.findAll().forEach(car -> {
            System.out.printf("%d\t\t%s\n", car.getId(), car.getName());
        });

        System.out.println("\nHouses\n------");
        HouseRepository houseRepo = (HouseRepository)applicationContext.getBean("houseRepository");
        houseRepo.findAll().forEach(house -> {
            System.out.printf("%d\t\t%s\n", house.getId(), house.getAddress());
        });
    }
}
