public class LinkedListAssignment6 {
    NodesAssignment6 front, rear;
    int count;
    int max;

    public LinkedListAssignment6(int max) {
        this.max = max;
    }

    boolean isEmpty() {
        return front == null;
    }

    void isFull() {
        if (count >= max) {
            System.out.println("Queue is full!");
        } else {
            System.out.println("Still can queue");
        }
    }

    void count() {
        System.out.println("Total students in queue: " + count);
    }

    void print() {
        if (isEmpty()) {
            System.out.println("No available data!");
        } else {
            System.out.println("Student Queue:");
            NodesAssignment6 tmp = front;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.println("First student in queue:");
            front.data.print();
        } else {
            System.out.println("No student in queue.");
        }
    }

    void peekLast() {
        if (!isEmpty()) {
            System.out.println("Last student in queue:");
            rear.data.print();
        } else {
            System.out.println("No student in queue.");
        }
    }

    void enqueue(DataAssignment6 data) {
        if (count >= max) {
            System.out.println("Queue is full. Cannot add new student.");
            return;
        }
        NodesAssignment6 newNode = new NodesAssignment6(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("No student to process.");
        } else {
            System.out.println("Processing student:");
            front.data.print();
            front = front.next;
            count--;
            if (front == null) rear = null;
        }
    }

    void clear() {
        front = rear = null;
        count = 0;
        System.out.println("Queue is cleared!");
    }
}
