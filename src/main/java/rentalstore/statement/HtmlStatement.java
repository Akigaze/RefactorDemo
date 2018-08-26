package rentalstore.statement;

import rentalstore.Customer;
import rentalstore.Rental;

import java.util.Enumeration;

public class HtmlStatement extends Statement {
    protected String headerString(Customer customer) {
        return "<h1>Rental Record for <em>" + customer.getName() + "</em></h1>";
    }

    protected String bodyString(Customer customer) {
        StringBuffer info = new StringBuffer();
        Enumeration rentals = customer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            info.append(each.getMovie().getTitle()
                    + ": "
                    + String.valueOf(each.getAmount())
                    + "<br>"
            );
        }
        return info.toString();
    }


    protected String footerString(Customer customer) {
        return "<p>You owe <em>"
                + String.valueOf(customer.getCharge())
                + "</em></p>"
                + "<p>On this rental you earned <em>"
                + String.valueOf(customer.getTotalFrequentRenterPoints())
                + "</em> frequent renter points</p>";

    }



}
