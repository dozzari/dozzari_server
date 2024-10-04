package today.dozzari.server.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.auth.domain.Provider;
import today.dozzari.server.user.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmailAndProvider(String email, Provider provider);
}
