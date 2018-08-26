package rentalstore;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount(int dayRented) {
        double amount =0;
        switch (getPriceCode()){
            case REGULAR:
                amount += 2;
                if(dayRented > 2){
                    amount+=(dayRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                amount+= dayRented*3;
                break;
            case CHILDRENS:
                amount+=1.5;
                if(dayRented > 3){
                    amount += (dayRented -3)*1.5;
                }
                break;
        }
        return amount;
    }
    public int getFrequentRenterPoints(int dayRented) {
        if((getPriceCode() == Movie.NEW_RELEASE) && dayRented > 1){
            return 2;
        }else {
            return 1;
        }
    }
}
