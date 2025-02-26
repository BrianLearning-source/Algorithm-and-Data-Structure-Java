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

# 2.3 Experiment 3 : Creating Constructor

# 2.3.2 Verification of Experiment Results :

![alt telxt](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/f8bfa9cb58d412c15143210452ba0d7e76261ba9/Jobsheet2/images/Result%202.3.png)

# 2.3.3 Questions

1. Show the line of code in **Student** used to declare the parameterized constructor.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/d94d9759b307f80afe5275831686a8a1835d6ebd/Jobsheet2/images/Questions1.png)

2. In **StudentMain**, explain what the following line of code does:
_Student student2 = new Student("244107020040", "Rizky", "TI-1I", 3.5);_

- That code is one of perimeter constructor to instantiation directly to the attributes of object of that class. Also more effective to write down that code.

3. Remove the default constructor from Student, then compile and run the program. What happens? Explain why.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/c22583e255e84b896de88c369d751ab0670436ea/Jobsheet2/images/questions3.png)
![allt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/78c425fd068861c741bb2423cd0124cf01652767/Jobsheet2/images/questions3%2C1.png)
Appear undefined notification and then in **StudentMain** class, display an red underlined to the code. This happen because in **Student6** class, the default constructor who are should be had already have connection access with instantiation **Student6 student1 = new Student6();** who are also need default constructor.

4. After instantiating an object, do methods in Student need to be accessed in order? Explain.

- More better if the methods need accessed in order. Because with order code method, the programer will helped in order when to check sequence method and dicreased mistake in call some method.  

5. Create a new object named student<StudentName> using the parameterized constructor from Student class.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4aff4c87be64e203b34f4bdec11baee4c120f8f5/Jobsheet2/images/modify%20question5.png)

result : 

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4aff4c87be64e203b34f4bdec11baee4c120f8f5/Jobsheet2/images/result%20question%205.png)

# 2.4 ASSIGNMENTS

1. Result from **Course6** class and **CourseMain6** class source code:

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/4a0cf2a5570bb0e47507ad4622186bd8aed23640/Jobsheet2/images/Result%20Assignment1.png)

2. Result from Lecturer6 class and LecturerMain6 class source code:

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/979e933c0a084e70d4b14ca4824181d4b8650459/Jobsheet2/images/Result%20Assignment2.png)
