package co.edu.uniquindio.comandera.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TeamMember extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Area designedArea;
    private String phone;

    public TeamMember(String name, String password, Area designedArea, String phone) {
        super(name, password);
        this.designedArea = designedArea;
        this.phone = phone;
    }

    public Area getDesignedArea() {
        return designedArea;
    }

    public void setDesignedArea(Area designedArea) {
        this.designedArea = designedArea;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
