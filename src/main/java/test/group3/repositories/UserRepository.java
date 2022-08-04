package test.group3.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import test.group3.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {

    @Query("SELECT u FROM User u where u.email = :email")
    public User findUserByEmail(@Param("email") String email);

    
}
