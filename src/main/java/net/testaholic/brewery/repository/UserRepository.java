package net.testaholic.brewery.repository;

import net.testaholic.brewery.domain.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> findOneByEmail(String email);
}
