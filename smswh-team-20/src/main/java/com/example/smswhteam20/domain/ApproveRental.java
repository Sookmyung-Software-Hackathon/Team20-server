package com.example.smswhteam20.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ApproveRental")
public class ApproveRental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int approveRentalId;

    private int itemId;
    private int rentalId;

    private String memberId;

    private int rentalTime;

    private byte[] approveRentalImage = new byte[]{};



    public ApproveRental(int itemId, int rentalId, String memberId) {
        this.itemId = itemId;
        this.rentalId = rentalId;
        this.memberId = memberId;
    }

    public byte[] getApproveRentalImage() {
        return approveRentalImage;
    }

    public void setApproveRentalImage(byte[] approveRentalImage) {
        this.approveRentalImage = approveRentalImage;
    }

    public int getApproveRentalId() {
        return approveRentalId;
    }

    public void setApproveRentalId(int approveRentalId) {
        this.approveRentalId = approveRentalId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public int getRentalTime() {
        return rentalTime;
    }

    public void setRentalTime(int rentalTime) {
        this.rentalTime = rentalTime;
    }



}
