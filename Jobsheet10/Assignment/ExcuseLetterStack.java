package Assignment;

public class ExcuseLetterStack {
    ExcuseLetter6[] stack;
    int top, size;

    ExcuseLetterStack (int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter6[size];
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

    void submitLetter(ExcuseLetter6 excuse) { //push
        if (!isFull()) {
            top++;
            stack[top] = excuse; 
        } else {
            System.out.println("Sorry, limit submited letter. Try again later!!!");
        }
    }

    ExcuseLetter6 processExcuseLetter() { //pop
        if (!isEmpty()) {
            ExcuseLetter6 excuse = stack[top];
            top--;
            return excuse;
        } else {
            System.out.println("There is no excuse letter in Stack!!!");
            return null;
        }
    }

    ExcuseLetter6 viewLatestExcuseLetter() { //peek
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no excuse letter in Stack");
            return null;
        }
    }

    ExcuseLetter6 searchForLetter(String studentName) {
        if(!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (stack[i] != null && stack[i].name.equalsIgnoreCase(studentName)) {
                    System.out.println("|||| EXCUSE LETTER FOUND ||||");
                    System.out.println("Found at index \t" + (i + 1));
                    System.out.println("Student ID \t: " + stack[i].id);
                    System.out.println("Student name \t: " + stack[i].name);
                    System.out.println("Student class \t: " + stack[i].className);
                    System.out.println("Type of excuse \t: " + stack[i].typeOfExcuse);
                    System.out.println("Duration \t: " + stack[i].duration);
                    return stack[i];
                }
            }
            System.out.println("excuse letter for " + studentName + "not found");
            return null;
        } else {
            System.out.println("There is no data to search!");
            return null;
        }
    }

  
}
