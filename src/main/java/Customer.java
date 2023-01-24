import java.util.List;
import java.util.UUID;

public class Customer {

    private UUID id;
    private String username;
    private String email;
    private List<Address> addresses;

    public Customer(UUID id, String username, String email, List<Address> addresses) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.addresses = addresses;
    }

    public Customer(UUID id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
