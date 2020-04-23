package com.anupriya.flightcheckin.integration;

import com.anupriya.flightcheckin.integration.dto.Reservation;
import com.anupriya.flightcheckin.integration.dto.ReservationUpdateRequest;
import com.sun.org.apache.bcel.internal.generic.RET;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReservationRestClient {

    @Value("${com.anupriya.flightcheckin.reservation.update.url}")
    private String RESERVATION_REST_URL;
    private RestTemplate restTemplate = new RestTemplate();

    public Reservation findReservation(Long id) {
        ResponseEntity<Reservation> reservationResponseEntity = restTemplate.getForEntity(
                RESERVATION_REST_URL + id,
                Reservation.class);
        return reservationResponseEntity.getBody();
    }

    public Reservation updateReservation(ReservationUpdateRequest request) {
        ResponseEntity<Reservation> reservationResponseEntity = restTemplate.postForEntity(
                RESERVATION_REST_URL,
                request, Reservation.class);
        return reservationResponseEntity.getBody();
    }
}
