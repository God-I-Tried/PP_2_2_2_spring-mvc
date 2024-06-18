package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Audi", 200, 350));
        cars.add(new Car("Alfa Romeo", 147, 250));
        cars.add(new Car("Ferrari", 458, 320));
        cars.add(new Car("Mazda", 6, 240));
        cars.add(new Car("Tesla", 4, 250));
    }

    @Override
    public List<Car> getCars(int numOfCars) {
        return numOfCars > 5 ? cars : cars.stream().limit(numOfCars).collect(Collectors.toList());
    }
}
