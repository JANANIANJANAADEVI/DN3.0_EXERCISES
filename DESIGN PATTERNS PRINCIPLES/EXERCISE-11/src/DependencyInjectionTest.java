public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create a repository implementation
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.findCustomerById("123");
        System.out.println(customer);
    }
}
