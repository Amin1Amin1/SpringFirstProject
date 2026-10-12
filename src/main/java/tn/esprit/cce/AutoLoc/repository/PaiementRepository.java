package tn.esprit.cce.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cce.AutoLoc.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}