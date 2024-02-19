import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Type price for sugar: ");
        int num1 = teclado.nextInt();
        System.out.println("Type prices for tomatoes: ");
        int num2 = teclado.nextInt();
        double total = num1 + num2;
        double IVA = (num1 + num2) * 0.21;
        double totalPrice = total + IVA;

        System.out.println("The total price is: "+totalPrice);
    }
}