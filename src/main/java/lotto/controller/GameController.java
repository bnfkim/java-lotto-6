package lotto.controller;

import lotto.domain.LottoAmount;
import lotto.view.InputView;
import lotto.view.OutputView;

public class GameController {

    private final InputView inputView;
    private final OutputView outputView;

    public GameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        LottoAmount lottoAmount = getLottoAmount();
    }

    private LottoAmount getLottoAmount() {
        try {
            return new LottoAmount(inputView.inputMoney());
        } catch (IllegalArgumentException e) {
            return getLottoAmount();
        }
    }
}
