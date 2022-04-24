package racingcar.service;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.RacingCars;
import racingcar.utils.CarFactory;

public class RacingGameService {
    public String getInput() {
        return Console.readLine();
    }

    public RacingCars makeCars(final String carNames) {
        return CarFactory.makeCars(carNames);
    }
}
