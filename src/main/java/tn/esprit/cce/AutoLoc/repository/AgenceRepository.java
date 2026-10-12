package tn.esprit.cce.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cce.AutoLoc.domain.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}