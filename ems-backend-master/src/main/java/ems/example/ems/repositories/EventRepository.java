package ems.example.ems.repositories;

import ems.example.ems.models.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Events,Long> {
}
