package tn.esprit.cce.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cce.AutoLoc.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}