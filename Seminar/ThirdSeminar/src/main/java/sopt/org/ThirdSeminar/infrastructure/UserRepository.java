package sopt.org.ThirdSeminar.infrastructure;

import org.springframework.data.repository.Repository;
import sopt.org.ThirdSeminar.domain.User;

public interface UserRepository extends Repository<User, Long> {
    void save(User user);
}
