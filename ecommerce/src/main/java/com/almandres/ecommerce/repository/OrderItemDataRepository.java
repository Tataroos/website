import com.almandres.ecommerce.entity.OrderItemData;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemDataRepository extends CrudRepository<OrderItemData, Integer> {
    
}