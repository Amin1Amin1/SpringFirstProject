package tn.esprit.cce.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.cce.AutoLoc.domain.Vehicule;
import tn.esprit.cce.AutoLoc.repository.VehiculeRepository;

@Service
public class VehiculeServiceImpl extends AbstractCrudService<Vehicule> implements VehiculeService {

    public VehiculeServiceImpl(VehiculeRepository repository) {
        super(repository);
    }
}