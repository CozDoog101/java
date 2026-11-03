package dependencyinjection;

public class OrderService {
    private final Logger logger;

    public OrderService(Logger logger) {
        this.logger = logger;
    }

    public void createOrder(String productName) {
        logger.log("Order created: " + productName);
    }
}
