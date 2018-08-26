package rentalstore.statement;

import rentalstore.Customer;
import rentalstore.Rental;

import java.util.Enumeration;
public class TxtStatement extends Statement {
    protected String footerString(Customer customer) {
        return  "You owe " + String.valueOf(customer.getCharge())
                + "\nOn this rental you earned "
                + String.valueOf(customer.getTotalFrequentRenterPoints())
                + " frequent renter points";

    }

    protected String bodyString(Customer customer) {
        StringBuffer info = new StringBuffer();
        Enumeration rentals = customer.getRentals();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            info.append( "\t"
                    + each.getMovie().getTitle()
                    + ": "
                    + String.valueOf(each.getAmount())
                    + "\n"
            );
        }
        return info.toString();
    }

    protected String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
}
