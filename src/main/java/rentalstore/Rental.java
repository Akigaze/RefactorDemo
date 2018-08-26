package rentalstore;

public class Rental {
    Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double getAmount(){
        return movie.getAmount(dayRented);
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(dayRented);
    }
}
