package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarList;
import web.dao.CarListImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {


    private CarList carList;

    @Autowired
    public CarServiceImpl(CarList carList) {
        this.carList = carList;
    }

    @Override
    public List<Car> getAllCars() {
        return carList.getAllCars();
    }

    @Override
    public Car findById(int id) {
        return carList.findById(id);
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return carList.getSomeCars(count);
    }

    @Override
    public int getSize() {
        return carList.getSize();
    }
}
