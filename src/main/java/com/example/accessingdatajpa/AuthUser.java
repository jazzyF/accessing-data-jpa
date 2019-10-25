package com.example.accessingdatajpa;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "auth_user", schema = "public", catalog = "postgres")
public class AuthUser {
    private Integer id;
    private String password;
    private LocalDateTime lastLogin;
    private Boolean isSuperuser;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isStaff;
    private Boolean isActive;
    private LocalDateTime dateJoined;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "last_login")
    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Basic
    @Column(name = "is_superuser")
    public Boolean getSuperuser() {
        return isSuperuser;
    }

    public void setSuperuser(Boolean superuser) {
        isSuperuser = superuser;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "is_staff")
    public Boolean getStaff() {
        return isStaff;
    }

    public void setStaff(Boolean staff) {
        isStaff = staff;
    }

    @Basic
    @Column(name = "is_active")
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "date_joined")
    public LocalDateTime getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDateTime dateJoined) {
        this.dateJoined = dateJoined;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthUser authUser = (AuthUser) o;
        return Objects.equals(id, authUser.id) &&
                Objects.equals(password, authUser.password) &&
                Objects.equals(lastLogin, authUser.lastLogin) &&
                Objects.equals(isSuperuser, authUser.isSuperuser) &&
                Objects.equals(username, authUser.username) &&
                Objects.equals(firstName, authUser.firstName) &&
                Objects.equals(lastName, authUser.lastName) &&
                Objects.equals(email, authUser.email) &&
                Objects.equals(isStaff, authUser.isStaff) &&
                Objects.equals(isActive, authUser.isActive) &&
                Objects.equals(dateJoined, authUser.dateJoined);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, lastLogin, isSuperuser, username, firstName, lastName, email, isStaff, isActive, dateJoined);
    }
}
