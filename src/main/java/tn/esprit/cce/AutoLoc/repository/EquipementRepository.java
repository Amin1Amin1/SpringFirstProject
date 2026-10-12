package tn.esprit.cce.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cce.AutoLoc.domain.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}