package rentalstore.price;

import rentalstore.Movie;

public class RegularPrice extends Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
