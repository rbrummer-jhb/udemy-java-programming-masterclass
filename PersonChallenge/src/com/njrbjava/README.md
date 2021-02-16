<h1>Person</h1>
Write a class with the name <b>Person</b>. The class needs <b>three fields (instance variables)</b> with the names <b>firstName, lastName</b> of type <b>String</b> and <b>age</b> of type <b>int</b>. 

Write the following <b>methods</b> (instance methods):

* Method named <b>getFirstName without any parameters</b>, it needs to <b>return</b> the value of the <b>firstName</b> field.
* Method named <b>getLastName without any parameters</b>, it needs to <b>return</b> the value of the <b>lastName</b> field.
* Method named <b>getAge without any parameters</b>, it needs to <b>return</b> the value of the <b>age</b> field.
* Method named <b>setFirstName with one parameter of type String</b>, it needs to <b>set the value</b> of the <b>firstName</b> field.
* Method named <b>setLastName with one parameter of type String</b>, it needs to <b>set the value</b> of the <b>lastName</b> field.
* Method named <b>setAge with one parameter of type int</b>, it needs to <b>set the value</b> of the <b>age</b> field. If the <b>parameter</b> is <b>less than 0 or greater than 100</b>, it needs to set the <b>age</b> field value to <b>0</b>.
* Method named <b>isTeen without any parameters</b>, it needs to <b>return true</b> if the value of the <b>age</b> field is <b>greater than 12 and less than 20</b>, otherwise, <b>return false</b>.
* Method named <b>getFullName without any parameters</b>, it needs to return the full name of the person.
* In case both <b>firstName</b> and <b>lastName</b> fields are empty, Strings <b>return an empty String</b>.
* In case <b>lastName</b> is an empty String, <b>return firstName</b>.
* In case <b>firstName</b> is an empty String, <b>return lastName</b>.

To check if s String is empty, use the method <b>isEmpty</b> from the <b>String</b> class. For example, <b>firstName.isEmpty()</b> returns true if the String is empty or in other words, when the String does not contain any characters.


<b>TEST EXAMPLE

TEST CODE:</b>

```java
Person person = new Person();
person.setFirstName("");   // firstName is set to empty string
person.setLastName("");    // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John");    // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith");    // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());
```

<b>OUTPUT</b>

```java
fullName=
teen= false
fullName= John
teen= true
fullName= John Smith
```

<b>NOTE</b>: All methods should be defined as <b>public NOT public static</b>.

<b>NOTE</b>: In total, you have to write <b>8 methods</b>.

<b>NOTE</b>: Do not add the <b>main</b> method to the solution code.