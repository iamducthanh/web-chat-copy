package com.webchat.webchat.service;

import com.webchat.webchat.entities.Notification;

import java.util.List;

public interface INotificationService {
    List<Notification> findByUser(String username);
}