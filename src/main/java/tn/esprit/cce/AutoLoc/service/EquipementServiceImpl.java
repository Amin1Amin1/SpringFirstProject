package tn.esprit.cce.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.cce.AutoLoc.domain.Equipement;
import tn.esprit.cce.AutoLoc.repository.EquipementRepository;

@Service
public class EquipementServiceImpl extends AbstractCrudService<Equipement> implements EquipementService {

    public EquipementServiceImpl(EquipementRepository repository) {
        super(repository);
    }
}