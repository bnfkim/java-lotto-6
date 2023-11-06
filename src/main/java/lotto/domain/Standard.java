package lotto.domain;

public enum Standard {

    LOTTO_1ST(6, 2000000000),
    LOTTO_2ND(5, 3000000),
    LOTTO_3TH(5, 1500000),
    LOTTO_4TH(4, 50000),
    LOTTO_5TH(3, 5000);

    final int matchingCount;
    final int prizeMoney;

    Standard(int matchingCount, int prizeMoney) {
        this.matchingCount = matchingCount;
        this.prizeMoney = prizeMoney;
    }

    public int matchingCount() {
        return matchingCount;
    }

    public int prizeMoney() {
        return prizeMoney;
    }
}
