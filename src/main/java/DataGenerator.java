import category.Category;
import category.Electronic;
import category.Furniture;
import category.SkinCare;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer(){

        Address address1Customer1 = new Address("7925","Jones Branch Dr","Suite 3300","22102","VA");
        Address address2Customer1 = new Address("825","GeorgeTown Pky","Suite 5355","22036","VA");
        Address address1Customer2 = new Address("5924","Lee Hwy","House","22044","VA");

        List<Address> customer1AddressList = new ArrayList<>();
        customer1AddressList.add(address1Customer1);
        customer1AddressList.add(address2Customer1);

        Customer customer1 = new Customer(UUID.randomUUID(),"john","john@mail.com",customer1AddressList);
        Customer customer2 = new Customer(UUID.randomUUID(),"mike","mike@gmail.com", List.of(address1Customer2));
        Customer customer3 = new Customer(UUID.randomUUID(),"david","david@gmail.com");

        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);
        StaticConstants.CUSTOMER_LIST.add(customer3);

    }

    public static void createCategory(){

        Category category1 = new Electronic(UUID.randomUUID(),"Electronic");
        Category category2 = new Furniture(UUID.randomUUID(),"Furniture");
        Category category3 = new SkinCare(UUID.randomUUID(),"SkinCare");

        StaticConstants.CATEGORY_LIST.add(category1);
        StaticConstants.CATEGORY_LIST.add(category2);
        StaticConstants.CATEGORY_LIST.add(category3);

    }

    public static void createProduct(){

        Product product1 =
                new Product(UUID.randomUUID(),"PS5", BigDecimal.valueOf(230.72),7,7,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2 =
                new Product(UUID.randomUUID(),"XBOX",BigDecimal.valueOf(120.34),15,15,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product3=
                new Product(UUID.randomUUID(),"Chair",BigDecimal.valueOf(30.87),85,85,StaticConstants.CATEGORY_LIST.get(1).getId());
        Product product4=
                new Product(UUID.randomUUID(),"Milk",BigDecimal.valueOf(2.87),185,85,UUID.randomUUID());

        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);
        StaticConstants.PRODUCT_LIST.add(product4);

    }
}
