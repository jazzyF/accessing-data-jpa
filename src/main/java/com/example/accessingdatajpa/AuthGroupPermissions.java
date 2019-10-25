package com.example.accessingdatajpa;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "auth_group_permissions", schema = "public", catalog = "postgres")
public class AuthGroupPermissions {
    private Integer id;
    private AuthGroup authGroupByGroupId;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthGroupPermissions that = (AuthGroupPermissions) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    public AuthGroup getAuthGroupByGroupId() {
        return authGroupByGroupId;
    }

    public void setAuthGroupByGroupId(AuthGroup authGroupByGroupId) {
        this.authGroupByGroupId = authGroupByGroupId;
    }
}
