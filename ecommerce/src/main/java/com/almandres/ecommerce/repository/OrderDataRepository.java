import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDataRepository extends CrudRepository<OrderData, Integer> {

    // This method lets Spring find a list of orders for a specific customer ID.
    List<OrderData> findByCustomer_Id(Integer customerId);
}