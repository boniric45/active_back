package fr.boniric.active.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@EnableAutoConfiguration
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true,nullable = false)
    private Long id;

    private String name;
    private String lastname;
    private String entreprise;
    private String address;
    private Integer zip;
    private String city;
    private String email;
    private String phone;
    private String role;
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String clientCode;

    public Client() {
    }

    public Client(String name, String lastname, String entreprise, String address, Integer zip, String city, String email, String phone, String role, String imageUrl, String clientCode) {
        this.name = name;
        this.lastname = lastname;
        this.entreprise = entreprise;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.imageUrl = imageUrl;
        this.clientCode = clientCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", entreprise='" + entreprise + '\'' +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", role='" + role + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", clientCode='" + clientCode + '\'' +
                '}';
    }
}
