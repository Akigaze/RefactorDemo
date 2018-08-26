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
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_regular_movie_for_four_day(){
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
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_new_release_movie_for_three_day(){
        //given
        Movie rentedMovie =new Movie("Death on the Nile",Movie.NEW_RELEASE);
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,3);
        renter.addRental(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tDeath on the Nile: 9.0\n"
                + "You owe 9.0\n"
                + "On this rental you earned 2 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_children_movie_for_three_day(){
        //given
        Movie rentedMovie =new Movie("Peppa Pig",Movie.CHILDRENS);
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,3);
        renter.addRental(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tPeppa Pig: 1.5\n"
                + "You owe 1.5\n"
                + "On this rental you earned 1 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_children_movie_for_four_day(){
        //given
        Movie rentedMovie =new Movie("Peppa Pig",Movie.CHILDRENS);
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,4);
        renter.addRental(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tPeppa Pig: 3.0\n"
                + "You owe 3.0\n"
                + "On this rental you earned 1 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_children_movie_for_4_day_and_2_regular_movie_for_2_days_and_2_new_release_movies_for_2_days(){
        //given
        Movie regularMovie1 =new Movie("A Journey to the West",Movie.REGULAR);
        Movie regularMovie2 =new Movie("Avatar",Movie.REGULAR);
        Movie newReleaseMovie1 =new Movie("Death on the Nile",Movie.NEW_RELEASE);
        Movie newReleaseMovie2 =new Movie("GG Bond",Movie.NEW_RELEASE);
        Movie childrenMovie =new Movie("Peppa Pig",Movie.CHILDRENS);
        Customer renter = new Customer("Smith");
        Rental rental1 = new Rental(childrenMovie,4);
        Rental rental2 = new Rental(regularMovie1,2);
        Rental rental3 = new Rental(regularMovie2,2);
        Rental rental4 = new Rental(newReleaseMovie1,2);
        Rental rental5 = new Rental(newReleaseMovie2,2);
        renter.addRental(rental1);
        renter.addRental(rental2);
        renter.addRental(rental3);
        renter.addRental(rental4);
        renter.addRental(rental5);

        String exceptedStatement = "Rental Record for Smith\n"
                +"\tPeppa Pig: 3.0\n"
                +"\tA Journey to the West: 2.0\n"
                +"\tAvatar: 2.0\n"
                +"\tDeath on the Nile: 6.0\n"
                +"\tGG Bond: 6.0\n"
                +"You owe 19.0\n"
                +"On this rental you earned 7 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }
}
