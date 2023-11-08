package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;
import java.util.stream.Collectors;

public class LottoGenerator {

    private static final int LOTTO_PICK_COUNT = 6;
    private static final int LOTTO_NUMBER_MIN = 1;
    private static final int LOTTO_NUMBER_MAX = 45;

    public List<Integer> makeAutoNumbers() {
        List<Integer> numbers = pickUniqueNumbers();
        return sortNumbers(numbers);
    }

    public List<Integer> makeManualNumbers(String input) {
        List<Integer> numbers = convertInputToNumbers(input);
        return sortNumbers(numbers);
    }

    private List<Integer> sortNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }

    private static List<Integer> convertInputToNumbers(String input) {
        return Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static List<Integer> pickUniqueNumbers() {
        return Randoms.pickUniqueNumbersInRange(LOTTO_NUMBER_MIN, LOTTO_NUMBER_MAX, LOTTO_PICK_COUNT);
    }
}
