/*Complete the function printNumber which takes an integer input from the user and prints it on the screen.



Use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()

Examples:
Input(user gives value): 7

Output: 7

Input(user gives value): -5

Output: -5
*/
import java.util.*;

public class Input_Output {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Input(user gives value):");
        int a=s.nextInt();
        System.out.println("Output:"+a);
    }

}
