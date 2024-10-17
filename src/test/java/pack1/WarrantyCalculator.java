package pack1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WarrantyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase date (yyyy-MM-dd): ");
        String purchaseDateInput = scanner.nextLine();
        
        LocalDate purchaseDate = LocalDate.parse(purchaseDateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("Enter the warranty period (years): ");
        int warrantyYears = scanner.nextInt();

        System.out.print("Enter the warranty period (months): ");
        int warrantyMonths = scanner.nextInt();

        LocalDate expirationDate = calculateWarrantyExpiration(purchaseDate, warrantyYears, warrantyMonths);

        System.out.println("Warranty expiration date: " + expirationDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        
        scanner.close();
    }

    private static LocalDate calculateWarrantyExpiration(LocalDate purchaseDate, int years, int months) {
        return purchaseDate.plusYears(years).plusMonths(months);
    }
}
