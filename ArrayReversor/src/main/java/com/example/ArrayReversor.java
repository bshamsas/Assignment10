package com.example;
    public class ArrayReversor {
        private final ArrayFlattenerService flattenerService;

        public ArrayReversor(ArrayFlattenerService flattenerService) {
            this.flattenerService = flattenerService;
        }

        public int[] reverseArray(int[][] inputArray) {
            int[] flattenedArray = flattenerService.flattenArray(inputArray);
            int[] reversedArray = new int[flattenedArray.length];

            for (int i = 0; i < flattenedArray.length; i++) {
                reversedArray[i] = flattenedArray[flattenedArray.length - 1 - i];
            }

            return reversedArray;
        }
    }


