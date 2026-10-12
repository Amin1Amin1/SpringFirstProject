package tn.esprit.cce.AutoLoc.service;

import org.springframework.stereotype.Service;
import tn.esprit.cce.AutoLoc.domain.Reservation;
import tn.esprit.cce.AutoLoc.repository.ReservationRepository;

@Service
public class ReservationServiceImpl extends AbstractCrudService<Reservation> implements ReservationService {

    public ReservationServiceImpl(ReservationRepository repository) {
        super(repository);
    }
}