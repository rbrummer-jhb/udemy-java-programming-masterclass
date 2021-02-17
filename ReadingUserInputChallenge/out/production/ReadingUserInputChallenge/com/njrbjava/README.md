<h1>Reading User Input Challenge</h1>

* Read <b>10</b> numbers from the console entered by the user and print the 
sum of those numbers.

* Create a <b>Scanner</b> like we did in the previous video.

* Use the <b>hasNextInt()</b> method from the scanner to check if the user 
has entered an <b>int</b> value.

* If <b>hasNextInt()</b> returns <b>false</b>, print the message <b>"Invalid 
Number"</b>. Continue reading until you have read <b>10</b> numbers.
  
* Use the <b>nextInt()</b> method to get the number and add it to the sum.

* Before the user enters each number, print the message <b>"Enter 
  number #x:"</b> where <b>x</b> represents the count, i.e. <b>1,2,3,4,</b> etc.
  
* For example, the first message printed to the user would be <b>"Enter 
  number #1:"</b>, the next <b>"Enter number #2:"</b>, and so on.
  
* Hint:
    * Use a <b>while</b> loop.
    * Use a <b>counter</b> variable for counting the valid numbers.
    * Close the scanner after you don't need it anymore.
    * Create a project with the name <b>ReadingUserInputChallenge</b>.