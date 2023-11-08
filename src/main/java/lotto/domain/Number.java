package lotto.domain;

public class Number implements Comparable<Number> {
    private static final int LOTTO_NUMBER_MIN = 1;
    private static final int LOTTO_NUMBER_MAX = 45;

    private final int number;

    public Number(int number) {
        validateNumberRange(number);
        this.number = number;
    }

    private void validateNumberRange(int number) {
        if (number < LOTTO_NUMBER_MIN || number > LOTTO_NUMBER_MAX) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }

    @Override
    public int compareTo(Number o) {
        return this.number - o.number;
    }
}
