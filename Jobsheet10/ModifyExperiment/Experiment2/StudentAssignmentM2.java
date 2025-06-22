package ModifyExperiment.Experiment2;

public class StudentAssignmentM2 {
    StudentM2[] stack;
    int top, size;

    StudentAssignmentM2(int size) {
        this.size = size;
        top = -1;
        stack = new StudentM2[size];
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

    void push(StudentM2 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("stack is already full!");
        }
    }

    StudentM2 pop() {
        if (!isEmpty()) {
            StudentM2 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    StudentM2 peek() {
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

    String convertToBinary(int grade) {
        ConversionStack6 stack = new ConversionStack6();
        while (grade != 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    } 
}
