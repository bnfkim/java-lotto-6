package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.validator.InputValidator;

public class InputView {
    private final static String INPUT_MONEY_MESSAGE = "구입금액을 입력해 주세요.";
    private final static String INPUT_LOTTO_NUM_MESSAGE = "당첨 번호를 입력해 주세요.";
    private final static String INPUT_BONUS_NUM_MESSAGE = "보너스 번호를 입력해 주세요.";

    public String inputMoney() {
        System.out.println(INPUT_MONEY_MESSAGE);
        String input = readLine();

        return input;
    }

    private String readLine(){
        return Console.readLine();
    }

}
