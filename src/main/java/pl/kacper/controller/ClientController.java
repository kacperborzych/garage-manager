package pl.kacper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.kacper.forms.RegisterClientForm;
import pl.kacper.model.Client;
import pl.kacper.service.ClientService;

import javax.validation.Valid;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    //ADD CLIENT GET METHOD
    @RequestMapping(value = "/addClinet", method = RequestMethod.GET)
    public ModelAndView showAddClientForm(){
        return new ModelAndView("clientViews/addClient", "clientForm", new RegisterClientForm());
    }

    //ADD CLIENT POST METHOD
    @RequestMapping(value = "/addClinet", method = RequestMethod.POST)
    public ModelAndView addClient(@Valid RegisterClientForm clientForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("clientViews/addClient");
        }
        clientService.addClient(clientForm);
        return new ModelAndView("clientViews/addClientConfirmation");
    }

    //FIND CLIENT BY NAME AND SURNAME METHOD GET
    @RequestMapping(value = "findClientByName", method = RequestMethod.GET)
    public ModelAndView showFindClient (){
        return new ModelAndView("clientViews/findClientByName");
    }

    //FIND CLIENT BY NAME AND SURNAME METHOD POST
    @RequestMapping(value = "findClientByName", method = RequestMethod.POST)
    public ModelAndView findClientByName(@Valid Client client, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("clientViews/findClientByName");
        }
        clientService.findByNameAndSurname(client.getName(), client.getSurname());
        return new ModelAndView("clientViews/findClientByNameDisplay");
    }
}
