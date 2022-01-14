package org.example.junit;

 class selectsort {
     void sortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
     void sortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    pos = j;
                    max = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = max;
        }
    }
}
