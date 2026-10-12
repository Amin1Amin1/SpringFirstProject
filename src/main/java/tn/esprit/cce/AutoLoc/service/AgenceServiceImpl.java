package tn.esprit.cce.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.cce.AutoLoc.domain.Agence;
import tn.esprit.cce.AutoLoc.repository.AgenceRepository;

@Service
public class AgenceServiceImpl extends AbstractCrudService<Agence> implements AgenceService {

    public AgenceServiceImpl(AgenceRepository repository) {
        super(repository);
    }
}