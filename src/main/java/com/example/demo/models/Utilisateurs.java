package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Utilisateurs  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String Email ;
    private String username;
    @JsonIgnore
    private String password;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Utilisateurs() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Utilisateurs(Long id, String email,String username, String password) {
        super();
        this.id = id;
        Email = email;
        this.username = username;
        this.password = password;
    }
    public Utilisateurs(Long id, String email, String username) {
        this.id = id;
        Email = email;
        this.username = username;
    }


}
