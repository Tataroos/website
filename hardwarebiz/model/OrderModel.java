
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class OrderItem {
    int id;
    int orderId;
    int customerId;
    String customerName;
    int productId;
    String productName;
    String productDescription;
    String productCategoryName;
    String productImageFile;
    double quantity;
    double price;
    Date created;
    Date lastUpdated;
}