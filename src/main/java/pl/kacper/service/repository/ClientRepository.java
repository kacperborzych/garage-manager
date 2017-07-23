package pl.kacper.service.repository;


import org.springframework.data.repository.CrudRepository;
import pl.kacper.forms.RegisterClientForm;
import pl.kacper.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

    //Client findById(Long id);

    Client findByNameAndSurname(String name, String surname);

    Client findByLicensePlate(String licensePlate);

}
