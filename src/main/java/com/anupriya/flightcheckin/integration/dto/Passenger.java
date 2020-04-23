package com.anupriya.flightcheckin.integration.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Passenger{

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
}
