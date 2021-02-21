package com.aim.java.FinalProject.playerDB.DungeonsAndDragons.creatures;

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
@RequestMapping(path = "/api/creature")
public class CreaturesController {
    
    @Autowired

    private CreaturesRepository creaturesRepository;

    @GetMapping(path = "")
    public Iterable<Creatures>getAllCreatures() {
        return creaturesRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Creatures getCreatures(@PathVariable(value = "id") Integer id) {
        Optional<Creatures> creatures = creaturesRepository.findById(id);
        return creatures.get();
    }

    @PostMapping(path = "/")
    public Creatures createCreatures (@RequestBody Creatures creatures) {
        return creaturesRepository.save(creatures);
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateCreatures(@PathVariable(value = "id") Integer id, @RequestBody Creatures creaturesDetails) {
        Optional<Creatures> optionalCreatures = creaturesRepository.findById(id);
        Creatures creatures = optionalCreatures.get();

        creatures.setDescription(creaturesDetails.getDescription());
        creatures.setName(creaturesDetails.getName());
        creatures.setVideo(creaturesDetails.getVideo());

        creaturesRepository.save(creaturesDetails);
        return "Updated";
    }
    
    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteCreatures(@PathVariable(value = "id") Integer id) {
        creaturesRepository.deleteById(id);
        return "Deleted";
    }
}
