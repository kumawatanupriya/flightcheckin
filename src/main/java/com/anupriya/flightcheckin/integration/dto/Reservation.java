package com.anupriya.flightcheckin.integration.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation{

    private Boolean checkedIn;
    private int numberOfBags;
    private Passenger passenger;
    private Flight flight;
}

