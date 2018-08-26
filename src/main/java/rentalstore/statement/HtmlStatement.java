package rentalstore.statement;

import rentalstore.Customer;

public class HtmlStatement extends Statement {
    protected String footerString(Customer customer) {
        return null;
    }

    protected String bodyString(Customer customer) {
        return null;
    }

    protected String headerString(Customer customer) {
        return null;
    }
}
