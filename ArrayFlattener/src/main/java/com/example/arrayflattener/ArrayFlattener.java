package com.example.arrayflattener;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
        public int[] flattenArray(int[][] inputArray) {
            if (inputArray == null) {
                return new int[0]; // Return an empty array for null input
            }

            List<Integer> flattenedList = new ArrayList<>();

            for (int[] subArray : inputArray) {
                for (int num : subArray) {
                    flattenedList.add(num);
                }
            }

            int[] flattenedArray = new int[flattenedList.size()];
            for (int i = 0; i < flattenedList.size(); i++) {
                flattenedArray[i] = flattenedList.get(i);
            }

            return flattenedArray;
        }
    }


