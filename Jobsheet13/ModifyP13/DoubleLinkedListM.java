package ModifyP13;

public class DoubleLinkedListM {
    NodeM head;
    NodeM tail;
    int size;

    DoubleLinkedListM() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(StudentM data) {
        NodeM newNode = new NodeM(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(StudentM data) {
        NodeM newNode = new NodeM(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void insertAfter(String key, StudentM data) {
        NodeM newNode = new NodeM(data);
        NodeM temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Insertion failed. Data (" + key + ") not found!!");
        }
    }

    void print() {
        if (!isEmpty()) {
            NodeM temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double linked list is currently empty!!");
        }
    }

    // Experiment 2

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // Modify 12.3.3 Question number 3

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head.next == null) {
            head = null;
        } else {
            NodeM temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
            size--;
        }

        // if (isEmpty()) {
        //     System.out.println("Double linked list is currently empty!!");
        // } else if (head == tail) {
        //     head = tail = null;
        // } else {
        //     tail = tail.prev;
        //     tail.next = null;
        // }
    }

    // Modify 12.3.3 Question number 7

    void remove(int index) { 
         if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (index < 0 || index >= size) {
            System.out.println("Invalid index! Index must be between 0 and " + (size - 1));
        } else if (index == 0) {
            removeFirst(); 
        } else if (index == size - 1) {
            removeLast(); 
        } else {
            NodeM temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--; 
        }
        
        // if (isEmpty()) {
        //     System.out.println("Double linked list is currently empty!!");
        // } else if (index == 0) {
        //     removeFirst();
        // } else {
        //     NodeM temp = head;
        //     for (int i = 0; i < index; i++) {
        //         temp = temp.next;
        //     }
        //     if (temp == tail) {
        //         removeLast();
        //     } else {
        //         temp.prev.next = temp.next;
        //         temp.next.prev = temp.prev;
        //     }
        // }
    }


}
