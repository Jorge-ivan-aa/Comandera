package co.edu.uniquindio.comandera.infraestructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workers{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String designedArea;
    private String phone;
    
    public Workers() {
    }

    public Workers(String name, String password, String designedArea, String phone) {
        this.name = name;
        this.password = password;
        this.designedArea = designedArea;
        this.phone = phone;
    }

    public String getDesignedArea() {
        return designedArea;
    }

    public void setDesignedArea(String designedArea) {
        this.designedArea = designedArea;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
