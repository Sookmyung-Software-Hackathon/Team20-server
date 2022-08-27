package com.example.smswhteam20.controller;

import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.domain.Rental;
import com.example.smswhteam20.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class RentalController {

    private final RentalService rentalService;


    // 물건 대여하기 -> 바로 승인됨!
    // 파라미터 순서대로 : 대여할 member, 대여할 물품, 대여 시간, 대여 메모
    // return 값 : 대여 신청 객체 Rental rental
    @PostMapping("/rental/create")
    public Rental createRental(@RequestBody Member member,
                                @RequestBody Registration registration,
                                @RequestParam(required = false, defaultValue = "") Integer rentalTime,
                                @RequestParam(required = false, defaultValue = "")String memo){
        Rental rental = new Rental(member.getId(), registration.getItemId(), rentalTime, memo);
        rentalService.createRental(rental);
        rentalService.confirmRental(rental.getRentalId(), registration.getItemId());
        return rental;
    }

    // 신청한 RentalId로 지금 대여중인 ApproveRental 객체 찾기 -> 미완
    @GetMapping("/rental/searchApproveRental")
    public ApproveRental searchApproveRental(@RequestBody Rental rental){
        return null;
    }


    // 물건 반납하기 -> 마이페이지. 대여 완료된 리스트로 들어감
    // 파라미터 순서대로 : 지금 대여 중인 물품(승인된 물품), 물품
    @PostMapping("rental/return")
    public void returnRental(@RequestBody ApproveRental approveRental,
                               @RequestBody Registration registration){
        rentalService.returnRental(approveRental.getApproveRentalId(), registration.getItemId());
    }


}
