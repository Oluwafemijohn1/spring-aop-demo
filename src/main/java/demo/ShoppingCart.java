package demo;


import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    /**
     * Things that can be done here are
     * 1. Logging
     * 2. Authentication & Authorization
     * 3. Sanitize the data
     *
     * Each one is called aspect.
     * */
    public void checkout(String status, String target){
        System.out.println("Checkout method from shopping cart");
    }

    public int quantity(){
        System.out.println("Running quantity");
        return 2;
    }
}
