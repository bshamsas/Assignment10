package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
        private ArrayReversor arrayReversor;

        @Mock
        private ArrayFlattenerService flattenerService;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.initMocks(this);
            arrayReversor = new ArrayReversor(flattenerService);
        }

        @Test
        void testReverseArrayValidInput() {
            int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
            when(flattenerService.flattenArray(inputArray)).thenReturn(new int[]{1, 2, 3}); // Mock the flattening result

            int[] reversedArray = arrayReversor.reverseArray(inputArray);

            assertArrayEquals(new int[]{3, 2, 1}, reversedArray); // Expected reversed array
            verify(flattenerService, times(1)).flattenArray(inputArray); // Verify the flattenerService was called once
        }

        @Test
        void testReverseArrayNullInput() {
            int[][] inputArray = null;

            int[] reversedArray = arrayReversor.reverseArray(inputArray);

            assertArrayEquals(new int[0], reversedArray); // Expected an empty array for null input
            verifyNoInteractions(flattenerService); // Ensure that the flattenerService was not invoked
        }
    }


