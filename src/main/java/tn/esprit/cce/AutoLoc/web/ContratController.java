package tn.esprit.cce.AutoLoc.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.cce.AutoLoc.domain.Contrat;
import tn.esprit.cce.AutoLoc.service.ContratService;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
public class ContratController {

    private final ContratService service;

    public ContratController(ContratService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contrat> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contrat> findById(@PathVariable Long id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Contrat> create(@RequestBody Contrat contrat) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(contrat));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contrat> update(@PathVariable Long id, @RequestBody Contrat contrat) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        contrat.setIdContrat(id);
        return ResponseEntity.ok(service.save(contrat));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}