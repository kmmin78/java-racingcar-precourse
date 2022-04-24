package racingcar.domain;

import racingcar.constants.ErrorMessage;
import racingcar.utils.RandomNumberCreator;

public class RacingCar {

    private String name;
    private Integer distance;

    public RacingCar(final String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_LENGTH_IS_MORE_THAN_FIVE);
        }
        if (name.equals("") || name.length() == 0) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_IS_EMPTY);
        }
        this.name = name;
        this.distance = 0;
    }

    public String getName() {
        return name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void race() {
        if(canGoForward()){
            distance += 1;
        }
    }

    private boolean canGoForward() {
        final Integer randomNumber = RandomNumberCreator.makeRandomNumber();
        return randomNumber >= 4;
    }

}
