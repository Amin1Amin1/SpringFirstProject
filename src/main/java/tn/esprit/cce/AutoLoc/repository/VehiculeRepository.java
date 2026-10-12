package tn.esprit.cce.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cce.AutoLoc.domain.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}