package com.app.eucl.repositories;

import com.app.eucl.enums.ETokenStatus;
import com.app.eucl.models.PurchasedToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface IPurchasedTokenRepository extends JpaRepository<PurchasedToken, UUID> {
    Optional<PurchasedToken> findByTokenAndStatus(String token, ETokenStatus eTokenStatus);

    List<PurchasedToken> findByMeterNumber(int meterNumber);

    List<PurchasedToken> findByStatus(ETokenStatus eTokenStatus);
}
