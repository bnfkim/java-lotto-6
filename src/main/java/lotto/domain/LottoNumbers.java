package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LottoNumbers {

    private static final int LOTTO_PICK_COUNT = 6;
    private static final int LOTTO_NUMBER_MIN = 1;
    private static final int LOTTO_NUMBER_MAX = 45;

    private final List<Integer> lottoNumbers;

    public LottoNumbers(){
        this.lottoNumbers = makeLottoNumbers();
    }

    public LottoNumbers(String input) {
        this.lottoNumbers = convertInputToLottoNumbers(input);
    }

    public List<Integer> getLottoNumbersSorted() {
        Collections.sort(this.lottoNumbers);
        return this.lottoNumbers;
    }

    public List<Integer> makeLottoNumbers() {
        return Randoms.pickUniqueNumbersInRange(LOTTO_NUMBER_MIN, LOTTO_NUMBER_MAX, LOTTO_PICK_COUNT);
    }

    public static List<Integer> convertInputToLottoNumbers(String input) {
        return Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
