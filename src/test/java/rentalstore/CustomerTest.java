package rentalstore;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void should_print_statement_when_rent_a_regular_movie_for_one_day(){
        //given
        Movie rentedMovie =new Movie("A Journey to the West",Movie.REGULAR);
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,1);
        renter.addRental(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tA Journey to the West: 2.0\n"
                + "You owe 2.0\n"
                + "On this rental you earned 1 frequent renter points";
        //when
        String statement = renter.statement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_regular_movie_for_4_day(){
        //given
        Movie rentedMovie =new Movie("A Journey to the West",Movie.REGULAR);
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,4);
        renter.addRental(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tA Journey to the West: 5.0\n"
                + "You owe 5.0\n"
                + "On this rental you earned 1 frequent renter points";
        //when
        String statement = renter.statement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }
}
