package web.service;

import web.model.Car;

import java.util.*;
import java.util.stream.Collectors;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars(int numOfCars) {
        cars.add(new Car("Audi", 200, 350));
        cars.add(new Car("Alfa Romeo", 147, 250));
        cars.add(new Car("Ferrari", 458, 320));
        cars.add(new Car("Mazda", 6, 240));
        cars.add(new Car("Tesla", 4, 250));
        return numOfCars > 5 ? cars : cars.stream().limit(numOfCars).collect(Collectors.toList());
    }
}
