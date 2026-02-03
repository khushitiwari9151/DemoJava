import java.util.Scanner;
public class input1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int n = S.nextInt();
        System.out.println("The area of the circle is : "+3.14*n*n);
    }
}