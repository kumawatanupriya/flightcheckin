package com.anupriya.flightcheckin.controllers;

import com.anupriya.flightcheckin.integration.ReservationRestClient;
import com.anupriya.flightcheckin.integration.dto.Reservation;
import com.anupriya.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CheckInController {

    @Autowired
    ReservationRestClient restClient;

    @GetMapping("/reservations/{reservationId}")
    public ResponseEntity<Reservation> startCheckIn(@PathVariable Long reservationId) {
        Reservation reservation = restClient.findReservation(reservationId);
        return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
    }

    @PostMapping("/reservations")
    public ResponseEntity<Reservation> completeCheckIn(@RequestBody ReservationUpdateRequest request){
        Reservation reservation = restClient.updateReservation(request);
        return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
    }
}
