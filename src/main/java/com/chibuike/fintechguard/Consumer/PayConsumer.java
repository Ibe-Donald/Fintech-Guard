package com.chibuike.fintechguard.Consumer;

import com.chibuike.fintechguard.Message.Transaction;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PayConsumer {

    @RabbitListener(queues = "app-queue")
    public void handleTransaction(Transaction txn){
        System.out.println("----- NEW TRANSACTION RECEIVED -----");
        System.out.println(" Transaction ID, " + txn.getTransactionId() + " for " + txn.getUserName());
        System.out.println("Amount # is " + txn.getAmount());
        System.out.println("This transaction was received at " + txn.getCreatedDate());
        System.out.println("Transaction performed at, " + txn.getLocation());
    }
}
