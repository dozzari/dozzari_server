package today.dozzari.server.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import today.dozzari.server.user.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
}
