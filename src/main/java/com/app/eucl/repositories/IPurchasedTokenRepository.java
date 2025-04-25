package com.app.eucl.repositories;

import com.app.eucl.models.PurchasedToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPurchasedTokenRepository extends JpaRepository<PurchasedToken, UUID> {
}
