
```java
package java_methods;
import java.util.Scanner;
public class Methods {
public static void main(String[] args) {
int num1 = 2; int num2 = 7; int num3 = 10;
int smallest = num1; int largest = num1;
if (num2 < smallest) { smallest = num2;
}
if (num3 < smallest) {
smallest = num3; }
if (num2 > largest) { largest = num2;
}
if (num3 > largest) {
largest = num3; }
System.out.println("The smallest number: " + smallest);
System.out.println("The largest number: " + largest);
System.out.println(smallest + " is your smallest number, and " + largest + " is your largest
number."); }
} ```
2)
```java
// JavaProjectCalculator.java (main class) package java_project_Calculator;

import java.util.Scanner;
public class JavaProjectCalculator { public static void main(String[] args) {
MarksCalculator marksCalculator = new MarksCalculator();
marksCalculator.calculateAndDisplayMarks(); }
}
// MarksCalculator.java (class) package java_project_example;
public class MarksCalculator {
private double javaProgrammingMarks; private double networkingMarks; private double mathsMarks;
private double averageMarks;
public void calculateAndDisplayMarks() { Scanner scanner = new Scanner(System.in);
System.out.println("Enter marks for Java Programming:"); javaProgrammingMarks = scanner.nextDouble();
System.out.println("Enter marks for Networking:"); networkingMarks = scanner.nextDouble();
System.out.println("Enter marks for Maths:"); mathsMarks = scanner.nextDouble();
averageMarks = (javaProgrammingMarks + networkingMarks + mathsMarks) / 3;
System.out.println("Marks for Java Programming: " + javaProgrammingMarks); System.out.println("Marks for Networking: " + networkingMarks); System.out.println("Marks for Maths: " + mathsMarks); System.out.println("The average is: " + averageMarks);
scanner.close(); }
} ```
3) ```java

import java.util.Scanner;
public class LeapYearChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter a year:"); int year = scanner.nextInt();
if (isLeapYear(year)) {
System.out.println("The year " + year + " is a leap year!");
} else {
System.out.println("The year " + year + " is not a leap year.");
}
scanner.close(); }
public static boolean isLeapYear(int year) { if (year % 4 == 0) {
if (year % 100 == 0) {
if (year % 400 == 0) {
return true; } else {
return false; }
} else { return true;
}
} else {
return false; }
} }
```
3b)Java assignment 2 import java.util.Scanner;
public class TriangleAreaCalculator { private double base;
private double height;
public void getUserInput() {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the base of the triangle:"); base = scanner.nextDouble();
System.out.println("Enter the height of the triangle:"); height = scanner.nextDouble();
scanner.close(); }
public double calculateArea() { return 1/2 * base * height;
}
public void displayArea() {
double area = calculateArea();
System.out.println("The area of the triangle is: " + area);
}
public static void main(String[] args) {
TriangleAreaCalculator calculator = new TriangleAreaCalculator(); calculator.getUserInput();
calculator.displayArea();
} }
4)
