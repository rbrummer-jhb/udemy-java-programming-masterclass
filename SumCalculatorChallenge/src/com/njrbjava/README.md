<h1>Sum Calculator</h1>
Write a class with the name <b>SimpleCalculator</b>. The class needs <b>two fields (instance variables)</b> with names <b>firstNumber</b> and <b>secondNumber</b> both of type <b>double</b>.

Write the following methods (instance methods):

* Method named <b>getFirstNumber without any parameters</b>, it needs to <b>return</b> the value of <b>firstNumber</b> field.
* Method named <b>getSecondNumber without any parameters</b>, it needs to <b>return</b> the value of <b>secondNumber</b> field.
* Method named <b>setFirstNumber with one parameter of type double</b>, it needs to <b>set the value</b> of the <b>firstNumber</b> field.
* Method named <b>setSecondNumber with one parameter of type double</b>, it needs to <b>set the value</b> of the <b>secondNumber</b> field.
* Method named <b>getAdditionResult without any parameters</b>, it needs to <b>return</b> the result of <b>adding</b> the field values of <b>firstNumber</b> and <b>secondNumber</b>.
* Method named <b>getSubtractionResult without any parameters</b>, it needs to <b>return</b> the result of <b>subtracting</b> the field values of <b>secondNumber</b> from the <b>firstNumber</b>.
* Method named <b>getMultiplicationResult without any parameters</b>, it needs to <b>return</b> the result of <b>multiplying</b> the field values of <b>firstNumber</b> and <b>secondNumber</b>.
* Method named <b>getDivisionResult without any parameters</b> it needs to <b>return</b> the result of <b>dividing</b> the field values of <b>firstNumber</b> by the <b>secondNumber</b>. In case the value of <b>secondNumber</b> is <b>0 then return 0</b>.

<b>TEST EXAMPLE

TEST CODE</b>:

```java
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());
```

<b>OUTPUT</b>

```java
add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0
```

<b>TIPS</b>:

```java
* add= 9.0 is printed because 5.0 + 4 is 9.0
* subtract= 1.0 is printed because 5.0 - 4 is 1.0
* multiply= 0.0 is printed because 5.25 * 0 is 0.0
* divide= 0.0 is printed because secondNumber is set to 0
```


<b>NOTE</b>: All methods should be defined as <b>public NOT public static</b>.

<b>NOTE</b>: In total, you have to write <b>8 methods</b>.

<b>NOTE</b>: Do not add the <b>main</b> method to the solution code.