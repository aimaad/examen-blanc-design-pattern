package org.sid.notificationStrategy;


import org.sid.Agent;
import org.sid.model.Transaction;

public class HistoryStrategy implements NotificationStrategy {
    @Override
    public void handleNotification(String agentName, Transaction transaction, Agent agent) {
        agent.getNotificationHistory().add(transaction);
        System.out.println(agent.getName() + " a ajouté la transaction à son historique : " + transaction);
    }
}