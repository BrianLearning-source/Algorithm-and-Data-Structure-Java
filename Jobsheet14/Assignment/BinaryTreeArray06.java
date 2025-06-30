package Assignment;

import Week14.Student00;

public class BinaryTreeArray06 {
    Student00[] data;
    int idxLast;

    public BinaryTreeArray06() {
        data = new Student00[10];
        idxLast = -1;
    }

    void populateData(Student00[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Student00 student) {
        if (idxLast < data.length - 1) {
            idxLast++;
            data[idxLast] = student;
        } else {
            System.out.println("Binary Tree is full!");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                data[idxStart].print(); // Visit current node
                traversePreOrder(2 * idxStart + 1); // Visit left child
                traversePreOrder(2 * idxStart + 2); // Visit right child
            }
        }
    }

}
