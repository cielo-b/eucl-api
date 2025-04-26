package com.app.eucl.serviceImpls.notifications;

import com.app.eucl.dto.responses.ApiResponse;
import com.app.eucl.repositories.INotificationRepository;
import com.app.eucl.services.notifications.INotificationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NotificationsServiceImpl implements INotificationsService {
    private final INotificationRepository notificationRepository;

    @Override
    public ApiResponse getNotificationsByMeter(int meterId) {
        return new ApiResponse(notificationRepository.findAllByMeterNumber(meterId), null);
    }
}
