package com.example.baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComparisonNumbersTest {
    @Test
    @DisplayName("compareNumbersTest")
    void compareNumbersTest() {
        ComparisonNumbers comparisonNumbers = new ComparisonNumbers(
                new int[]{1, 2, 3},
                new int[]{2, 3, 4}
        );
        comparisonNumbers.compareNumbers();

        System.out.println(
                comparisonNumbers.getBall()
                        + "볼, "
                        + comparisonNumbers.getStrike()
                        + "스트라이크"
        );
    }
}