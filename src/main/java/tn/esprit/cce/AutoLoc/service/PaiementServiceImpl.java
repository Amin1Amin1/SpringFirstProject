package tn.esprit.cce.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.cce.AutoLoc.domain.Paiement;
import tn.esprit.cce.AutoLoc.repository.PaiementRepository;

@Service
public class PaiementServiceImpl extends AbstractCrudService<Paiement> implements PaiementService {

    public PaiementServiceImpl(PaiementRepository repository) {
        super(repository);
    }
}