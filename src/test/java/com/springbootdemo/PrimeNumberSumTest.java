package com.springbootdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PrimeNumberSumTest {

    @Test
    public void testCheckWhenStringLengthsAreDifferentThenReturnFalse() {
        // Arrange
        String str1 = "silent";
        String str2 = "listenss";

        // Act
        boolean result = PrimeNumberSum.check(str1, str2);

        // Assert
        Assertions.assertFalse(result, "Expected false when string lengths are different");
    }

    @Test
    public void testCheckWhenStringsHaveSameLengthButDifferentCharactersThenReturnFalse() {
        // Arrange
        String str1 = "silent";
        String str2 = "listen";

        // Act
        boolean result = PrimeNumberSum.check(str1, str2);

        // Assert
        Assertions.assertFalse(result, "Expected false when strings have same length but different characters");
    }

    @Test
    public void testCheckWhenStringsHaveSameLengthAndSameCharactersThenReturnTrue() {
        // Arrange
        String str1 = "silentt";
        String str2 = "listens";

        // Act
        boolean result = PrimeNumberSum.check(str1, str2);

        // Assert
        Assertions.assertTrue(result, "Expected true when strings have same length and same characters");
    }
}