package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String txtStatement(){
        return headerString()+ bodyString()+footerString();
    }

    private String footerString() {
        return  "You owe " + String.valueOf(getCharge())
                + "\nOn this rental you earned "
                + String.valueOf(getTotalFrequentRenterPoints())
                + " frequent renter points";

    }

    private String bodyString() {
        StringBuffer info = new StringBuffer();
        Enumeration rentals = this.rentals.elements();
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

    private String headerString() {
        return "Rental Record for " + getName() + "\n";
    }

    private double getCharge(){
        double totalAmount = 0;
        Enumeration rentals = this.rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            totalAmount += each.getAmount();
        }
        return totalAmount;
    }

    private int getTotalFrequentRenterPoints(){
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
