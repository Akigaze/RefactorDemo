package rentalstore.price;

import rentalstore.Movie;

public class LiteraryPrice extends Price {
    public int getPriceCode() {
        return Movie.LITERARY;
    }

    public double getAmount(int dayRented) {
        return 6.0;
    }

    @Override
    public double getFrequentRenterPoints(int dayRented) {
        return 1.5;
    }
}
