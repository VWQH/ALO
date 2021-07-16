package series_oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e){
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException e){
            System.out.println("Please enter a number!");
        } catch(Exception e){
            System.out.println("Some thing went wrong!");
        }finally{
            scanner.close();
        }
    }
}
