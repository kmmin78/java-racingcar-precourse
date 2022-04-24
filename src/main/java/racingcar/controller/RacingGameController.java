package racingcar.controller;

import racingcar.domain.RacingCars;
import racingcar.domain.RacingTryCount;
import racingcar.service.RacingGameService;

public class RacingGameController {

    private final RacingGameService racingGameService;

    public RacingGameController() {
        this.racingGameService = new RacingGameService();
    }

    public String getInput() {
        return racingGameService.getInput();
    }

    public RacingCars makeCars(final String carNames) {
        return racingGameService.makeCars(carNames);
    }

    public RacingTryCount validateTryCount(final String tryCount) {
        return racingGameService.validateTryCount(tryCount);
    }
}
