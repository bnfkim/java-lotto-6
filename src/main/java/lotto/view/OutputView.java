package lotto.view;

import lotto.domain.Lotto;

import java.util.List;

public class OutputView {
    private final static String COUNT_MESSAGE = "개";
    private final static String CORRECT_MESSAGE = "일치";
    private final static String STATISTICS_MESSAGE = "당첨 통계";
    private final static String LINE_MESSAGE = "---";
    private final static String RATE_OF_RETURN_MESSAGE = "총 수익률은 %f입니다.";

    public void printLottoCount(int count) {
        System.out.printf("%d %s를 구매했습니다.\n", count, COUNT_MESSAGE);
    }

    public void printLottoList(List<Lotto> lottoList) {
        for(Lotto lotto : lottoList) {
            List<Integer> lottoNumber = lotto.getLotto();
            System.out.println(lottoNumber.toString());
        }
    }
}
