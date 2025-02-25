|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository | https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java |

## 2.1 Experiment 1: Declaring Classes, Attributes, and Methods

# 2.1.1 Source code

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/ea14f1cc527fece8dd2942f087a61f6c0ae78e7b/Jobsheet2/images/2.1%20Raw%20code.png)

# 2.1.2 Verification Experiment Result

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/43b465b7ee03feba0735e107243b7da1e4dc914c/Jobsheet2/images/result%202.1.png)

# 2.1.3 Questions

1. Mention two characteristics of a class or object!

- Class have general attributes, in other hand object have more specific attributes.
- Class and object have connection. Because class was template to object and object was real figure or real object of class that have specific attributes and method. 

2. How many attributes does the **Student** class have? List them!

- Student class have 4 attributes. Include :
      -  studentID
      -  name
      -  className
      -  gpa

3. How many methods does the **Student** class have? List them!

- Student class have 4 method such as:
      -  print()
      -  changeClass()
      -  updateGpa()
      -  evaluate()

4. Modify the **updateGPA()** method to validate that the input IPK is within the range of 0.0 to 4.0. If it is out of range, display a message: "Invalid IPK. Must be between 0.0 and 4.0."

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/43b465b7ee03feba0735e107243b7da1e4dc914c/Jobsheet2/images/modify%202.1.png)

5. Explain how the **evaluate()** method evaluates student performance. What criteria does it use, and what does it return?

- evaluate() as the method of **Student** class have funtion to evaluates gpa student and difine it as the word grade as the value pf grade. Criteria so that this method use is as long as the value of gpa is right (int or double number), not invalid number like more than 4 or less than 0. This method will return the word grade as the value of grade. More high your grade, more good the word and vice versa.

## 2.2 Experiment 2: Object Instantion and Accessing Attributes and Methods

# 2.2.1 Source Code

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/43b465b7ee03feba0735e107243b7da1e4dc914c/Jobsheet2/images/2.2.png)

# 2.2.2 Verification of Experiment Result

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/43b465b7ee03feba0735e107243b7da1e4dc914c/Jobsheet2/images/result%202.2.png)

# 2.2.3 Questions

1. Show the line of code in StudentMain used for instantiation. What is the name of the created object?

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/43b465b7ee03feba0735e107243b7da1e4dc914c/Jobsheet2/images/2.2.3.png)

- The name of the created object is **student1**.

2. How do you access attributes and methods of an object?

- After do instantioaion to create an object in the class, to access attributes and methods need to access the attributes first and then give the value of that attributes. After that, access the methods.
  Example :
  -  The object is student1
  -  The attribute is studentID, to access the attribute of an object, do this 🔀  student1.studentID = "244107020097"; // object.attribute = value;
  -  The method is print(), to acces the method of an object, do this 🔀 student1.print();                              // object.method;

3. Why does the output of the first and second calls to print() differ?

- Output of the first and second calls to print() different in Class and GPA. Because in first value of attribute className is TI-1I and value of gpa is 3.8 and then go to the method _student1.print();_ who are access to **Student6** class to the method print() to display the class and gpa. Back again to **StudentMain** class, in method _student1.changeClass()_, the input is TI-2I automatically change the value of attribute className to TI-2I. This apply to in attribute gpa who are in method updateGPA, the input value is 3.9. After that the method print() will display the different specific attributes.


