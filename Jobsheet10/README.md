|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository | https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/tree/main/Jobsheet10 |

# 2.1.2 Verification 

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/Verification%202.1.2.1.png)

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/Verification%202.1.2.2.png)

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/Verification%202.1.2.3.png)

## 2.1.3

1. Explain the role of the stack data structure in the student assignment management system. Why was a stack used instead of another data structur (e.g., gueue or list)?

- Stack data structure, store the input data. Similar like array but the the difference between stack and array is the element of array can be manipulate easly in any position of index from first index until last index, while the stack, if want to take or pop up the first item, then must to pop up items from top position until the direct item user want. Stack data structure have LIFO concepts. LIFO stands for Last In First Out. So stack data structure practice first data enter will out in last time while last item is insert, will out firstly. Let's take some example. In the practicum 1, when students submit their assignments, the first student assignment will put his/her task in the table and then next student will do the same thing so the first student task will stacked. Again and again with the next student. The lecturer will grading students assignments from top (lastest student assigment) to bottom.

2. What is the difference between the push() and pop() methods in a stack, and how are they used in this program?

- push() method used to insert the item / data to the stack while pop() method used to removing item / data from the stack.

3. Why is it important to check the condition !isFull() before calling the push() method? What could go wrong if this check is removed?

- isFull() method have function to check the stack is already full or not so that's why this one important checker in beginning push() method. Without this check condition, user will get error message "ArrayIndexOutOfBoundsException". This is was the message that the stack is already full and can't insert some data / item / element again except have some empty space to store the data.  

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/A2.1.3.3.png)

4. How many student assignments can be stored in the current implementation of the stack? Provide the specific line of code or variable that determines this.

- Number can be stored is 5 student assignments.

Instantiation and initialize how many number can stored in StudentAssignmentStack stack as a object. Image 1 in StudentDemo6 class

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/A2.1.3.4.png)

connected to stack on the StudentAssignmentStack class.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/A2.1.3.4.2.png)

5. Modify the existing stack implementation so that the system can also show the first student who submited their assignment. Describe the changes you made in both StudentDemo and Student Assignment classes.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/A2.1.3.5.1.png)

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/A2.1.3.5.2.png)

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/A2.1.3.5.3.png)

- In StudentAssignmentStack class, i modify the index of stack that will be return. I fill in the 0 as the index that will be return because first input data in stack always be stored in index 0 not index 1 or etc.in the StudentDemo6 class, i only change the statement to show who is the first student that submit his/her assignment. Don't forget to change in the menu too.

6. Implement a method to count and return the number of assignments currently stored in the stack. Describe how your method works.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/A%202.1.3.6.png)

- Firstly, create count variable with initialize the value 0. This variable store number to displat many data that stored in stack. Next is FOR LOOP with initialize j variable with top variable, condition j more than equal 0 (to stop if the value not until -1 and down later), and j decrement. top variable store data in top position, that's why we initialize the j with top so that the looping will be execute from top position to index 0 with decrease method j--. After reach into 0 and then go to -1, this make false condition so that the loop will break and continue to return the latest value of count variable.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/A%202.1.3.6.1.png)

- This is the modification in StudentDemo6 class to display the count of stored assignment.

7. What did you learn from this experiment about stack-based systems? Reflect on a real-world application where this kind of system might be useful.

- Stack-based system applicate the LIFO. LIFO stands of Last In First Out means the data that already input firstly, can only be remove in the last step with pop(). 
-We can take the example from e-banking. E-banking provide history transaction. In the history transaction, there is use LIFO because the latest transaction will appear in the top order rather than bottom order. Why LIFO ? because many user need the  proof of transaction after user already do the transaction by transfer. If we throw it into the bottom order, user need to scroll down until found the latest transaction.

8. Don't forget to synchronize the changes you made from this qeustions into your repository!

- See in ModifyExperiment package that save all the modification or changes from the original. 

# 2.2.2 Verification

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/V%202.2.2.png)

# 2.2.3 Questions

1. Explain the workflow of the convertToBinary() method.

- convertToBinary() method was the method to convert grade number into binary number. First in the code  ConversionStack6 stack = new ConversionStack6(); , create the stack object with name stack. Stack will used to store remaining of the division (mod) when grade number divided with 2. Next, WHILE loop (grade > 0), to calculate binary number from grade number and will continue during grade more than 0. Continue to int mod = grade % 2, take the remaining of divided by 2 from grade. This code used to product bit in the rightmost binary digit. stack.push(mod), store the result mod to stack.grade = grade / 2, diivided gradi by 2 and to preparing grade number to next iteration. String binary = ""; , preparing string empty variable to store the result of binary conversion. while (!stack.isEmpty()), during the stack is not empty, take (pop) the elemen one by one from top position. binary += stack.pop(), pop() take the value from top position in stack and merge to binary string. return binary; , return string, the result of conversion from grade number to binary.

2. In the convertToBinary() method, change the loop condition to while (grade != 0). What is the result? Explain the reason!

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4482e0c0e67adafc15958fe999531849aebe5b06/Jobsheet10/images/A%202.2.3.2.png)

- The result is same with the source code before modify the while into the WHILE(grade != 0). But the lack using this method is the program will execute even the grade until negative. If using the previous source code, more safe and ensure that the the program execute only for positive integer, not until negative integer. 
