package racingcar.view;

import racingcar.constants.ProcessIndicator;
import racingcar.constants.SystemMessage;
import racingcar.controller.RacingGameController;
import racingcar.domain.RacingCars;
import racingcar.utils.MessagePrinter;

public class RacingGame {

    private final RacingGameController racingGameController;
    private final MessagePrinter messagePrinter;
    private ProcessIndicator processIndicator;
    private RacingCars racingCars;

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
            racingCars = racingGameController.makeCars(carNames);
        } catch (IllegalArgumentException e) {
            messagePrinter.printMessage(e.getMessage());
            start();
            return;
        }
        processIndicator = ProcessIndicator.CAR_SET;
    }

}
