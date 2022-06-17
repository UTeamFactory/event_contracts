package com.perustars.event.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class EventDeleted {
    private String eventId;
    private Instant occurredOn;
}
