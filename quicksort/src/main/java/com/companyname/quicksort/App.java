package com.companyname.quicksort;

/**
 * Hello Quick Sort!
 */
public final class App {
    private App() {
    }

    /**
     * Say hello to Quick Sort.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello Quick Sort!");
        final int[] numbers = {13, 12, 14, 6, 7};
        QuickSort qs = new QuickSort();
        qs.quickSort(numbers, 0, numbers.length - 1);
    }
}
