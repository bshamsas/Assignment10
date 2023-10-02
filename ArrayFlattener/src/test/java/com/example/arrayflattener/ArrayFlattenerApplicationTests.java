package com.example.arrayflattener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArrayFlattenerApplicationTests {
    public class ArrayFlattenerTest {
        private ArrayFlattener arrayFlattener;

        @BeforeEach
        void setUp() {
            arrayFlattener = new ArrayFlattener();
        }

        @Test
        void testFlattenArrayValidInput() {
            int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
            int[] expectedOutput = {1, 3, 0, 4, 5, 9};
            int[] flattenedArray = arrayFlattener.flattenArray(inputArray);
            assertArrayEquals(expectedOutput, flattenedArray);
        }

        @Test
        void testFlattenArrayNullInput() {
            int[][] inputArray = null;
            int[] expectedOutput = {};
            int[] flattenedArray = arrayFlattener.flattenArray(inputArray);
            assertArrayEquals(expectedOutput, flattenedArray);
        }
    }

}
