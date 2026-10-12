package tn.esprit.cce.AutoLoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cce.AutoLoc.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}