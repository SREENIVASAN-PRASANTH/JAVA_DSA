import java.util.Scanner;

public class UserTest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        SumOfNaturals s1 = new SumOfNaturals(num);
        System.out.println("Sum of numbers: " + s1.getSumOfNumbers());

    }
}
