package racingcar.service;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.RacingCars;
import racingcar.domain.RacingTryCount;
import racingcar.utils.CarFactory;
import racingcar.utils.NumberValidator;

public class RacingGameService {
    public String getInput() {
        return Console.readLine();
    }

    public RacingCars makeCars(final String carNames) {
        return CarFactory.makeCars(carNames);
    }

    public RacingTryCount validateTryCount(final String tryCount) {
        final Integer count = NumberValidator.validateNumber(tryCount);
        return new RacingTryCount(count);
    }
}
