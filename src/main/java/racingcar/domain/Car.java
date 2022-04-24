package racingcar.domain;

import racingcar.constants.ErrorMessage;

public class Car {

    private String name;

    public Car(final String name) {
        if(name.length() > 5){
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_LENGTH_IS_MORE_THAN_FIVE);
        }
        if(name == null || name.length() == 0){
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_IS_EMPTY);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
