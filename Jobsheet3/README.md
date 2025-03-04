|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020035 |
| Name |  Brian Serafino Donovan |
| Class | TI - 1I |
| Repository | https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java |

## 1.2 Create, insert, and display Array of Object

# 1.2.2 Result

![alt text]([arrayO1](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/arrayO1.png))

# 1.2.3 Questions

1. Based on part 1.2, does the class that are going to be used as an array of object must have attributes and methods? Please explain!

- Yes, it does. Because every single object who are will store in that array as a element, can save the object even they attributes and method. In previous meeting, class can have attributes and method so that make easier to instantiation and specially easy to access the attributes and method of object by class attributes and class method. 

2. Does class Rectangle have constructor? If not, why we instantiate the object as follows?

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/soal%201.2%20no%202.png)

- Yes, it have. The constructor is kind of default constructor. We should instantiate because array of object will store in each element so that we need to create / instantiate an object every each element of array. 

3. What’s the meaning of this line of code?

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/soal%201.2%20no%202.png)

- It's declaration the array of object in that class. This step was to create an array of object name rectangleArray in Rectangle class and can store maximum 3 elements.

4. What’s the meaning of these lines of code?

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/soal%201.2%20no%204.png)

- First line is to instantiating the object in element index 1 of array of object. In this line, we create the object in element index 1 that we store.
- Second line is to accessing length attributes in array of object index 1 and directly fill in the value of length as object attribute.
- Third line is to accessing width attributes in array of object index 1 and directly fill in the value of width as object attribute.

5. Why ArrayOfObject class and Rectangle class should be separated?

- because ArrayOfObject class manage the declaring, instantiation, and accessing the value each attribute of array of object from Rectangle class. The other side, Rectangle class only defining the properties / attributes (length and width).

# 1.3.2 Result 

![alt texy]([arrayO4](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/arrayO4.png))

# 1.3.3 Questions

1. Does array of object can be implemented on 2D array?

- Yes, it does. Array of object can be implemented on 2D array.

2. If yes, then please give an example. Otherwise, please explain.

![alt text]([2D array of object](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/2D%20Array%20of%20object.png))

3. There is a Square class that has an attribute side with integer as its data type. There will be an error when we run this code, why?

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/soal%201.3%20no%203.png)
- There will appear error because we not instantiation (create) the object in element of that array of object. In that image, directly go to accessing the attribute value. There is should be give the instantiation first and then accessing the value of attribute.

4. Modify the code on part 1.3 so that the length of the array will be defined from user input.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/modify%20code%20part%201.3.png)

5. Can we duplicate the instantiation process in array of objects? For example, we assign the object in ppArray[i] and ppArray[0], the instantiation process of ppArray[0] will be done twice. What’s the effect of this?

- Yes, we can duplicate the instatiation in array of objects. The effect is the preview object element of array of objects that already have value will overwrite with the new object in the same element of array. 

# 1.4 Mathematical operation in array of object’s attribute

# 1.4.1 Steps 

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/blocks%20class.png)
![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/ArrayOfBlocks.png)

# 1.4.2 Result

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/Result%201.4.png)

# 1.4.2 Questions

1. Can we have more than one constructor in one class? Please explain.

- Yes, we can add another constructor in one class. Usually can use 2 constructor. Default constructor and parametric constructor. 

2. Create a Triangle class as follows.

![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/bea20fb506f31059db4ee191a1cee1ed0a5df4ad/Jobsheet3/images/soal%201.4%20no%202.png)

Add another constructor in this class that has parameter int a, int t. These represents its base and height.

- ![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/answer%201.4%20no%202.png)

3. Add method countArea() and countPerimeter() in class Triangle

- ![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/answer%201.4%20no%203.png)

4. In main function, instantiate array of Triangle objects. Assign the attributes values as follows:
0th trArray base: 10, height: 4
1st trArray base: 20, height: 10
2nd trArray base: 15, height: 6
3rd trArray base: 25, height: 10

- ![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/answer%201.4%20no%204.png)

5. Display the result of area and perimeter for each triangle by calling the method countArea() and countPerimeter()

- ![alt text](https://github.com/BrianLearning-source/Algorithm-and-Data-Structure-Java/blob/1c61ac28b7a354b3311f97db89a9caa230cd2fa5/Jobsheet3/images/result%201.4no%205.png)


