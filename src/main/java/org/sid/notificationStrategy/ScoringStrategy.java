package org.sid.notificationStrategy;

import org.sid.Agent;
import org.sid.model.Transaction;
import org.sid.model.TransactionType;

public class ScoringStrategy implements NotificationStrategy {
    @Override
    public void handleNotification(String agentName, Transaction transaction, Agent agent) {
        double currentBalance = agent.getBalance();
        if (transaction.getType() == TransactionType.SALE) {
            currentBalance += transaction.getAmount();
        } else if (transaction.getType() == TransactionType.PURCHASE) {
            currentBalance -= transaction.getAmount();
        }
        agent.setBalance(currentBalance);
        System.out.println(agent.getName() + " a mis à jour son solde : " + currentBalance);
    }
}