package test.group3.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import test.group3.entities.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Serializable>{

    @Query("SELECT p FROM Profile p WHERE p.user.email = :email")
    public List<Profile> findProfilesByUserEmail(@Param("email") String email);
    
}
