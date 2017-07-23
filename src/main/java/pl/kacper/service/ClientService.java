package pl.kacper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kacper.forms.RegisterClientForm;
import pl.kacper.model.Client;
import pl.kacper.model.User;
import pl.kacper.service.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public void addClient(Client client){
    clientRepository.save(client);
    }

    public void addClient(RegisterClientForm clientForm){
        Client client = new Client(
                clientForm.getName(), clientForm.getSurname(), clientForm.getCarModel(), clientForm.getLicensePlate(),
                clientForm.getPhoneNumber(), clientForm.getDiscount());
        clientRepository.save(client);
    }


    public Iterable<Client> findAllClients(){
       return clientRepository.findAll();
    }

    public Client findByNameAndSurname(String name, String surname){
        return clientRepository.findByNameAndSurname(name, surname);
    }

    public Client findByLicensePlate(String licensePlate){
        return clientRepository.findByLicensePlate(licensePlate);
    }

    public void deleteClient(Long id){
        clientRepository.delete(id);
    }
}
