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

        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + ": " + String.valueOf(each.getAmount()) + "\n";
        }

        result += "You owe " + String.valueOf(getCharge()) + "\n";
        result += "On this rental you earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
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
            frequentRenterPoints += each.getFrequentRenterPointsForRental();
        }
        return frequentRenterPoints;
    }
}
