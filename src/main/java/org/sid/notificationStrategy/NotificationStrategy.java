package org.sid.notificationStrategy;

import org.sid.Agent;
import org.sid.model.Transaction;

public interface NotificationStrategy {
    void handleNotification(String agentName, Transaction transaction, Agent agent);
}