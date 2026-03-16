/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.springboot_app.model;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface LocationRepository extends CrudRepository<Location, Long> {
	Location findByDesignation(String designation);
	Optional<Location> findById(Long id);
}

