|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository | https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/tree/main/Jobsheet7 |

# 7.2 Result

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/f21195f8d31d7f87748c838d7a084fd022640a49/Jobsheet7/images/Result7.2.1.png)

# 7.3 Question

1. What is the difference between the methods displayData and displayPosition in StudentSearch class?

- displayData() method display all student data in that index of array meanwhile displayPosition() method only display the index of location that data store in the array.

2. What is the function of break in this following program code?

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Question7.3.2.png)

- break; code have function to stop (once) the searching after found the data that user want in array.

3. If the NIM data inserted is not sorted from smallest to biggest value, will the program encounter an error? Is the result still correct? Why is that?

- No, the program stil execute until found the NIM's user want. The result will still correct. Because in sequential searching contains FOR loop to repetitive the index from begin index until the specified index in array and Conditional Statement IF to execute the source code if the value is same with the condition although not sorted inserted, not give any effect. 

4. Look at findSeqSearch method, why position is initialized by -1 instead of 0?

- The position is initialized by -1 instead of 0 because if we write it 0, the index of position in array always in index 0 so that's why we can write -1. -1 indicate that the data is not found.

# 7.2 Result

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Result7.2.2.png)

# 7.3 Question

1. Show the program code in which runs the divide process!

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Answer7.3.1.png)

2. Show the program code in which runs the conquer process!

![alt_text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Answer7.3.2.png)

3. If inserted NIM data is not sorted, will the program give the correct result? Why?
    If inserted NIM data is sorted from largest to smallest value (e.g 20215, 20214 20212, 20211,20210) and element being searched is 20210. How is the result of binary search? does it return the correct one? if not, then change the code so that the binary search executed properly

- No, the program will give uncorrect result because Binary Searching designed to searching after the data already sorted. Based on the SearchStudent class on findBinarySearch() method, after divide the array of object into 2 part with first conditional statement, the next Conditional statement will return the mid data first. If not correct, go to the Else If 1 with condition (listStd[mid].nim > search) which are continue to searching in the left side that indicate that left side have more less value than middle to right side. If from here there's some mistake because unsorted data / array, than the output will appear uncorrect answer or not found because get skip when recursive call.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Answer7.3.3.png)

- The result of binary search is not found. The result give uncorrect one.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Answer7.3.3.1.png)

4. Modify program above so that the students amount inserted is matched with user input

- First, we delete "new Students[5]" in array of object on the SearchStudent class attribute. 

Before :

![alt image](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Answer7.3.4.1.png)

After : 

![alt image](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Answer7.3.4.2.png)

- After that go to the MainStudent class. Modify the code before into this and add user input so that the student amount inserted is matched with user want.

Before : 

![alt image](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Answer7.3.4.3.png)

After : 

![alt iamge](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/5333441602f49110a3772fb1f6ff5c0e6539259c/Jobsheet7/images/Answer7.3.4.4.png)

# 7.2 Result

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/94517ee1ad80c2e80b5fe7f9bbad2ff8ff2fb4aa/Jobsheet7/images/7.2%20Aswer.png)

