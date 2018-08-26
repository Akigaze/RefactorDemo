package rentalstore.price;

import rentalstore.Movie;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
