package fr.boniric.active.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Sms implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;

    private Long clientCode;
    private String sms;
    private String comments;

    @Override
    public String toString() {
        return "sms{" +
                "id=" + id +
                ", clientCode=" + clientCode +
                ", sms='" + sms + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientCode() {
        return clientCode;
    }

    public void setClientCode(Long clientCode) {
        this.clientCode = clientCode;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Sms() {
    }

    public Sms(Long clientCode, String sms, String comments) {
        this.clientCode = clientCode;
        this.sms = sms;
        this.comments = comments;
    }

}
