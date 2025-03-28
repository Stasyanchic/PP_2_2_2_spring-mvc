package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BMW", "Blue", 2020));
        cars.add(new Car("Lada", "Red", 1999));
        cars.add(new Car("Cherry", "Black", 2017));
        cars.add(new Car("Golf", "Green", 2005));
        cars.add(new Car("Honda", "Yellow", 2010));
    }

    @Override
    public List<Car> listCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
