package fr.spring.boot.heroku.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.spring.boot.heroku.entities.Appareil;

@Repository
public interface AppareilDao extends JpaRepository<Appareil, Long> {

}
