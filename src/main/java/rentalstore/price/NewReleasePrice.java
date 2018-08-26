package rentalstore.price;

import rentalstore.Movie;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getAmount(int dayRented) {
        return dayRented*3;
    }

    @Override
    public int getFrequentRenterPoints(int dayRented) {
        return (dayRented > 1) ? 2:super.getFrequentRenterPoints(dayRented);
    }
}
