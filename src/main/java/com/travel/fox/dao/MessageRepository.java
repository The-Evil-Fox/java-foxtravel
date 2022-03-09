package com.travel.fox.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.travel.fox.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}