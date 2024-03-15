package ems.example.ems.repositories;

import ems.example.ems.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Tasks,Long> {
}
