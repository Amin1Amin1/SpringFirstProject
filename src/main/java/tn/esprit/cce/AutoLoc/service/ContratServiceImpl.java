package tn.esprit.cce.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.cce.AutoLoc.domain.Contrat;
import tn.esprit.cce.AutoLoc.repository.ContratRepository;

@Service
public class ContratServiceImpl extends AbstractCrudService<Contrat> implements ContratService {

    public ContratServiceImpl(ContratRepository repository) {
        super(repository);
    }
}