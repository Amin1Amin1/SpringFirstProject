package tn.esprit.cce.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.cce.AutoLoc.domain.Employe;
import tn.esprit.cce.AutoLoc.repository.EmployeRepository;

@Service
public class EmployeServiceImpl extends AbstractCrudService<Employe> implements EmployeService {

    public EmployeServiceImpl(EmployeRepository repository) {
        super(repository);
    }
}