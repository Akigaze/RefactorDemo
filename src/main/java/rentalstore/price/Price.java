package rentalstore.price;

import rentalstore.Movie;

public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getAmount(int dayRented);
    public int getFrequentRenterPoints(int dayRented) {
        return 1;
    }
}
