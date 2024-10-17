package pack1;
	
	import java.util.Arrays;
	import java.util.Scanner;

	public class Productsorter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Enter the number of products: ");
	        int numberOfProducts = scanner.nextInt();
	        scanner.nextLine();
	        String[] products = new String[numberOfProducts];
	        
	        for (int i = 0; i < numberOfProducts; i++) {
	            System.out.print("Enter product name " + (i + 1) + ": ");
	            products[i] = scanner.nextLine();
	        }
	       
	        Arrays.sort(products);
	        System.out.println("\nSorted Product Names:");
	        for (String product : products) {
	            System.out.println(product);
	        }
	        
	        scanner.close();
	    }
	}

	
	
	

	