package com.aim.java.FinalProject.playerDB.DungeonsAndDragons.alignments;

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
@RequestMapping(path = "/api/alignment")
public class AlignmentsController {
    
    @Autowired

    private AlignmentsRepository alignmentsRepository;

    @GetMapping(path = "")
    public Iterable<Alignments>getAllAlignments() {
        return alignmentsRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Alignments getAlignments(@PathVariable(value = "id") Integer id) {
        Optional<Alignments> alignments = alignmentsRepository.findById(id);
        return alignments.get();
    }

    @PostMapping(path = "/")
    public Alignments createAlignments(@RequestBody Alignments alignments) {
        return alignmentsRepository.save(alignments);
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateAlignments(@PathVariable(value = "id") Integer id, @RequestBody Alignments alignmentDetails) {
        Optional<Alignments> optionalAlignments = alignmentsRepository.findById(id);
        Alignments alignments = optionalAlignments.get();

        alignments.setDescription(alignmentDetails.getDescription());
        alignments.setName(alignmentDetails.getName());

        alignmentsRepository.save(alignmentDetails);
        return "Updated";
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteAlignments (@PathVariable(value = "id") Integer id) {
        alignmentsRepository.deleteById(id);
        return "Deleted";
    }
}
