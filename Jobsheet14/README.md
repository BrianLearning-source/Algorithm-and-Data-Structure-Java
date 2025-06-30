|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/tree/main/Jobsheet14 |

# Output Verification

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5de9d86a8e1688bf2a8556d94f9dbc3082bbb6ce/Jobsheet14/images/OV%20Tree.png)

# 14.2.2 Questions

1. Why is data search in a binary search tree more efficient compared to a regular binary tree?

- Because a Binary Search Tree (BST) maintains a specific ordering rule, while a regular binary tree does not. A Binary Search Tree is faster for search because it leverages ordered structure to eliminate half of the tree at each step.
A regular binary tree lacks this structure and requires brute-force traversal.

2. What are the purposes of the left and right attributes in the Node class?

- Left and right attribute define the structure of the tree. Left Right let each node point to subtrees on the left and right. The passion is for adding, deleting, searching, and traversing in binary trees.

3. a. What is the function of the root attribute in the BinaryTree class?

- The root is the top-most node of your binary tree — it serves as the starting point of the entire structure. As a gateway to every node and a fundamental reference for all tree operations.

3. b. When a BinaryTree object is first created, what is the initial value of root?

- When a BinaryTree00 object is first created, the initial value of root is null.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5de9d86a8e1688bf2a8556d94f9dbc3082bbb6ce/Jobsheet14/images/A%2014.2.2.3b.png)

4. When the tree is empty and a new node is to be added, what process takes place?

- When the tree is empty and add a new node in BinaryTree00 class specially in add(Student00 data) method after user input the element of data on the BinaryTreeMain00 class.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5de9d86a8e1688bf2a8556d94f9dbc3082bbb6ce/Jobsheet14/images/14.2.2.4.1%20JS15.png)

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5de9d86a8e1688bf2a8556d94f9dbc3082bbb6ce/Jobsheet14/images/14.2.2.4.2%20JS15.png)

5. Consider the following line of code inside the add() method. Explain in detail the purpose of this line of code.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5de9d86a8e1688bf2a8556d94f9dbc3082bbb6ce/Jobsheet14/images/Q%2014.2.2.4.png)

- This block is responsible for finding the correct position to insert a new node into the tree based on the ipk of the Student00 object.
It ensures the tree follows Binary Search Tree (BST) rules: Left child contains smaller ipk and right child contains larger ipk

if (data.ipk < current.data.ipk)
You're comparing the ipk of the new student with the current node:

If the new ipk is smaller → go to the left subtree.
If a left child already exists → move the pointer (current) to the left child, and repeat the loop again from there.
If the left child is null → insert the new node here as the left child of the current node.
break is used to exit the loop after insertion.

else if (data.ipk > current.data.ipk)
If the new ipk is greater than the current node's:
The new node should go into the right subtree
If a right child exists → continue traversing to the right.
If no right child exists → insert the new node here.
break again to exit after successful insertion.

6. Explain the steps involved in the delete() method when removing a node that has two children. How does the getSuccessor() method assist in this process?

- Find the node to delete by traversing the tree using the given ipk. After that, check if node has two children: both left and right are not null. Next, call getSuccessor() to find the in-order successor — the smallest node in the right subtree. Then, replace the deleted node with the successor:
If the node is the root, update root = successor.
If not, link the parent of the deleted node to the successor.
Finally, linking the successor's left child to the deleted node's left child.

- getSuccessor() assist with : 
a. Finds the smallest node in the right subtree.
b. Maintains binary search tree properties.
c. Reconnects any right child of the successor back to its parent before replacement.

# Output Verification

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5de9d86a8e1688bf2a8556d94f9dbc3082bbb6ce/Jobsheet14/images/BTAM.png)

# 4.3.2 Questions

1. What is the purpose of the data and idxLast attributes in the BinaryTreeArray class?

- For the data, was an array of Student00 objects that represents a binary tree stored in array form that holds the binary tree nodes. While idxLast as an integer that keeps track of the last (or highest) index in the data array where a node (student) is stored. To ensures that traversal (like inOrder) doesn't go beyond the populated part of the array.

2. What is the function of the populateData() method?

- The populateData() method serves to initialize or update the contents of the binary tree stored in array form. Contain with 2 line of code : 

this.data = data;
Replaces the current tree data with a new Student00[] array — effectively setting up the structure of the tree.

this.idxLast = idxLast;
Sets the position of the last valid index in the tree, so that methods like traverseInOrder() know how far to go during traversal.

3. What is the purpose of the traverseInOrder() method?

- TraverseInOrder() method has purpose to visit and print the nodes of a binary tree in in-order sequence using an array-based representation of the tree.

4. If a binary tree node is stored at index 2 in the array, at which indices are its left and right children located, respectively?

- If a binary tree node is stored at index 2 in an array-based binary tree, then left child is at index 5 and right child is at index 6.

5. What is the purpose of the statement int idxLast = 6 in Experiment 2, step 4?

- To indicate the last valid index of the binary tree data in the array. Since the array data contains 7 elements (m1 to m7), the last valid index is 6 to let BinaryTreeArray06 class know to which index the tree is populated and also prevent traversal method from accesssing / processing indices beyong the actual data.

6. Why are the indices 2 * idxStart + 1 and 2 * idxStart + 2 used in the recursive calls, and how do they relate to the structure of a binary tree represented as an array?

- Because 2 * idxStart + 1 and 2 * idxStart + 2 are used to navigate the structure of a binary tree stored in an array. They correspond to the left and right child of a node at index idxStart.
- They relate to the structure because 2 * idxStart + 1 and 2 * idxStart + 2 express correspond to the positions of a node's left and right children when a binary tree is stored in a array using level-order indexing. This mathematical rule allows binary trees to be more easier to navigated and traversed without using explicit pointers or node object with child references.
