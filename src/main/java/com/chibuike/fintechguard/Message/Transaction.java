package com.chibuike.fintechguard.Message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private String transactionId;

    private String userName;

    private BigDecimal amount;

    private String location;

    private LocalDateTime createdDate;
}
