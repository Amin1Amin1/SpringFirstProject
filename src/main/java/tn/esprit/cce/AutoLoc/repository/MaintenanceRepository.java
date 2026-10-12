package tn.esprit.cce.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cce.AutoLoc.domain.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}