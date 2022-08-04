package test.group3.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.group3.entities.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Serializable> {
    
}
