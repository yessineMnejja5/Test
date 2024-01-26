package tn.esprit.test_test.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.test_test.Entities.Client;
import tn.esprit.test_test.Services.ClientService;

@RestController
@RequestMapping("/Client")

public class ClientController {

    ClientService clientService;
    @PostMapping("ajouterClient")
    public ResponseEntity<Client> ajouterClient(@RequestBody Client cl){
        Client clientAjouter = clientService.ajouterClient(cl);
        return new ResponseEntity<Client>(clientAjouter, HttpStatus.CREATED);
    }

}
