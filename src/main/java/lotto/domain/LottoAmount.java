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

    public void validateAmount(int money) {
        validateDivisible(money);
        validateMinAmount(money);
        validateMaxAmount(money);

    }

    private void validateMinAmount(int amount) {
        if (amount <= LOTTO_PRICE) {
            throw new IllegalArgumentException("[ERROR] 최소 1000원 이상 입력해주세요.");
        }
    }

    private void validateMaxAmount(int amount) {
        if (amount <= LOTTO_PRICE) {
            throw new IllegalArgumentException("[ERROR] 전자복권의 구입한도는 1일 10만원으로 제한되어 있습니다..");
        }
    }

    public void validateDivisible(int money){
        if(money % LOTTO_PRICE != 0) {
            throw new IllegalArgumentException("[ERROR] 1000원 단위로 떨어지게 입력해주세요.");
        }
    }
}
