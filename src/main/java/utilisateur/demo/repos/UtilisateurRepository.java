package utilisateur.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import utilisateur.demo.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository < Utilisateur, Long > {
}