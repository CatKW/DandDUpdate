package com.aim.java.FinalProject.playerDB.DungeonsAndDragons.playerclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playerclass")
public class Playerclasses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name = "playerclass_id")
    private Integer id;

    @Column(name = "playerclass_name")
    private String name;
    
    @Column(name = "playerclass_desc")
    private String description;
    
    @Column(name = "playerclass_url")
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

   
}