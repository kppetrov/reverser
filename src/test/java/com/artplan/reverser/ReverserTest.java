package com.artplan.reverser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverserTest {

    final String SOME_TEXT = " abcd a";
    final String SOME_TEXT_REVERSE = "a dcba ";

    @Test
    void shouldReturnCorrectReverseText() {
        assertEquals(SOME_TEXT_REVERSE, new Reverser(SOME_TEXT).getReverse());
    }

    @Test
    void shouldReturnSameBlankTextWhenTextContainsOnlyWhiteSpace() {
        String actual = "   ";
        assertEquals(actual, new Reverser(actual).getReverse());
    }

    @Test
    void shouldReturnEmptyTextWhenEmptyText() {
        assertTrue(new Reverser("").getReverse().isEmpty());
    }

    @Test
    void shouldThrowsExceptionWhenNull() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            new Reverser(null).getReverse();
        });
        assertEquals("The str cannot be null", exception.getMessage());
    }

}
