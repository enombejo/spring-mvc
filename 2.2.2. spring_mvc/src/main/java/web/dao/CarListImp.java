package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarListImp implements CarList {
    List<Car> cars;

    public CarListImp() {
        cars = new ArrayList<>();

        cars.add(new Car(1, "BMW", 47));
        cars.add(new Car(2, "Audy", 4));
        cars.add(new Car(3, "Kia", 98));
        cars.add(new Car(4, "Mazda", 34));
        cars.add(new Car(5, "Toyota", 90));
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public Car findById(int id) {
        return cars.get(id);
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return cars.subList(0, count);
    }

    @Override
    public int getSize() {
        return cars.size();
    }
}
