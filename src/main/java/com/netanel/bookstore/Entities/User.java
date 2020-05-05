package com.netanel.bookstore.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
 
    @Column(name="username")
    private String username;  

    @Column(name="password")
    private String password;

    @Column(name = "deleted")
    private boolean deleted;

    public User(){

    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.deleted = false;
    }
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}