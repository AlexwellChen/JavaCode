import  java.io.*;
import  java.util.*;

public class CoffeeShopApplication{

	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	private CoffeeShop coffeeShop;

	private static final int MIN_NUMBER = 0;
	
	private static final int MAX_NUMBER = 50;

	private static final double MIN_COST = 2.0;
	
	private static final double MAX_COST = 50.0;

	public static void main(String[]  args) throws IOException  {

		CoffeeShopApplication application = new  CoffeeShopApplication();

		application.run();
	}

	private void run() throws IOException  {

		coffeeShop = new  CoffeeShop();

		int  choice = getChoice();

		while (choice != 0)  {

			if (choice == 1)  {
				coffeeShop.addCoffee(readCoffee());
			} else if (choice == 2)  {
				stdOut.println(coffeeShop.toString());
			} else if (choice == 3)  {
				stdOut.println("Total Cost: " + coffeeShop.getTotalCost());
			}

			choice = getChoice();
		}
	}

	private int  getChoice() throws IOException  {

		/* PLACE YOUR CODE HERE */
		System.out.println("Choice 0 terminates the program.");
		System.out.println("Choice 1 adds a coffee to the coffee shop.");
		System.out.println("Choice 2 displays the information of all the coffees in coffee shop.");
		System.out.println("Choice 3 displays the total cost of all the coffee in the shop.");
		stdOut.flush();
		int input = Integer.parseInt(stdIn.readLine());
		return input; //you need to change it.
	}

	private Coffee readCoffee() throws IOException {
		/* PLACE YOUR CODE HERE */
		String temp = stdIn.readLine();
		StringTokenizer str = new StringTokenizer(temp,"_");
		Coffee cof = new Coffee(Integer.parseInt(str.nextToken()),str.nextToken(),str.nextToken(),Double.parseDouble(str.nextToken()));
		return cof; //you need to change it.
	}
}