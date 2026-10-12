package tn.esprit.cce.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.cce.AutoLoc.domain.Client;
import tn.esprit.cce.AutoLoc.repository.ClientRepository;

@Service
public class ClientServiceImpl extends AbstractCrudService<Client> implements ClientService {

    public ClientServiceImpl(ClientRepository repository) {
        super(repository);
    }
}