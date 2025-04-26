package com.app.eucl.services.notifications;

import com.app.eucl.dto.responses.ApiResponse;

import java.util.UUID;

public interface INotificationsService {
    ApiResponse getNotificationsByMeter(int meterId);
}
