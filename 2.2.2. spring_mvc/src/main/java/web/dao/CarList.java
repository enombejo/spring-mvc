package web.dao;

import web.model.Car;

import java.util.List;

public interface CarList {
    List<Car> getAllCars();

    Car findById(int id);

    List<Car> getSomeCars(int count);

    int getSize();


}
