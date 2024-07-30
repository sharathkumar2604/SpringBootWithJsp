package com.spring.masala.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.masala.dto.MasalaDto;

@Repository
public interface MasalaRepo extends JpaRepository<MasalaDto, Serializable> {

}
