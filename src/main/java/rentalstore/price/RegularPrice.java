package rentalstore.price;

import rentalstore.Movie;

public class RegularPrice extends Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getAmount(int dayRented) {
        double amount = 2;
        if(dayRented > 2){
            amount+=(dayRented - 2) * 1.5;
        }
        return amount;
    }
}
