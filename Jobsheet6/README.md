|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository | https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/tree/main/Jobsheet6 |

## 6.2 Implementing Sorting Using Objects

# 6.2.2 Verification of Experiment Results

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/be3d53b6c2dc3c42cf6ebca8031377635d6887d5/Jobsheet6/images/Answer6.2.2.png)

# 6.2.3 Verification of Experiment Results

![alt text](Answer6.2.3)

# 6.2.4 Verification of Experiment Results

![alt text](Answer6.2.4)

# 6.2.5 Questions

1. Explain the function of the following program code:

![alt text](Questions6.2.5.1)

- The following program code have function to swap the bigest value from left to right position.

2. Show the program code that implements the minimum value search algorithm in selection sort!

- ![alt text](Answer6.2.5.2)

3. In insertion sort, explain the purpose of the condition in the loop.

![alt text](Questions6.2.5.3)

- This looping code provide main role as checking condition while the value of array want to check with next element and if the while Loop condition is correct then the code will run to next statement but if not correct, the code will be skip. 

4. In insertion sort, what is the purpose of the given command?

![alt text](Question6.2.5.4)

- The purpose is swap that element array with next element array.

# 6.3.3 Verification of Experiment Results

![alt_text](Answer6.3.3)

# 6.3.4 Questions!

1. From the following code snippet, answer question a-c:

![alt_text](Questions6.3.4.1)

a. Why is the condition in the bubbleSort() loop i < idx - 1?

- This outer loop iterates as many times as idx - 1 as needed to ensure the inner loop swap process runs until all data is sorted, either ascending or descending. It only requires the number of indexes to be reduced by one because when this outer loop runs, the sorting process is completed if i < idx - 1. Using the loop i < idx - 1 is the right calculation, no less and no more, in the inner loop swap process iteration

b. Why is the condition in the bubbleSort() loop j < idx - i - 1?

- This inner loop condition indicates that in every increase level (every outer loop already runs), the value of idx in the inner loop will decrease because every looping that's completed always has a value that is already sorted one by one (to the left side or to the right side), so the idx must decrease because several values/data are already sorted and do not need sorting again.

c. If the number of data in listStudents is 50, how many times will the i loop execute? How many stages of Bubble Sort will be performed?

- i loop will execute 49 times with 49 stages and 1225 comparisons total.

2. Modify the above program to allow dynamic student data input (from the keyboard) consisting of nim, name, studentClass, and gpa.

![alt_text](Answer6.3.4.2)

# 6.3.8 Verification of Experiment Results

![alt_text](Answer6.3.8)

# 6.3.9 Questions!

Explain the following code snippet in the correlation with the selection sort!

![alt_text](Questions6.3.9)

- At the beginning, the minIndex variable serves to store the 0th index of an array. 
FOR Loop j serves to loop to compare one by one the values in the array to get the smallest index value.
Entering the content of the loop, there is a Conditional Statement IF, acting as a value comparison one by one, which value is smaller.
In the FOR loop session, minIndex serves as a temporary container to store the smallest value resulting from the comparison represented by the index number.

The sequence is like this, when the minIndex variable is 0 (index 0), enter the loop session where j will be 1 and when the condition check is true so that it passes into the FOR Loop Statement, namely the Conditional Statement IF. In the Conditional Statement IF, compare the value between index j, which is 1 with the minIndex index value, which is 0. If the value in index 0 is smaller, the Conditional Statement IF will be skipped and loop back with a different index comparison, namely j = 2. If the value of index 2 is smaller than the value of index 0, it passes to the Conditional Statement and stores the smallest value index to minIndex which will repeat continuously until the last index. 

# 6.3.12 Verification of Experiment Results

![alt_text](Answer6.3.12)

# 6.3.13 Questions 

Modify the insertionSort() method so that it can perform a descending sorting!

![alt_text](Answer6.3.13)
