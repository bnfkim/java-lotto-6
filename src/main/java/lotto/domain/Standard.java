package lotto.domain;

public enum Standard {

    LOTTO_1ST(6,  0, 2000000000),
    LOTTO_2ND(5, 0, 3000000),
    LOTTO_3TH(5, 0, 1500000),
    LOTTO_4TH(4, 1, 50000),
    LOTTO_5TH(3, 0, 5000);

    final int matchingCount;
    final int bonusCount;
    final int prizeMoney;

    Standard(int matchingCount, int bonusCount, int prizeMoney) {
        this.matchingCount = matchingCount;
        this.bonusCount = bonusCount;
        this.prizeMoney = prizeMoney;
    }

    public int matchingCount() {
        return matchingCount;
    }

    public int prizeMoney() {
        return prizeMoney;
    }
}
