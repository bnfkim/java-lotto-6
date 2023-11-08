package lotto.controller;

import lotto.domain.Lotto;
import lotto.domain.LottoAmount;
import lotto.domain.LottoNumbers;
import lotto.domain.Number;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameController {

    private final InputView inputView;
    private final OutputView outputView;

    public GameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        LottoAmount lottoAmount = getLottoAmount();
        int lottoCount = lottoAmount.getCountOfLotto();
        outputView.printLottoCount(lottoCount);

        List<Lotto> lottoList = getLottoList(lottoCount);
        outputView.printLottoList(lottoList);

        Lotto lotto = new Lotto(getLottoNumbers());
        Number bonusNumber = getBonusNumber();
    }

    private LottoAmount getLottoAmount() {
        try {
            return new LottoAmount(inputView.inputMoney());
        } catch (IllegalArgumentException e) {
            return getLottoAmount();
        }
    }

    public List<Lotto> getLottoList(int count) {
        return IntStream.range(0, count)
                .mapToObj(i -> new Lotto(new LottoNumbers().getLottoNumbersSorted()))
                .collect(Collectors.toList());
    }

    public List<Integer> getLottoNumbers() {
        try {
            String input = inputView.inputLottoNumber();
            return new LottoNumbers(input).getLottoNumbersSorted();
        } catch (IllegalArgumentException e) {
            return getLottoNumbers();
        }
    }

    public Number getBonusNumber() {
        try {
            return new Number(inputView.inputBonusNumber());
        } catch (IllegalArgumentException e) {
            return getBonusNumber();
        }
    }
}
