package week7;

public class SortMain {
    public static void main(String[] args) {
        MergeSort sorting = new MergeSort();
        System.out.println("Sorting wth merge sort \nInitial Data");
        int[] array = {10, 40, 30, 50, 70, 20, 100, 90};
        sorting.printArray(array);
        System.out.println("Sorted Data");
        sorting.mergeSort(array);
        sorting.printArray(array);
    }
}
