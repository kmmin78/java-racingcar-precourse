package racingcar.domain;

import java.util.List;

public class RacingCars {
    private final List<RacingCar> racingCars;
    public RacingCars(final List<RacingCar> racingCars) {
        this.racingCars = racingCars;
    }
    public int size() {
        return this.racingCars.size();
    }
    public RacingCar get(int i) {
        return this.racingCars.get(i);
    }
}
