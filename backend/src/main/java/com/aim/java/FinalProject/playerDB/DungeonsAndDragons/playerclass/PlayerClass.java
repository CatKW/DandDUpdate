package com.aim.java.FinalProject.playerDB.DungeonsAndDragons.playerclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playerclass")
public class Playerclass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name = "playerclass_id")
    private Integer id;

    @Column(name = "playerclass_name")
    private String playerclassName;
    
    @Column(name = "playerclass_desc")
    private String playerclassDesc;
    
    @Column(name = "playerclass_url")
    private String playerclassUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerclassName() {
        return playerclassName;
    }

    public void setPlayerclassName(String playerclassName) {
        this.playerclassName = playerclassName;
    }

    public String getPlayerclassDesc() {
        return playerclassDesc;
    }

    public void setPlayerclassDesc(String playerclassDesc) {
        this.playerclassDesc = playerclassDesc;
    }

    public String getPlayerclassUrl() {
        return playerclassUrl;
    }

    public void setPlayerclassUrl(String playerclassUrl) {
        this.playerclassUrl = playerclassUrl;
    }
}
