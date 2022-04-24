package racingcar.utils;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;

public class CarFactory {

    public static List<Car> makeCars(final String input) {
        final List<Car> cars = new ArrayList<>();
        final String[] carNames = input.split(",");
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

}
