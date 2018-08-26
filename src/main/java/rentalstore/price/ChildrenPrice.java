package rentalstore.price;

import rentalstore.Movie;

public class ChildrenPrice extends Price {

    public int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
