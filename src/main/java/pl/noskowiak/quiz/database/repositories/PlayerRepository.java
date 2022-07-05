package pl.noskowiak.quiz.database.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.noskowiak.quiz.database.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
