import com.almandres.ecommerce.entity.CustomerData;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDataRepository extends CrudRepository<CustomerData, Integer> {

    // This is a custom method used by the original project's login/signup flow
    CustomerData findByFirstnameAndLastname(String firstname, String lastname);
}

