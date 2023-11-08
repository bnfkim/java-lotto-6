package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;
import java.util.stream.Collectors;

public class LottoNumbers {

    private static final int LOTTO_PICK_COUNT = 6;
    private static final int LOTTO_NUMBER_MIN = 1;
    private static final int LOTTO_NUMBER_MAX = 45;

    private final List<Number> numbers;

    public LottoNumbers(){
        this.numbers = makeAutoNumbers();
    }

    public LottoNumbers(String input) {
        this.numbers = makeManualNumbers(input);
    }

    public List<Number> getLottoNumbersSorted() {
        Collections.sort(this.numbers);
        return this.numbers;
    }

    public List<Number> makeAutoNumbers() {
        List<Integer> numbers =  Randoms.pickUniqueNumbersInRange(LOTTO_NUMBER_MIN, LOTTO_NUMBER_MAX, LOTTO_PICK_COUNT);
        return makeNumbers(numbers);
    }

    public List<Number> makeNumbers(List<Integer> primitiveNumbers) {
        List<Number> numbers = new ArrayList<>();
        for(int primitiveNumber : primitiveNumbers) {
            numbers.add(new Number(primitiveNumber));
        }
        return numbers;
    }

    public List<Number> makeManualNumbers(String input) {
        List<Integer> numbers = convertInputToNumbers(input);
        validateNumbers(numbers);
        return makeNumbers(numbers);
    }

    private void validateNumbers(List<Integer> primitiveNumbers) {
        HashSet<Integer> set = new HashSet<>(primitiveNumbers);
        if (set.size() != LOTTO_PICK_COUNT) {
            throw new IllegalArgumentException();
        }
    }

    public static List<Integer> convertInputToNumbers(String input) {
        return Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
