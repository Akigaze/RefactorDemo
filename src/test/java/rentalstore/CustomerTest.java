package rentalstore;

import org.junit.Assert;
import org.junit.Test;
import rentalstore.price.ChildrenPrice;
import rentalstore.price.LiteraryPrice;
import rentalstore.price.NewReleasePrice;
import rentalstore.price.RegularPrice;

public class CustomerTest {
    @Test
    public void should_print_statement_when_rent_a_regular_movie_for_one_day(){
        //given
        Movie rentedMovie =new Movie("A Journey to the West",new RegularPrice());
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,1);
        renter.addRentalElements(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tA Journey to the West: 2.0\n"
                + "You owe 2.0\n"
                + "On this rental you earned 1.0 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_regular_movie_for_four_day(){
        //given
        Movie rentedMovie =new Movie("A Journey to the West",new RegularPrice());
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,4);
        renter.addRentalElements(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tA Journey to the West: 5.0\n"
                + "You owe 5.0\n"
                + "On this rental you earned 1.0 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_new_release_movie_for_three_day(){
        //given
        Movie rentedMovie =new Movie("Death on the Nile",new NewReleasePrice());
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,3);
        renter.addRentalElements(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tDeath on the Nile: 9.0\n"
                + "You owe 9.0\n"
                + "On this rental you earned 2.0 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_children_movie_for_three_day(){
        //given
        Movie rentedMovie =new Movie("Peppa Pig",new ChildrenPrice());
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,3);
        renter.addRentalElements(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tPeppa Pig: 1.5\n"
                + "You owe 1.5\n"
                + "On this rental you earned 1.0 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_children_movie_for_four_day(){
        //given
        Movie rentedMovie =new Movie("Peppa Pig",new ChildrenPrice());
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,4);
        renter.addRentalElements(rental);
        String exceptedStatement = "Rental Record for Smith\n"
                + "\tPeppa Pig: 3.0\n"
                + "You owe 3.0\n"
                + "On this rental you earned 1.0 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_when_rent_a_children_movie_for_4_day_and_2_regular_movie_for_2_days_and_2_new_release_movies_for_2_days(){
        //given
        Movie regularMovie1 =new Movie("A Journey to the West",new RegularPrice());
        Movie regularMovie2 =new Movie("Avatar",new RegularPrice());
        Movie newReleaseMovie1 =new Movie("Death on the Nile",new NewReleasePrice());
        Movie newReleaseMovie2 =new Movie("GG Bond",new NewReleasePrice());
        Movie childrenMovie =new Movie("Peppa Pig",new ChildrenPrice());
        Customer renter = new Customer("Smith");
        Rental rental1 = new Rental(childrenMovie,4);
        Rental rental2 = new Rental(regularMovie1,2);
        Rental rental3 = new Rental(regularMovie2,2);
        Rental rental4 = new Rental(newReleaseMovie1,2);
        Rental rental5 = new Rental(newReleaseMovie2,2);
        renter.addRentalElements(rental1);
        renter.addRentalElements(rental2);
        renter.addRentalElements(rental3);
        renter.addRentalElements(rental4);
        renter.addRentalElements(rental5);

        String exceptedStatement = "Rental Record for Smith\n"
                +"\tPeppa Pig: 3.0\n"
                +"\tA Journey to the West: 2.0\n"
                +"\tAvatar: 2.0\n"
                +"\tDeath on the Nile: 6.0\n"
                +"\tGG Bond: 6.0\n"
                +"You owe 19.0\n"
                +"On this rental you earned 7.0 frequent renter points";
        //when
        String statement = renter.txtStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_statement_in_html_format_when_rent_a_children_movie_for_4_day_and_2_regular_movie_for_2_days_and_2_new_release_movies_for_2_days(){
        //given
        Movie regularMovie1 =new Movie("A Journey to the West",new RegularPrice());
        Movie regularMovie2 =new Movie("Avatar",new RegularPrice());
        Movie newReleaseMovie1 =new Movie("Death on the Nile",new NewReleasePrice());
        Movie newReleaseMovie2 =new Movie("GG Bond",new NewReleasePrice());
        Movie childrenMovie =new Movie("Peppa Pig",new ChildrenPrice());
        Customer renter = new Customer("Smith");
        Rental rental1 = new Rental(childrenMovie,4);
        Rental rental2 = new Rental(regularMovie1,2);
        Rental rental3 = new Rental(regularMovie2,2);
        Rental rental4 = new Rental(newReleaseMovie1,2);
        Rental rental5 = new Rental(newReleaseMovie2,2);
        renter.addRentalElements(rental1);
        renter.addRentalElements(rental2);
        renter.addRentalElements(rental3);
        renter.addRentalElements(rental4);
        renter.addRentalElements(rental5);

        String exceptedStatement = "<h1>Rental Record for <em>Smith</em></h1>"
                +"Peppa Pig: 3.0<br>"
                +"A Journey to the West: 2.0<br>"
                +"Avatar: 2.0<br>"
                +"Death on the Nile: 6.0<br>"
                +"GG Bond: 6.0<br>"
                +"<p>You owe <em>19.0</em></p>"
                +"<p>On this rental you earned <em>7.0</em> frequent renter points</p>";
        //when
        String statement = renter.htmlStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }

    @Test
    public void should_print_html_statement_when_rent_a_literary_movie_for_one_day(){
        //given
        Movie rentedMovie =new Movie("Romeo and Juliet",new LiteraryPrice());
        Customer renter = new Customer("Smith");
        Rental rental = new Rental(rentedMovie,1);
        renter.addRentalElements(rental);
        String exceptedStatement = "<h1>Rental Record for <em>Smith</em></h1>"
                + "Romeo and Juliet: 6.0<br>"
                + "<p>You owe <em>6.0</em></p>"
                + "<p>On this rental you earned <em>1.5</em> frequent renter points</p>";
        //when
        String statement = renter.htmlStatement();
        //then
        Assert.assertEquals(exceptedStatement,statement);
    }
}
