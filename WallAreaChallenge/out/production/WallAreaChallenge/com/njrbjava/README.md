<h1>Wall Area Challenge</h1>
Write a class with the name <b>Wall</b>. The class needs <b>two fields 
(instance 
variables)</b> with name <b>width</b> and <b>height</b> of type 
<b>double</b>.

The class needs to have two constructors. The first constructor does not 
have any parameters (no-arg constructor). The second constructor has 
parameters <b>width</b> and <b>height</b> of type double and it needs to 
initialize 
the 
fields. In case the width is <b>less than 0</b> it needs to set the width field 
value to <b>0</b>, in case the <b>height</b> parameter is <b>less than 0</b> it 
needs to 
set 
the <b>
height</b> field value to <b>0</b>.

Write the following <b>methods</b> (instance methods):
* Method named <b>getWidth without any parameters</b>, it needs to 
  <b>return</b> 
  the 
  value of <b>width</b> field.
* Method named <b>getHeight without any parameters</b>, it needs to 
  <b>return</b> 
  the 
  value of <b>height</b> field.
* Method named <b>setWidth with one parameter of type double</b>, it needs to 
  <b>set 
  the value</b> of the <b>width</b> field. If the parameter is <b>less than 
  0</b> it 
  needs to 
  set the <b>width</b> field value to 0.
* Method named <b>setHeight with one parameter of type double</b>, it needs to 
  <b>set 
  the value</b> of the <b>height</b> field. If the parameter is <b>less than 
  0</b> it 
  needs 
  to set the <b>height</b> field value to 0.
* Method named <b>getArea without any parameters</b>, it needs to return the 
  area 
  of the wall.


<b>TEST EXAMPLE

→ TEST CODE:</b>

```java
Wall wall = new Wall(5,4);
System.out.println("area= " + wall.getArea());
wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea());
```

<b>→ OUTPUT:</b>

```java
area= 20.0
width= 5.0
height= 0.0
area= 0.0
```

<b>NOTE:</b> All methods should be defined as <b>public NOT public static</b>.

<b>NOTE:</b> In total, you have to write <b>5 methods and 2 constructors</b>.

<b>NOTE:</b> Do not add a <b>main</b> method to the solution code.