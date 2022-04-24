package racingcar.view;

import racingcar.constants.ProcessIndicator;
import racingcar.constants.SystemMessage;
import racingcar.controller.RacingGameController;
import racingcar.domain.RacingCars;
import racingcar.domain.RacingTryCount;
import racingcar.utils.MessagePrinter;

public class RacingGame {

    private final RacingGameController racingGameController;
    private final MessagePrinter messagePrinter;
    private ProcessIndicator processIndicator;
    private RacingCars racingCars;
    private RacingTryCount racingTryCount;

    public RacingGame() {
        this.racingGameController = new RacingGameController();
        this.messagePrinter = new MessagePrinter();
        this.processIndicator = ProcessIndicator.INIT;
    }

    public void start() {
        receivePlayerInput();
        if (processIndicator == ProcessIndicator.COUNT_SET) {
            racingStart();
        }
    }

    private void receivePlayerInput() {
        if (processIndicator == ProcessIndicator.INIT) {
            makingCarProcess();
        }
        if (processIndicator == ProcessIndicator.CAR_SET) {
            settingTryCountProcess();
        }
    }

    private void makingCarProcess() {
        messagePrinter.printMessage(SystemMessage.INPUT_CAR_NAMES);
        final String carNames = racingGameController.getInput();
        try {
            racingCars = racingGameController.makeCars(carNames);
            processIndicator = ProcessIndicator.CAR_SET;
        } catch (IllegalArgumentException e) {
            messagePrinter.printMessage(e.getMessage());
            receivePlayerInput();
        }
    }


    private void settingTryCountProcess() {
        messagePrinter.printMessage(SystemMessage.INPUT_TRY_COUNT);
        final String tryCount = racingGameController.getInput();
        try {
            racingTryCount = racingGameController.validateTryCount(tryCount);
            processIndicator = ProcessIndicator.COUNT_SET;
        } catch (IllegalArgumentException e) {
            messagePrinter.printMessage(e.getMessage());
            receivePlayerInput();
        }
    }

    private void racingStart() {
        messagePrinter.printMessage(SystemMessage.RACING_RESULT);
        for (int i = 0; i < racingTryCount.getCount(); i++) {
            racingCars.raceAll();
            racingCars.printRacingCarsState();
        }
    }

}
