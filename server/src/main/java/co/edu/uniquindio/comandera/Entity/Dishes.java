package co.edu.uniquindio.comandera.Entity;

import java.util.Locale.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dishes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String preparationArea;
    private Category[] categories;
    private Integer stimedTime;

    public Dishes(String name, String preparationArea, Category[] categories, Integer stimedTime) {
        this.name = name;
        this.preparationArea = preparationArea;
        this.categories = categories;
        this.stimedTime = stimedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreparationArea() {
        return preparationArea;
    }

    public void setPreparationArea(String preparationArea) {
        this.preparationArea = preparationArea;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Integer getStimedTime() {
        return stimedTime;
    }

    public void setStimedTime(Integer stimedTime) {
        this.stimedTime = stimedTime;
    }

    

}
