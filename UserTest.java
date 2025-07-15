import java.util.Scanner;

public class UserTest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        MultiplicationTable.printTable(num);
    }
}
