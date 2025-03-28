package web.service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listCars(int count) {
        List<Car> listCars = new ArrayList<>();

        listCars.add(new Car("BMV", "Blue", 2020 ));
        listCars.add(new Car("Lada", "Red", 1999 ));
        listCars.add(new Car("Cherry", "Black", 2017 ));
        listCars.add(new Car("Golf", "Green", 2005 ));
        listCars.add(new Car("Honda", "Yellow", 2010 ));

        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}
