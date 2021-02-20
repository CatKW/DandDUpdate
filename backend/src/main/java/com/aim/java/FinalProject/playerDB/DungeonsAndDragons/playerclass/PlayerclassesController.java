package com.aim.java.FinalProject.playerDB.DungeonsAndDragons.playerclass;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/playerclass")
public class PlayerclassesController {

    @Autowired

    private PlayerclassesRepository playerclassesRepository;

    @GetMapping(path = "")
    public Iterable<Playerclasses>getAllPlayerclasses() {
        return playerclassesRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Playerclasses getPlayerclasses(@PathVariable(value = "id") Integer id) {
        Optional<Playerclasses> playerclasses = playerclassesRepository.findById(id);
        return playerclasses.get();
    }

    @PostMapping(path = "/")
    public Playerclasses createPlayerclasses(@RequestBody Playerclasses playerclasses) {
        return playerclassesRepository.save(playerclasses);
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updatePlayerclasses(@PathVariable(value = "id") Integer id, @RequestBody Playerclasses playerclassesDetails) {
        Optional<Playerclasses> optionalPlayerclasses = playerclassesRepository.findById(id);
        Playerclasses playerclasses = optionalPlayerclasses.get();    
        
        playerclasses.setDescription(playerclassesDetails.getDescription());
        playerclasses.setName(playerclassesDetails.getName());
        playerclasses.setUrl(playerclassesDetails.getUrl());
        playerclassesRepository.save(playerclassesDetails);
        return "Updated";
    }

}