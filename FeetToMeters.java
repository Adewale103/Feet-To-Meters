import java.util.Scanner;
public class FeetToMeters{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter a value for feet ");
     double feet = input.nextDouble();


     double meters = (feet * 0.305);

     System.out.printf("%.4f feet is %.4f meters %n",feet,meters);

     }
}
