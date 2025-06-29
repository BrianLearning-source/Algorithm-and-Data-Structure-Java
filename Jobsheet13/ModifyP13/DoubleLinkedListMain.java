package ModifyP13;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedListM dll = new DoubleLinkedListM();
        dll.print();
        dll.addFirst(new StudentM("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new StudentM("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new StudentM("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new StudentM("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new StudentM("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new StudentM("116", "Eiyu", "TI-1I", 3.4));
        dll.print();

        // Experiment 2
        
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();

    }
}
