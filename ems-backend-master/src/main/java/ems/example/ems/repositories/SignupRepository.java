package ems.example.ems.repositories;
import ems.example.ems.models.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupRepository extends JpaRepository<Signup, Long> {
    Signup findByEmail(String email);
}
