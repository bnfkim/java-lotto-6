package lotto.domain;

public class LottoAmount {

    private final static int LOTTO_PRICE = 1000;
    private final int amount;

    public LottoAmount(int money) {
        validateAmount(money);
        this.amount = getAmountOfLotto(money);
    }

    public int getAmountOfLotto(int money) {
        return money % LOTTO_PRICE;
    }
}
