package com.example.accessingdatajpa;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "auth_user_user_permissions", schema = "public", catalog = "postgres")
public class AuthUserUserPermissions {
    private Integer id;
    private AuthUser authUserByUserId;
    private AuthPermission authPermissionByPermissionId;

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
        AuthUserUserPermissions that = (AuthUserUserPermissions) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public AuthUser getAuthUserByUserId() {
        return authUserByUserId;
    }

    public void setAuthUserByUserId(AuthUser authUserByUserId) {
        this.authUserByUserId = authUserByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "permission_id", referencedColumnName = "id", nullable = false)
    public AuthPermission getAuthPermissionByPermissionId() {
        return authPermissionByPermissionId;
    }

    public void setAuthPermissionByPermissionId(AuthPermission authPermissionByPermissionId) {
        this.authPermissionByPermissionId = authPermissionByPermissionId;
    }
}
