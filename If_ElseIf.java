import java.util.Scanner;

/*Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.


For printing use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()
for C# : Console.WriteLine();
for Go : fmt.Println()

Examples:
Input: marks = 95

Output: Grade A

Explanation: marks are greater than or equal to 90.

Input: marks = 14

Output: Fail

Explanation: marks are less than 35.*/
public class If_ElseIf {
    public static void main(String[] args) {
        Scanner s=new  Scanner(System.in);
        System.out.print("input:");
        int marks=s.nextInt();
        if( marks >= 90) {
            System.out.println("Output: Grade A");
        }
        else if( marks >= 70) {
            System.out.println("Output: Grade B");
        }
        else  if( marks >= 50) {
            System.out.println("Output: Grade C");
        }
        else if( marks >= 35)
        {
            System.out.println("Output: Grade D");
        }
        else
        {
            System.out.println("Fail");
        }

    }

}
