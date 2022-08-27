package com.example.smswhteam20.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    private String itemName;

    private String memberId;
    private Long itemPrice;

    private String memo;

    private String category;


    public Registration(String itemName, String memo, String memberId, String category, Long itemPrice) {
        this.itemName = itemName;
        this.memo = memo;
        this.memberId = memberId;
        this.category = category;
        this.itemPrice = itemPrice;
    }


    public Integer getItemId() {
        return itemId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Long getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getMemo() { return memo;
    }

    public void setMemo(String memo) { this.memo = memo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
