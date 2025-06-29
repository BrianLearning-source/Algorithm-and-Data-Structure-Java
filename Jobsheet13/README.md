|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository | https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/tree/main/Jobsheet13 |

# 12.2.2 Output Verification

![alt text](Verification12.2.2)

# 12.2.3 Questions

1. Explain the difference between a singly linked list and a double linked list.

- The different between singly linked list and double linked list is singly linked list only have 1 pointer which are reference to next node. Meanwhile double linked list have 2 pointer contain next pointer and previous pointer. 

2. Observe the Node class, which contains the attributes next and prev. What are the purposes of these attributes?

- in Node class, there have attribute next and prev. The purpose of attribute next as a pointer that connect to next node. While attribute prev as a pointer that connect to previous node.  

3. Examine the constructor in the DoubleLinkedLists class. What is the purpose of this constructor?

![alt text](Question12.2.3.3)

- To initialize double linked list attribute pointer (next and previous poointer ) as null.

4. In the addFirst() method, what is the meaning of the following code?

![alt text](Question12.2.3.4)

- The code refers to addFirst() method in CONDITIONAL STATEMENT IF when there is no node / empty node in double linked list. If the condition is true, the following statement execute to give the newNode have 2 pointer, are head at once become tail too.  

5. In the addFirst() method, what does the statement head.prev = newNode mean?

- Statement head.prev = newNode; mean prev pointer of the node that is currently the head (the old node that was previously at the front) is linked to newNode (the newly added node).

6. In the insertAfter() method, what is the meaning of current.next.prev = newNode?

- current.next.prev = newNode; updates the previous pointer of the node after temp, so that it correctly points to the new node being inserted in between.

7. In the experiment 1 code, in which method the traversal process implemented? What is the meaning of temp = temp.next ?

- method the traversal process implemented is insertAfter() method and print() method.

InsertAfter(String key, Student data)
![alt text](A 12.2.3.7.1)
![alt text](A 12.2.3.7.2)

print()
![alt text](A 12.2.3.7.3)

- The meaning of temp = temp.next is updates the temp variable to no longer point to the current node, but instead points to the next node in the double linked list.

8. In the insertAfter() method, what is the following code for?

![alt text](Question12.2.3.8)

- That following code used when node position that will adding in the fact get in the last position (tail) on the double linked list. If pass from CONDITIONAL STATEMENTA condition, continue to run addLast(data) method.
- It depents by users but for efficient and effective way, recommended to implement it.
- If we remove this code method, it will appear several problem such as if the double linked list is empty node, it will appear error because there is none node can be pointer to the next or previous node also if some case, the node that will adding is in the last node, appear null pointer like the following image.

![alt text](A. 12.2.3.8)

9. In the insertAfter() what is this statement if(temp.data.nim.equalsIgnoreCase(key)) for?

- That code have important role in this inserAfter() method because this code have to comparison (pair data between key and data on the node is match or not) the current node instead of doing traversal.

# 12.3.2 Output Verification

![alt text](12.3.2 Output Verification)

# 12.3.3 Questions

1. What is the use of the following statement in the removeFirst() method?

![alt text](Q 12.3.3.1)

- That following statement in the removeFirst() have function to :
head = head.next; reposition the head of the current node to the next node. Then head.prev = null; nullify the node that was previously be the head / cut off the link from pointer prev head to the first node.

2. Why is it important to include conditions and processes like the ones below in both removeFirst() and removeLast() methods? Explain!

![alt text](Q 12.3.3.2)

- The condition else if (head == tail) is crucial for edge-case handling when the list has only one node remaining. Because head and tail point to the same node so after deleting this node, the double linked list become empty afterward. Without this code might incorrectly assume there are multiple nodes (e.g., accessing head.next or tail.prev), leading to NullPointerException

3. In the removeLast() method, if there is no tail attribute inside DoubleLinkedLists class, what approach or changes need to be made to the code of the method?

- One approach that can use if there is no tail attribute is using traversal, adding new variable with Node datatype to help us as a object pointer on the Node class. Using while with condition (temp.next != null) with statement on the while is temp.next = temp as a traversal method to go until found the last node. And then using code temp.prev.next = null, indicate that temp in the last node will go back to previous node with prev as a pointer and then nullify (cut off) the last node with next.

![alt text](12.3.3.3 JS 13)

4. What is the purpose of the initial if(isEmpty()) check in the remove(int index) method?

- The purpose is to give information that the doubly linked list is still empty. Instead in remove(int index) method, this initial if(isEmpty()) check was important one because if skip this condition with the following statement, remove(int index) method will not give any output. So better to give isEmpty() as checker if the double linked list is empty or no. 

5. Explain how the method handles the removal of a node at the beginning (index == 0) and at the end (temp == tail) of the linked list.

- After the user input number of index that will be remove, that number of index will be check in condition (index == 0). This condition checks if the index is 0, meaning the first node (head) should be removed. And for condition (temp == tail), After traversing the list to the specified index, it checks if the temp node (the one at that index) is the last node (tail).

6. Describe how the method updates the links between nodes when removing a node from the middle of the linked list.

-  When removing a node from the middle of a doubly linked list, the method updates the prev and next pointers of the surrounding nodes so that the node being removed is "skipped over" and effectively disconnected.

7. The remove(int index) method currently does not check for negative index or index that exceed the size of the DoubleLinkedLists. Please add statements to handle these cases.

![alt text](A 12.3.3.7 JS13)
