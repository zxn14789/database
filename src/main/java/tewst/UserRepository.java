package tewst;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tewst.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

