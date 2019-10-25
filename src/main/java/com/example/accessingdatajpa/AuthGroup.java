package com.example.accessingdatajpa;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "auth_group", schema = "public", catalog = "postgres")
public class AuthGroup {
    private Integer id;
    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthGroup authGroup = (AuthGroup) o;
        return Objects.equals(id, authGroup.id) &&
                Objects.equals(name, authGroup.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
