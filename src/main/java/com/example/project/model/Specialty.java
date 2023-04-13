package com.example.project.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "specialties")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialty_id")
    private long id;

    @Column(name = "specialty_name")
    private String name;

    public Specialty(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Specialty() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialty specialty = (Specialty) o;
        return id == specialty.id &&
                name.equals(specialty.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
