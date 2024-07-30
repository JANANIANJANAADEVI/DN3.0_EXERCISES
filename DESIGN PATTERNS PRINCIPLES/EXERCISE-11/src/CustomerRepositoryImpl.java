public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Dummy implementation for demonstration
        return new Customer(id, "Ram");
    }
}
