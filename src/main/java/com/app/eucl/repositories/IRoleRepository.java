package com.app.eucl.repositories;

import com.app.eucl.enums.ERole;
import com.app.eucl.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRoleRepository extends JpaRepository<Role, UUID> {
    Role findByRole(ERole eRole);
}
