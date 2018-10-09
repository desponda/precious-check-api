package com.preciousccheck.api.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Precious implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date checkedInTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precious precious = (Precious) o;
        return Objects.equals(id, precious.id) &&
                Objects.equals(checkedInTime, precious.checkedInTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkedInTime);
    }

    public Long getId() {
        return id;
    }

    public Date getCheckedInTime() {
        return checkedInTime;
    }

    public void setCheckedInTime(Date checkedInTime) {
        this.checkedInTime = checkedInTime;
    }
}
