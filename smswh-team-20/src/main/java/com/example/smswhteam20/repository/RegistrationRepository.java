package com.example.smswhteam20.repository;

import com.example.smswhteam20.domain.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration,Integer> {
    // save -> 등록

    // delete -> 삭제

}