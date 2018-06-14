package org.sid.repository;

import org.sid.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {

}
