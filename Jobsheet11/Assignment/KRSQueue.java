package Assignment;

public class KRSQueue {
    Student[] data;
    int front, rear, size, max, finished;

    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
        finished = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        finished = 0;
        System.out.println("Queue cleared.");
    }

    void enqueue(Student std) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = std;
        size++;
        System.out.println(std.name + " added to queue.");
    }

    void dequeue() { // 2 object at once
        if (finished >= 30) {
            System.out.println("Maximum 30 students already processed.");
            return;
        }
        if (size < 2) {
            System.out.println("Not enough students to process (need 2).");
            return;
        }
        for (int i = 0; i < 2; i++) {
            Student std = data[front];
            System.out.println("Processing KRS Approval for:");
            std.print();
            front = (front + 1) % max;
            size--;
            finished++;
        }
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        System.out.println("Students in queue:");
        for (int count = 0; count < size; count++) {
            data[i].print();
            i = (i + 1) % max;
        }
    }

    void showFrontTwo() {
        if (size < 2) {
            System.out.println("Less than two students in queue.");
            return;
        }
        System.out.println("First two students in queue:");
        data[front].print();
        data[(front + 1) % max].print();
    }

    void showRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Last student in queue:");
        data[rear].print();
    }

    void totalInQueue() {
        System.out.println("Total in queue: " + size);
    }

    void totalCompleted() {
        System.out.println("Completed approvals: " + finished);
        System.out.println("Remaining to process (max 30): " + (30 - finished));
    }
}
