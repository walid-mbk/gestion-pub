package com.example.gestionpub.models;

import javax.persistence.*;

@Entity
@Table(name = "publicite")
public class Publicite {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name ="id")
    private long id;
    @Column(name="name_pub")
    private String name;
    @Column(name = "description_pub")
    private String description;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(name = "urlimage")
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Publicite() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Category getCategorytype() {
        return category;
    }

    public void setCategorytype(Category categorytype) {
        this.category = categorytype;
    }

    public Publicite(long id, String name, String description, Category category, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.image = image;
    }
}
