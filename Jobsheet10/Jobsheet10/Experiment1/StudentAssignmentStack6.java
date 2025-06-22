package Jobsheet10.Experiment1;

public class StudentAssignmentStack6 {
    Student6[] stack;
    int top, size;

    StudentAssignmentStack6(int size) {
        this.size = size;
        top = -1;
        stack = new Student6[size];
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Student6 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("stack is already full!");
        }
    }

    Student6 pop() {
        if (!isEmpty()) {
            Student6 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Student6 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    // Student6 peek() {
    // if (!isEmpty()) {
    // return stack[0];
    // } else {
    // System.out.println("There is no data in Stack!!");
    // return null;
    // }
    // }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].name + "\t" + stack[i].nim + "\t" + stack[i].className);
        }
        System.out.println("");
    }
}
