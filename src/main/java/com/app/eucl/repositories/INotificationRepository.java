package com.app.eucl.repositories;

import com.app.eucl.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface INotificationRepository extends JpaRepository<Notification, UUID> {
    List<Notification> findAllByMeterNumber(int meterId);
}
