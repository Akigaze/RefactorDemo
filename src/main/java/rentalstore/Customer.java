package rentalstore;

import rentalstore.statement.HtmlStatement;
import rentalstore.statement.Statement;
import rentalstore.statement.TxtStatement;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();
    private Statement statement=new TxtStatement();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public Enumeration getRentals() {
        return this.rentals.elements();
    }

    private void setStatement(Statement statement) {
        this.statement=statement;
    }

    public double getCharge(){
        double totalAmount = 0;
        Enumeration rentals = this.rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            totalAmount += each.getAmount();
        }
        return totalAmount;
    }

    public int getTotalFrequentRenterPoints(){
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    public String txtStatement(){
        setStatement(Statement.TXT);
        return this.statement.statement(this);
    }

    public String htmlStatement() {
        setStatement(Statement.HTML);
        return statement.statement(this);
    }


}
