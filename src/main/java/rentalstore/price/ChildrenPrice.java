package rentalstore.price;

import rentalstore.Movie;

public class ChildrenPrice extends Price {

    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getAmount(int dayRented) {
        double amount = 1.5;
        if(dayRented > 3){
            amount += (dayRented -3)*1.5;
        }
        return amount;
    }
}
