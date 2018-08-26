package rentalstore.price;

public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getAmount(int dayRented);
}
