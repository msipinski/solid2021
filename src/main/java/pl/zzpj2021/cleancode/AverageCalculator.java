package pl.zzpj2021.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class AverageCalculator {

    Map<Integer, Integer> numbersCountsMap = new HashMap<>();
    private int maxNumber = Integer.MIN_VALUE;
    private int minNumber = Integer.MAX_VALUE;

    public AverageCalculator(List<Integer> numbers) {
        inputNumbers(numbers);
    }

    public AverageCalculator() {
    }

    public void inputNumbers(List<Integer> numbers) {
        numbers.forEach(this::inputNumbers);
    }

    public void inputNumbers(Integer number) {
        numbersCountsMap.merge(number, 1, Integer::sum);
        maxNumber = Integer.max(maxNumber, number);
        minNumber = Integer.min(minNumber, number);
    }

    public double getAverage() {
        if (numbersCountsMap.isEmpty()) {
            return 0;
        }

        double sum = numbersCountsMap.entrySet().stream()
                .map(e -> e.getKey() * e.getValue())
                .reduce(0, Integer::sum);
        double count = numbersCountsMap.values().stream()
                .reduce(0, Integer::sum);
        return sum / count;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }
}