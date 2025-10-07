/*Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.

Ensure only the 1st letter of the answer is capitalised.

For printing use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()

Examples:
Input: day = 3

Output: Wednesday

Input: day = 8

Output: Invalid
*/

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner s=new  Scanner(System.in);
        System.out.print("input:day=");
        int num=s.nextInt();
        if(num<=7) {
            switch (num) {
                case 1:
                    System.out.println("output : monday");
                    break;
                case 2:
                    System.out.println("output:tuesday");
                    break;
                case 3:
                    System.out.println("output:wednesday");
                    break;
                case 4:
                    System.out.println("output : thursday");
                    break;
                case 5:
                    System.out.println("output: friday");
                    break;
                case 6:
                    System.out.println("output:  saturday");
                    break;
                case 7:
                    System.out.println("output: sunday");
                    break;

            }
        }
        else {
            System.out.println("output : invaild");
        }


    }
}
