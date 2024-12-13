package org.sid;

import org.sid.model.Transaction;

public interface Observer {
    void update(String agentName, Transaction transaction);
}