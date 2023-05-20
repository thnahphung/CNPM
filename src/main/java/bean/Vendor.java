package bean;

import java.io.Serializable;

public class Vendor implements Serializable {
    private int id;
    private String name;
    private String imageSrc;
    private String address;
    private String phone;
    private String email;

    public Vendor(){

    }

    public Vendor(int id, String name, String imageSrc, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.imageSrc = imageSrc;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgSrc='" + imageSrc + '\'' +
                ", address=" + address + '\'' +
                ", phone="  + phone + '\'' +
                ", email="  + email +
                '}';
    }

}
