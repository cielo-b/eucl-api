package com.app.eucl.services.mail;

import com.app.eucl.models.Notification;

public interface IMailService {
    void sendMail(Notification notification);
}
