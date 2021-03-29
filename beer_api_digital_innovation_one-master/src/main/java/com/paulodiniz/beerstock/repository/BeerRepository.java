package com.paulodiniz.beerstock.repository;

import com.paulodiniz.beerstock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {
    //DAO - Classe responsável por conversar com o banco de dados
    Optional<Beer> findByName(String name);
}
