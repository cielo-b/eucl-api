package com.app.eucl.repositories;

import com.app.eucl.models.Meter;
import com.app.eucl.models.User;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IMeterRepository extends JpaRepository<Meter, UUID> {
    boolean existsByMeterNumber(@NotNull(message = "Meter number must be provided.") @Size(max = 6, min = 6, message = "Meter number must be exactly 6 digits") int meterNumber);

    List<Meter> findAllByUser(User user);
}
