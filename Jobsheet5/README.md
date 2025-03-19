|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository | https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java |

## 5.2 Calculating Factorial Using Brute Force and Divide and Conquer Algorithms

# 5.2.2 Verification of Experiment Results

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d80c1bfc655d5a9050a66c02ffa7271f06322901/Jobsheet5/images/experimentResult5.2.2.png)

# 5.2.3 Questions

1. In the base case of the Divide and Conquer algorithm for calculating factorial, explain the differences in the code structure between the if and else conditions!

- The differences between  if  and  else  in Devide and Conguer algorithm is "if " was base case code condition and "else" was recursion to call the recursion function again until reach the base case condition. 
![alt text](baseCaseFaktorial)
Base Case "if"

![alt text](recursioncall)
Base Case "else"

2. Is it possible to modify the loop in the factorialBF() method to use an alternative to the for loop? Please explain and give example if needed!

- Yes, it is possible to modify the loop in the factorialBF() method.
  
![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d80c1bfc655d5a9050a66c02ffa7271f06322901/Jobsheet5/images/modifyFactorialBF().png)

In the loop process, consists of 3 main part include : initial, condition, update. From top image, we can modify the initialization part with variable n (input a number from user), codition part from i <= n become i > 0, and update part from i++ (increment) become i-- (decrement). With same value for facto variable = 1, next to for loop process. Begin with initialization i = 5 and then check the condition part. Because i = 5 and contion i > 0, it's true and execute the statement. First statement is : facto (the value is 1) = facto (value is 1) * i (value is 5) and the result of facto is 5. After that, next to decreement update (i value is 5 minus 1 => i = 4). Go back to initialization, i = 4 and the condition is still true, so the program will execute the statement with the same method like before which iteration and multiple until the value of i = 0, the program will stop. 

3. Please explain the differences between facto = facto*i; and int facto = n * factorialDC(n-1); !

- The difference between them is :

        facto = facto * i; 

- The value of facto will upgrade with the news value directly after the value of facto multiple with value of i. This happen directly and more simple to understand.

        int facto = n * factorialDC(n-1); is 

- The value of facto will upgrade with the news value if the recursive call (factorialDC(n-1)) reach the base case. After the base case give the value, recursive call before base case will iteration or substitusion with base case. The concepts will be like this : 

    facto = 5 * factorialDC(3);
                    5 * factorialDC(2);
                            5 * factorialDC(1);
                                    1

From this concept, 5 * 5 * 5 * 1 was the result of facto.
                                            
4. Make a conclusion about the differences in how each method works. factorialBF() and factorialDC()!

- factorialBF() consists  initialize variable facto = 1, for loop for iteration, and the return value. In for loop, each step of loop will upgrade the value of i which are each step of loop, the value facto will uprgade because of multiple with the latest value i and newest facto. 

- factorialDC() was recursive function, consists of base case (as a solution) and recursion call. In recursion call, the method was call the function it self until found base case and then the value of base case will multiple with previous formula until the first formula in recusrion call.

# 5.3 Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms

# 5.3.2 Verification of Experiment Results

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d80c1bfc655d5a9050a66c02ffa7271f06322901/Jobsheet5/images/ExperimentResult5.3.2.png)

# 5.3.3 Questions

1. Explain the differences between the two methods created powerBF() dan powerDC()!

- The most difference between them is powerBF() function use for loop with condition i less than exponent we fill in before. The statement is upgrade the result value with previous result multiple with base number we fill in before. On the other hand, powerDC() function was recursive function to call himself to get the value base case first. After found the base case value, that value will multiple with following formulas in else selection until the first recursion call.

2. Does the combine stage exist in the provided code? Show the relevant part!

- Yes, it does. 

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d80c1bfc655d5a9050a66c02ffa7271f06322901/Jobsheet5/images/Question2.5.3.3.png)

3. In the powerBF() method, parameters are used to pass the base number and its exponent, even though the Power class already contains attributes for these values (baseNumber and exponent atribute). Do you think it is still relevant for the method to have parameters? Could the method be implemented without parameters instead? If so, how would the powerBF() method be structured without parameters?

- Not all but sometimes it needs. Yes, it could be implemented without parameters. 

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d80c1bfc655d5a9050a66c02ffa7271f06322901/Jobsheet5/images/Question%203.5.3.3.png)

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d80c1bfc655d5a9050a66c02ffa7271f06322901/Jobsheet5/images/Question%203.1.5.3.3.png)

4. Summarize how the powerBF() and powerDC() methods work!

- powerBF() methods work using for loop to upgrade the value of result with formula result = result * n. Each loop step will multiple with the new value because increment and stop before the exponent condition.

- powerDC() methods work using recursive which are contain base case and recursion call. In recursion call, the method will call it again to the recursive function until found the base case. Base case is the solution and the answer to solve the recursion call. After get base case, the value of previous recursion call will iteration to that variable and multiple to that statement code. This happen until to first else statement. 

# 5.4.2 Verification of Experiment Results

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d80c1bfc655d5a9050a66c02ffa7271f06322901/Jobsheet5/images/answer5.4.2.png)

# 5.4.3 Questions

1. Why is mid variable needed in totalDC()method?

- mid variable have function to be separatator in array. mid variable will split 2 parts of array.

2. Explain the following statements in totalDC()method?

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d80c1bfc655d5a9050a66c02ffa7271f06322901/Jobsheet5/images/question1.5.4.3.png)

- in lsum variable contain recursion call which are handle in left side after the array split into 2 parts cause by nid variable. If we notice, parameter in that recursion call change into (arr, l, mid), different with recursive function (arr, l, r).
- rsum is variable that contain recursion call too like lsum but this one handle right side array after separate with mid variable. The parameter different with contai (arr, mid+1, r).

3. Why is it necessary to sum the results of lsum and rsum as shown below??

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d80c1bfc655d5a9050a66c02ffa7271f06322901/Jobsheet5/images/question3.5.4.3.png)

- it is necessary because without return that addition variable, the value of lsum and rsum will not combine. After that, the result will not appear as expectation. 

4. What is the base case of totalDC()method?

- base case of totalDC() method was 

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/beabaca4010530637819640257c03bb0155379b5/Jobsheet5/images/answer4.5.4.3.png)

5. Draw a conclusion about how totalDC() works!

- 
