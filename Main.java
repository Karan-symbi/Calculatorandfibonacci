import java.util.Scanner;
class Main {

	public static void main(String[] args) {

		Calculator calculator = new Calculator(); //object calculator creation
		Scanner choice = new Scanner(System.in); //takes the input from the user

		System.out.println("\tMenu");
		System.out.println("---------------");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Square Root (of the 1st number)");
		System.out.println("6. Fibonacci (of the 1st number)");
		System.out.println("7. Mean (of custom array)");
		System.out.println("8. Mode (of custom array)");
		System.out.println("9. Exit");

}
