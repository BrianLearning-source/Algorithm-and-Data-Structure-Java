|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository |  |

# 2.1.1 Output Verification

![alt text](Output2.1.1)

# 2.1.2 Questions!

1. Why does compiling the program code result in the message "Linked List is Empty" on the first line?

- because there are unavailable node that store to linked list. In beginning main class process, passing to sll.print() method which is go to SngleLinkedList class, to the print() method. There is also Conditional Statement with condition !isEmpty(). isEmpty() give boolean (true or false) answer if there is no nodes available. Becase in first step is sll.print() not sll.addFirst(), so there is no available nodes. 

2. Explain the general purpose of the variable temp in each method!

- temp variable have general purpose as the helper pointer when each method do traversing and mostly holds the reference to the current node being accessed. Help to checking one by one nodes, help when do insert some nodes and removing some nodes. 

3. Modify the code so that data can be added via keyboard input!

![alt text](Answer2.1.2.2)

4. What would happen if we did not use the tail attribute? Would it affect the code implementation? Please explain.

- Tail attribute is opsional and not mandatory. The mandatory in linked list is head. Yes, it would give many affect code implementation in the addLast() and removeLast(). Without tail attibute, addLast() and removeLast() method must need traverse process until found the last nodes and then can add new node in last node or remove last node. 

# 2.2.2 Output verification

![alt text](Verification2.2.2)

# 2.2.3 Questions

1. Why is the break keyword used in the remove function? Explain!

- break keyword used to stop removing loop and only once to remove some node.

2. Explain the purpose of the code below in the remove method.

![alt text](Question2.2.3.2)

- temp.next = temp.next.next is code to skip one node (node that will be remove base on the keyword) also to connect node tmp with the next node temp after the deleted node.