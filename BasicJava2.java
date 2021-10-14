import java.util.Scanner;
public class BasicJava2 {
    public static void main(String[] args) {
        int number;

        Scanner score = new Scanner(System.in);

        System.out.print("Enter your score: ");
        number = score.nextInt();

        if(number>=101) {
            System.out.println("Invalid Number");
        } else if(number>=91) {
            System.out.println("Your Value: A");    
        } else if(number>=76) {
            System.out.println("Your Value: B");
        } else if(number>=51) {
            System.out.println("Your Value: C");
        } else if(number>=26) {
            System.out.println("Your Value: D");
        } else {
            System.out.println("Your Value: E");    
}
System.out.println("DONE");
    }
}