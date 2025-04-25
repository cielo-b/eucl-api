package com.app.eucl.repositories;

import com.app.eucl.models.Meter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IMeterRepository extends JpaRepository<Meter, UUID> {
}
