package week06;

public class SortingMain6 {
    public static void main(String[] args) {

    int[] a = {34, 7, 23, 32, 5, 62};
    Sorting6 sorting = new Sorting6(a); 
    
    System.out.println("Original array : ");
    sorting.print();
    sorting.bubbleSort();
    System.out.println("Sorted array (Bubble Sort) : ");
    sorting.print();

    int[] b = {30, 20, 2, 8, 14};
    Sorting6 sorting2 = new Sorting6(b);

    System.out.println("Original array: ");
    sorting2.print();
    sorting2.selectionSort();
    System.out.println("Sorted array (Selection Sort): ");
    sorting2.print();

    int[] c = {40, 10, 4, 9, 3};
    Sorting6 sorting3 = new Sorting6(c);

    System.out.println("Original array: ");
    sorting3.print();
    sorting3.insertionSort();
    System.out.println("Sorted array (Insertion Sort): ");
    sorting3.print();
}
}
