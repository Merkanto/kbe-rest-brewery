package merkanto.kberestbrewery.web.mappers;

import merkanto.kberestbrewery.domain.Customer;
import merkanto.kberestbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
