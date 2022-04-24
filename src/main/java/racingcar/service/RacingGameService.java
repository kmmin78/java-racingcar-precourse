package racingcar.service;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.domain.Car;
import racingcar.utils.CarFactory;

public class RacingGameService {
    public String getInput() {
        return Console.readLine();
    }

    public List<Car> makeCars(final String carNames) {
        return CarFactory.makeCars(carNames);
    }
}
