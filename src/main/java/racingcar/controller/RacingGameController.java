package racingcar.controller;

import java.util.List;
import racingcar.domain.Car;
import racingcar.service.RacingGameService;

public class RacingGameController {

    private final RacingGameService racingGameService;

    public RacingGameController() {
        this.racingGameService = new RacingGameService();
    }

    public String getInput() {
        return racingGameService.getInput();
    }

    public List<Car> makeCars(final String carNames) {
        return racingGameService.makeCars(carNames);
    }
}
