Delve a little deeper, do some research, and find out what do the following mean:

`public`; declares a member's access as public. Public members are visible to all other classes. This means that any other class can access a public field or method. Further, other classes can modify public fields unless the field is declared as final.

`class`; blueprint or a template for creating different objects which defines its properties and behaciors. Java class objects exhibit the properties and behaciors defined by its class. A class can contain fields and methods to describe the behavior of an object.

`static`; means that the method is associated with the class, not a specific instance(object) of that class. This means that you can call a static method without creating an object of the class.

`void`; means that the method has no return value. if the method returned an int you would write int instead of void.

`main`; When a program starts running, it has to start execution from somewhere. That somewhere is called main . You can compile any Java class without a main method, but a standalone application can't run without a main() method. The main method is the method that's defined to be called at the start of an application

`System`; is a built-in class present in java.lang package. This class has a final modifier, which means that, it cannot be inherited by other classes. It contains pre-defined methods and fields, which provides facilities like standard input, output, etc.

`out`; is a static final field (ie, variable)in System class which is of the type PrintStream (a built-in class, contains methods to print the different data values). static fields and methods must be accessed by using the class name, so ( System.out ).

`println`; is a public method in PrintStream class to print the data values. Hence to access a method in PrintStream class, we use out.println() (as non static methods and fields can only be accessed by using the refrence varialble)
