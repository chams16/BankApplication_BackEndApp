package com.example.demo.Repository;

import com.example.demo.Model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {
    Entreprise findBypassword(String password);

}
