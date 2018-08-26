package rentalstore.price;

import rentalstore.Movie;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getAmount(int dayRented) {
        return dayRented*3;
    }
}
