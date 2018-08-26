package rentalstore.price;

public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getAmount(int dayRented);

    public double getFrequentRenterPoints(int dayRented) {
        return 1.0;
    }
}
