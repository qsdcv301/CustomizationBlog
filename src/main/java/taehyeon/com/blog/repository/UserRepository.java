package taehyeon.com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import taehyeon.com.blog.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
