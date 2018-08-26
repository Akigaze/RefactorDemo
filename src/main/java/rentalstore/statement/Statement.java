package rentalstore.statement;

import rentalstore.Customer;
import rentalstore.Rental;

import java.util.Enumeration;

public abstract class Statement {
    public static final Statement TXT=new TxtStatement();
    public static final Statement HTML=new HtmlStatement();

    public String statement(Customer customer){
        return headerString(customer)+ bodyString(customer)+footerString(customer);
    }
    protected abstract String footerString(Customer customer);

    protected abstract String bodyString(Customer customer);

    protected abstract String headerString(Customer customer);
}
