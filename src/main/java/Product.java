import category.Category;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {

    private UUID id;
    private String productName;
    private BigDecimal price;
    private Integer stock;
    private Integer remainingStock;
    private UUID categoryId;
}
