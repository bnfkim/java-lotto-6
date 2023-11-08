package lotto.domain;

public enum LottoRanking {

    LOTTO_1ST(6,  false, 2_000_000_000),
    LOTTO_2ND(5, true, 3_000_000),
    LOTTO_3TH(5, false, 1_500_000),
    LOTTO_4TH(4, false, 50_000),
    LOTTO_5TH(3, false, 5_000),
    LOTTO_NOTING(0, false, 0);

    final int matchingCount;
    final boolean haveBonusNumber;
    final int prizeMoney;

    LottoRanking(int matchingCount, boolean haveBonusNumber, int prizeMoney) {
        this.matchingCount = matchingCount;
        this.haveBonusNumber = haveBonusNumber;
        this.prizeMoney = prizeMoney;
    }

    public int matchingCount() {
        return matchingCount;
    }

    public int prizeMoney() {
        return prizeMoney;
    }
}
