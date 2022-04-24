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

    public void raceAll() {
        for (RacingCar racingCar : racingCars) {
            racingCar.race();
        }
    }

    public void printRacingCarsState() {
        for (RacingCar racingCar : racingCars) {
            System.out.printf("%s : %s", racingCar.getName(), makeDistanceIndicator(racingCar));
            System.out.println();
        }
        System.out.println();
    }

    private String makeDistanceIndicator(final RacingCar racingCar) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < racingCar.getDistance(); i++) {
            builder.append("-");
        }
        return builder.toString();
    }
}
