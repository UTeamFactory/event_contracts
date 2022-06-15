package com.example.eventcontracts.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class DeleteEvent {
    @TargetAggregateIdentifier
    private String eventId;
}
