package amani.hadded.custumerServiceApplication.projections;

import amani.hadded.custumerServiceApplication.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer", types = Customer.class)
public interface CustomerProjection {
    Long getId();
    String getName();
    String getEmail();
}