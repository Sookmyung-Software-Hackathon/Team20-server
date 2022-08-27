package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.Rental;
import com.example.smswhteam20.repository.ApproveRentalRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RentalServiceTest {
    @Autowired RentalService rentalService;

    @Test
    public void rentalIntegration(){
        Rental rental = new Rental("1", 2, 3, "4");
        rentalService.createRental(rental);
        ApproveRental approveRental = rentalService.confirmRental(rental.getRentalId(), rental.getItemId());
        rentalService.returnRental(approveRental.getApproveRentalId(), approveRental.getItemId());


    }

}
