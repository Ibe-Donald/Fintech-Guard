package com.chibuike.fintechguard.Producer;

import com.chibuike.fintechguard.Message.Transaction;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
public class PayController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/process")
    public String payProcess(@RequestBody Transaction txn){

        rabbitTemplate.convertAndSend("app-queue", txn);

        return "Transaction with transaction ID, " + txn.getTransactionId() + " is being Processed";
    }

}
