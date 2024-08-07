## Recap 

Methods 

class and object 


class ? 
group of objects
template


Object ? 
state behaviour and identity 

Instance of a class 



## Methods ?

-behaviour 

set of block of statements 

public String show(int x) { // [parameter]

return "";
}




## Method Overloading... 


when a method have same name but different parameters 

method overloading vs overriding ... [INTERVIEW QUESTION]



## Constructor 

which initializes the object  ? 


1. special type of method 
which have the same name as class name 
it does not have return type, not even void. 

Class Student{

 Student() {

}


}

two types of constructors 
1. default constructor 
2. Parameterized constructor 



by default, default constructor is available to all the classes in java 
but if you create a constructor or specifically parameterized constructor 
then there will be no default constructor available. 


Demo.java     --------->    Demo.class [Compiled class ] byte code -----> JVM [machine dependent]/OS dependent 



# this()

it should be first line in the constructor call 




