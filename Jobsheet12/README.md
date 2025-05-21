|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository | https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/tree/main/Jobsheet12 |

# 2.1.1 Output Verification

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/0e2c1db838b32be1e8c1e3dd1a307f4a78aa9415/Jobsheet12/images/Output2.1.1.png)

# 2.1.2 Questions!

1. Why does compiling the program code result in the message "Linked List is Empty" on the first line?

- because there are unavailable node that store to linked list. In beginning main class process, passing to sll.print() method which is go to SngleLinkedList class, to the print() method. There is also Conditional Statement with condition !isEmpty(). isEmpty() give boolean (true or false) answer if there is no nodes available. Becase in first step is sll.print() not sll.addFirst(), so there is no available nodes. 

2. Explain the general purpose of the variable temp in each method!

- temp variable have general purpose as the helper pointer when each method do traversing and mostly holds the reference to the current node being accessed. Help to checking one by one nodes, help when do insert some nodes and removing some nodes. 

3. Modify the code so that data can be added via keyboard input!

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5ac784c0592d7023925b99411d4972e02e570bd4/Jobsheet12/images/Answer2.1.2.2.png)

4. What would happen if we did not use the tail attribute? Would it affect the code implementation? Please explain.

- Tail attribute is opsional and not mandatory. The mandatory in linked list is head. Yes, it would give many affect code implementation in the addLast() and removeLast(). Without tail attibute, addLast() and removeLast() method must need traverse process until found the last nodes and then can add new node in last node or remove last node. 

# 2.2.2 Output verification

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5ac784c0592d7023925b99411d4972e02e570bd4/Jobsheet12/images/Verification2.2.2.png)

# 2.2.3 Questions

1. Why is the break keyword used in the remove function? Explain!

- break keyword used to stop removing loop and only once to remove some node.

2. Explain the purpose of the code below in the remove method.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/a62ef31d7dbf1486ed628716d72988a925c80067/Jobsheet12/images/Question2.2.3.2.png)

- temp.next = temp.next.next is code to skip one node (node that will be remove base on the keyword) also to connect node tmp with the next node temp after the deleted node.
