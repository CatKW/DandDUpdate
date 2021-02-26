package com.aim.java.FinalProject.playerDB.DungeonsAndDragons.level;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/level")
public class LevelController {
    @Autowired

    private LevelRepository levelRepository;

    @GetMapping(path = "")
    public Iterable<Level>getAllLevels() {
        return levelRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Level getLevel(@PathVariable(value = "id") Integer id) {
        Optional<Level> level = levelRepository.findById(id);
        return level.get();
    }
}
