package com.oburnett127.accountservice.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class TransferRequest {
    private UUID idSender;
    private UUID idReceiver;
    private BigDecimal amount;
}