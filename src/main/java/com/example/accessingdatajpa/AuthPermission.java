package com.example.accessingdatajpa;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "auth_permission", schema = "public", catalog = "postgres")
public class AuthPermission {
    private Integer id;
    private String name;
    private String codename;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "codename")
    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthPermission that = (AuthPermission) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(codename, that.codename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, codename);
    }
}
