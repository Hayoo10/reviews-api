package com.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "anime")
public class Anime {
      @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "Name is mandatory") 
    @NotBlank(message = "Name is mandatory") 
    private String title;
    
    @NotNull(message = "Name is mandatory") 
    @NotBlank(message = "Name is mandatory") 
    private String imgURL;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
    
   
