package tn.esprit.pokerplaning.Repositories.User;

import tn.esprit.pokerplaning.Entities.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User , Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findUserByEmail(String email);




    User getUserByResetToken(String resetToken);
}
