package me.dio.desafiojavaapi.domain.repository;

import me.dio.desafiojavaapi.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

}
