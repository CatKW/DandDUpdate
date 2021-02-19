package com.aim.java.FinalProject.playerDB.DungeonsAndDragons.playerclass;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class PlayerclassController {

    @Autowired

    private PlayerclassRepository playerclassRepository;

    @GetMapping(path = "")
    public Iterable<Playerclass>getAllPlayerclasses() {
        return playerclassRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Playerclass getPlayerclass(@PathVariable(value = "id") Integer id) {
        Optional<Playerclass> playerclass = playerclassRepository.findById(id);
        return playerclass.get();
    }

    @PostMapping(path = "/")
    public Playerclass createPlayerclass(@RequestBody Playerclass playerclass) {
        return playerclassRepository.save(playerclass);
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updatePlayerclass(@PathVariable(value = "id") Integer id, @RequestBody Playerclass playerclassDetails) {
        Optional<Playerclass> optionalPlayerclass = playerclassRepository.findById(id);
        Playerclass playerclass = optionalPlayerclass.get();    

        playerclass.setPlayerclassDesc(playerclassDetails.getPlayerclassDesc());
        playerclass.setPlayerclassName(playerclassDetails.getPlayerclassName());
        playerclass.setPlayerclassUrl(playerclassDetails.getPlayerclassUrl());

        playerclassRepository.save(playerclassDetails);
        return "Updated";
    }

}