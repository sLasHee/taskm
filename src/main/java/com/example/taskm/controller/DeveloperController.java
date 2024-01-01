package com.example.taskm.controller;

import com.example.taskm.dto.DeveloperDTO;
import com.example.taskm.entity.Developer;
import com.example.taskm.repository.DeveloperRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class DeveloperController {
    private final DeveloperRepository repository;

    public DeveloperController(DeveloperRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/create")
    public void createDeveloper(@Valid @RequestBody DeveloperDTO developerDTO) {
        Developer developer = new Developer();
        developer.setNickName(developerDTO.getNickName());
        developer.setAge(developerDTO.getAge());
        repository.save(developer);
    }

    @GetMapping("dev")
    private List<Developer> getDevelopers() {
        return repository.findAll();
    }

    @DeleteMapping("delete")
    private void deleteDeveloper(@RequestParam UUID id) {
        Optional<Developer> optional = repository.findById(id);
        if (optional.isPresent()) {
            Developer developer = optional.get();
            repository.delete(developer);
        }
    }
}
