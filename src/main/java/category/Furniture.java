package category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Furniture extends Category{
    public Furniture(UUID id, String name) {
        super(id, name);
    }

    @Override
    public LocalDateTime findDeliveryDueDateTime() {
        return LocalDateTime.now().plusDays(1);
    }

}
