package com.ssoon.infrastrcture.dao;

import com.ssoon.domain.model.entity.Hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository<Hello, Integer> {
}
