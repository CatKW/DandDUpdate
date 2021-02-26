package com.aim.java.FinalProject.playerDB.DungeonsAndDragons.level;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "level")
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "level_id")

    private Integer id;
    private int experiencePoints;
    private int level;
    private String proficiencyBonus;
    private String feats;
    private String abilityIncrease;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(String proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public String getFeats() {
        return feats;
    }

    public void setFeats(String feats) {
        this.feats = feats;
    }

    public String getAbilityIncrease() {
        return abilityIncrease;
    }

    public void setAbilityIncrease(String abilityIncrease) {
        this.abilityIncrease = abilityIncrease;
    }
}
