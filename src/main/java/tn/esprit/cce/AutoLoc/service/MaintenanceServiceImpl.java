package tn.esprit.cce.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.cce.AutoLoc.domain.Maintenance;
import tn.esprit.cce.AutoLoc.repository.MaintenanceRepository;

@Service
public class MaintenanceServiceImpl extends AbstractCrudService<Maintenance> implements MaintenanceService {

    public MaintenanceServiceImpl(MaintenanceRepository repository) {
        super(repository);
    }
}