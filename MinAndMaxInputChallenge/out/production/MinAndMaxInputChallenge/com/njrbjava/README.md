<h1>Minimum And Maximum Challenge</h1>

* Read the number from the console entered by the user and print the minimum 
  and maximum number the user entered.
* Before the user enters the number, print the message <b>"Enter number:"</b>.
* If the user enters an invalid number, break out of the loop and print the 
  minimum and maximum number.
* Hint:
    * Use an endless while loop.
* Bonus:
    * Create a project with the name <b>MinAndMaxInputChallenge</b>.
  

<h2>Boolean Flagless Solution with CONSTANTS</h2>

```java
package com.njrbjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // do this to avoid using a boolean flag
        int minNumber = Integer.MAX_VALUE; // 2147483647
        int maxNumber = Integer.MIN_VALUE; // -2147483647

        while (true) {
            System.out.println("Enter number:");

            if ( scanner.hasNextInt() ) {
                int number = scanner.nextInt();

                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);

        scanner.close();
    }
}
```