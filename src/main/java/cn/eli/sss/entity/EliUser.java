package cn.eli.sss.entity;

import javax.persistence.*;

@Entity
@Table(name = "ELI_USER", schema = "SYSTEM", catalog = "")
public class EliUser {
    private long id;
    private String name;
    private String password;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EliUser eliUser = (EliUser) o;

        if (id != eliUser.id) return false;
        if (name != null ? !name.equals(eliUser.name) : eliUser.name != null) return false;
        if (password != null ? !password.equals(eliUser.password) : eliUser.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
