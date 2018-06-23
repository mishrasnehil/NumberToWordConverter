package com.devops.numberconverter.feature.main;

import java.util.Scanner;
import com.devops.numberconverter.feature.service.NumberToWordConverterFeature;
import static java.lang.System.exit;

public class NumberToWordConversionApplication {

	public static void main(String[] args) {
		System.out.println("Please enter the number to be converted to words : ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String numberStr = scanner.next();
            try {
                Integer number = Integer.parseInt(numberStr);
                if (number == 0) {
                    System.out.println("\nClosing this conversion feature. Please re-trigger the feature to convert again.");
                	exit(0);
                }
                if (number >= 1 && number <= 999) {
                    String numberAsWords = new NumberToWordConverterFeature().convertNumberToWords(number);
                    System.out.println(String.format("Words equivalent to number %s is : %s", number, numberAsWords));
                } else {
                    System.out.println("Number out of Range");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter the valid number");
            }
            System.out.println("\nPress 0 to exit OR Enter Number between 1 and 999 to Continue : ");
        }
		

	}

}
