package com.example.taskm.repository;

import com.example.taskm.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeveloperRepository extends JpaRepository<Developer, UUID> {
}
