package com.aim.java.FinalProject.playerDB.DungeonsAndDragons.players;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aim.java.FinalProject.playerDB.DungeonsAndDragons.alignment.Alignments;
import com.aim.java.FinalProject.playerDB.DungeonsAndDragons.armor.Armors;
import com.aim.java.FinalProject.playerDB.DungeonsAndDragons.creature.Creatures;
import com.aim.java.FinalProject.playerDB.DungeonsAndDragons.level.Level;
import com.aim.java.FinalProject.playerDB.DungeonsAndDragons.race.Races;
import com.aim.java.FinalProject.playerDB.DungeonsAndDragons.weapons.Weapons;

@Entity
@Table(name = "players")
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "player_id")

    private Integer id;
    private String playerName;
    
    private String characterName;

    @ManyToOne
    @JoinColumn(name = "creature_id", nullable = false)
    private Creatures creatures;

    @ManyToOne
    @JoinColumn(name = "race_id", nullable = false)
    private Races races;

 

    @ManyToOne
    @JoinColumn(name = "armor_id", nullable = false)
    private Armors armors;

    @ManyToOne
    @JoinColumn(name = "weapon_id",nullable = false)
    private Weapons weapons;

    @ManyToOne
    @JoinColumn(name = "alignment_id", nullable = false)
    private Alignments alignments;

    @ManyToOne
    @JoinColumn(name = "level_id", nullable = false)
    private Level level;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    

    public Races getRaces() {
        return races;
    }

    public void setRaces(Races races) {
        this.races = races;
    }

    public Armors getArmors() {
        return armors;
    }

    public void setArmors(Armors armors) {
        this.armors = armors;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public Alignments getAlignments() {
        return alignments;
    }

    public void setAlignment(Alignments alignments) {
        this.alignments = alignments;
    }


    public Creatures getCreatures() {
        return creatures;
    }

    public void setCreatures(Creatures creatures) {
        this.creatures = creatures;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setAlignments(Alignments alignments) {
        this.alignments = alignments;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

}
