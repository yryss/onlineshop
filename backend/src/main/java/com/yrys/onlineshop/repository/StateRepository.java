package com.yrys.onlineshop.repository;

import com.yrys.onlineshop.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// @CrossOrigin
@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {

    List<State> findByCountryCode(@Param("code") String code);
}
