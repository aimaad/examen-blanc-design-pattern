package org.sid;

import org.sid.model.Transaction;

public interface Observable {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers(Transaction transaction);
}