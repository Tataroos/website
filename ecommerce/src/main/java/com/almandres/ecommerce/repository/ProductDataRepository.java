import com.almandres.ecommerce.entity.ProductData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDataRepository extends CrudRepository<ProductData, Integer> {

}