package co.edu.uniquindio.comandera.Entities;

public class TeamMember extends Admin {
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
