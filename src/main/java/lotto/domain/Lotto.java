package lotto.domain;

import java.util.List;

public class Lotto {
    private static final int LOTTO_PICK_COUNT = 6;
    private static final int LOTTO_NUMBER_MIN = 1;
    private static final int LOTTO_NUMBER_MAX = 45;

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        validateSize(numbers);
        validateNumber(numbers);
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != LOTTO_PICK_COUNT) {
            throw new IllegalArgumentException();
        }
    }

    private void validateNumber(List<Integer> numbers) {
        for(int number : numbers) {
            validateNumberRange(number);
        }
    }

    private void validateNumberRange(int number) {
        if (number < LOTTO_NUMBER_MIN || number > LOTTO_NUMBER_MAX) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getLotto() {
        return this.numbers;
    }
}
