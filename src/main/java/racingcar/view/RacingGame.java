package racingcar.view;

import java.util.List;
import racingcar.constants.ProcessIndicator;
import racingcar.constants.SystemMessage;
import racingcar.controller.RacingGameController;
import racingcar.domain.Car;
import racingcar.utils.MessagePrinter;

public class RacingGame {

    private final RacingGameController racingGameController;
    private final MessagePrinter messagePrinter;
    private ProcessIndicator processIndicator;
    private List<Car> cars;

    public RacingGame() {
        this.racingGameController = new RacingGameController();
        this.messagePrinter = new MessagePrinter();
        this.processIndicator = ProcessIndicator.INIT;
    }

    public void start() {
        if(processIndicator == ProcessIndicator.INIT){
            makingCarProcess();
        }


    }

    private void makingCarProcess() {
        messagePrinter.printMessage(SystemMessage.INPUT_CAR_NAMES);
        final String carNames = racingGameController.getInput();

        try {
            cars = racingGameController.makeCars(carNames);
        } catch (IllegalArgumentException e) {
            messagePrinter.printMessage(e.getMessage());
        }
        processIndicator = ProcessIndicator.CAR_SET;
    }
}
