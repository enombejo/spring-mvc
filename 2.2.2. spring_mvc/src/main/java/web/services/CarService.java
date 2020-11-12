package web.services;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();

    Car findById(int id);

    List<Car> getSomeCars(int count);

    int getSize();
}
