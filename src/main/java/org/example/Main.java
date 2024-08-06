package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

/*After completing Step 1 and Step 2:
	Error - java: class AverageCalculator is public, should be declared in a file named AverageCalculator.java

After completing Step 3:
	I got the same error, so I went and created a file for it, run it again, got 3.0.

Step 4: Created exceptions
1.	NullPointerException:
o	Line 5: int length = numbers.length; will throw a NullPointerException if numbers is null.
o	Line 19: Calling calculateAverage(numbers); with numbers set to null will trigger the NullPointerException.
2.	ArrayIndexOutOfBoundsException:
o	Line 10: for (int i = 0; i <= numbers.length; i++) will throw an ArrayIndexOutOfBoundsException because the loop condition i <= numbers.length allows i to go out of bounds.
o	Line 23: Calling calculateAverage(numbers2); with numbers2 set to {1, 2, 3, 4, 5} will trigger the ArrayIndexOutOfBoundsException.
o
Console returned errors: Exception in thread "main" java.lang.NullPointerException
	at org.example.AverageCalculator.calculateAverage(AverageCalculator.java:7)
	at org.example.AverageCalculator.main(AverageCalculator.java:23)

Step 5:
•	I created breakpoints, red dots on left.
•	Clicked on bug
•	Inspected code
•	NullPointerException was set to null, I fixed it with: {
return 0.0;
}
•	Tried step over code, it would always take me out of it, so I would have to rerun the debugger, not sure why it was doing this.
•	2nd error-FixArrayIndexOutofBoundsException
•	Adjusted loop condition to avoid accessing out of bound indices by using < instead of <=
•	Re-ran code, got 0.0 and 3.0
Step 6 & 7
•	Introduced a logic error by changing the calculate average using wrong mathematical equation.
•	Answered average is 7.5 which is wrong, sum/2 is the wrong way to find avg
•	The error is on line 13.
•	Created breakpoint on line 13, right clicked on file tab, chose debug AverageCalculator
•	Used step over, step into
•	There is a what looks like double circles down below which lets you view breakpoints, clicked on that
•	Went and changed the 2 to a 5 because we are dividing the total by 5 because there are 5 numbers.
•	I had also seen an error/suggestion for my for loop saying it can be replaced by an enhanced ‘for’ so I chose the replacement to see what it would do and it returned a shorter piece of code that works. for(int number : numbers) {

*/