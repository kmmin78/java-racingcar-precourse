package racingcar.utils;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingCars;

public class RacingCarFactory {

    public static RacingCars makeCars(final String input) {
        final List<RacingCar> racingCars = new ArrayList<>();
        final String[] carNames = input.split(",");
        for (String carName : carNames) {
            racingCars.add(new RacingCar(carName));
        }
        return new RacingCars(racingCars);
    }

}
