package tn.esprit.cce.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cce.AutoLoc.domain.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}