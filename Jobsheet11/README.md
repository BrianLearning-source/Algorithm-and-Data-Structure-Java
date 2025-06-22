|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository | https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/tree/main/Jobsheet11 |

# 2.1.2 Output Verifivation

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/Verification%202.1.2.1%20JS11.png)
![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/Verification%202.1.2.2%20JS11.png)

# 2.1.3 Question

1. In the constructor, why are the initial of the front and rear attributes set to-1, while the size attribute is set to 0?

- Indicate there is no data in queue so that's why set to -1 and size is 0 (empty).

2. In the Enqueue method, explain the meaning and purpose of the following code snippet!

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/Q2.1.3.2.png)

- If rear is already at the last array index (max - 1), then change rear to 0 so you can start from the beginning of the array again if there is available space in the beginning of array (at index 0)

3. In the Dequeue method, explain the meaning and purpose of the following code snippet!

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/Q2.1.3.3.png)

- If the front has reached the end of the array (max index - 1), then we need to jump to the beginning of the array (index 0) to continue the dequeue process.

4. In the print method, why does the loop variable i start from instead of 0 (i.e., int i = 0)?

- front not always start from 0. Because in the queue data structure, the first appropriate element is at the front index, not at index 0 (because the object/element retrieval method may have been carried out so that some of the initial array indices are empty so that the front position in the index changes, after the previous index data is retrieved).

5. Review the print method again, and explain the meaning of the following code snipper!

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/Q2.1.3.5.png)

- The meaning of that code is when i variable already enter to the maximum index / last index of array, this code will make back again to the initial index.

6. Show the code snippet that represents a queue overflow!

- Condition when the queue already full. 

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/A%202.1.3.6.1%20JS11.png)
![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/A%202.1.3.6.7.2%20JS11.png)

7. When a queue overflow or underflow occurs, the program continues to run only displays informational text. Modify the program so that it stops when a queue overflow or uderflow happens!

- I using System.exit(1); to terminate the program insteadly.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/A%202.1.3.6.7.1%20JS11.png)
![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/A%202.1.3.6.7.2%20JS11.png)

# 2.2.2 Result Verification

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/RV%202.2.2.1.png)
![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/RV%202.2.2.2.png)
![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/RV%202.2.2.3.png)

# 2.2.3 Question

1. What is the main difference between the Queue (experiment 1) and StudentQueue classes in terms of the data type they manage? Why is this change in data type important?

- The different between Queue and StudentQueue is Queue class manage integer data type. int[] data only to store integer data type. while StudentQueue manage Student6 class as data type. Student6[] data store Student6 object which contain nim, name, studyProgram, and className each student. Store more complete and complex data compare than primitivr data type.

- Because using class data type can handle more complex and complete data than using primitive data types such as integer, char, short, long that only store / save one data type. Meanwhile class data type can store multiple value of data type.

2. How do the enqueue and dequeue methods in StudentQueue differ from those in Queue?

- In Queue, it uses the implementation of 3 checks/scenarios to determine the real index. But in studentQueue, it uses the following code which is much shorter and includes the 3 checks above.  

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94ddff22a92157a2e8b15b76bf28263b551ba515/Jobsheet11/images/A%202.2.3.2%20JS11.png)

- Also using class Student6 as data type compare to Queue class which is using primitivr data type int.

3. Examine the constructor of the StudentQueue class: why is the front attribute initialized to 0, whereas in the Queue class from Experiment 1, the front attribute is initialized to -1?

- Because once there is incoming data, only the position is affected. While front = -1 is used as an explicit empty queue marker. In StudentQueue, front is initialized to 0 because the queue logic only depends on the size, so there is no need for a special marker. Initializing front = 0 immediately prepares the queue to receive the first data.

4. Modify the program by adding a new method called viewRear() in the StudentQueue class to check the queue element at the rear position. Also, update the menu in the StudentQueueMain class by adding option 6: “Check rear of the queue,” so that the viewRear() method can be invoked.

![alt text](A 2.2.3.4.1 JS11)
![alt text](A 2.2.3.4.2 JS11)

