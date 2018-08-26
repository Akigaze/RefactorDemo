package rentalstore;

import rentalstore.price.Price;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    public static final int LITERARY = 3;

    private String title;
    private Price priceCode;

    public Movie(String title, Price priceCode) {
        this.title = title;
        this.priceCode=priceCode;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount(int dayRented) {
        return  priceCode.getAmount(dayRented);
    }

    public double getFrequentRenterPoints(int dayRented) {
        return priceCode.getFrequentRenterPoints(dayRented);
    }
}
