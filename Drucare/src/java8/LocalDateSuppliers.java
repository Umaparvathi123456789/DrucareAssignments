package java8;

import java.time.LocalDate;
import java.util.function.Supplier;

public class LocalDateSuppliers {
	public static void main(String[] args) {
        // Supplier that supplies the current LocalDate
        Supplier<LocalDate> currentDateSupplier = LocalDate::now;

        // Get the current date using the supplier
        LocalDate currentDate = currentDateSupplier.get();

        // Print the current date
        System.out.println("Current Date: " + currentDate);
}
}