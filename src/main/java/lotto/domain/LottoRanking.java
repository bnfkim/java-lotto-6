package lotto.domain;

public enum LottoRanking {

    FIRST(6,  false, 2_000_000_000),
    SECOND(5, true, 3_000_000),
    THIRD(5, false, 1_500_000),
    FOURTH(4, false, 50_000),
    FIFTH(3, false, 5_000),
    NOTING(0, false, 0);

    final int matchingCount;
    final boolean haveBonusNumber;
    final int prizeMoney;

    LottoRanking(int matchingCount, boolean haveBonusNumber, int prizeMoney) {
        this.matchingCount = matchingCount;
        this.haveBonusNumber = haveBonusNumber;
        this.prizeMoney = prizeMoney;
    }

    public boolean matchCount(int matchingCount) {
        return this.matchingCount == matchingCount;
    }

    public int getMatchingCount(){
        return matchingCount;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public LottoRanking of (int matchingCount, boolean haveBonusNumber) {
        if(haveBonusNumber && SECOND.matchCount(matchingCount)) {
            return SECOND;
        }
        for(LottoRanking ranking : values()) {
            if(ranking == SECOND) continue;

            if(ranking.matchCount(matchingCount)) {
                return ranking;
            }
        }
        return NOTING;
    }
}
