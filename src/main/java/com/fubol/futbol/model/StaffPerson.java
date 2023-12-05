package com.fubol.futbol.model;

import com.fubol.futbol.model.enums.StaffType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Builder
@AllArgsConstructor
@Table(name="STAFF_PERSON")
@NamedQuery(name="STAFF_PERSON.findAll", query="SELECT i FROM StaffPerson i")
public class StaffPerson implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="STAFF_PERSON_ID")
    private long staffPersonID;

    @Column(name="STAFF_TYPE")
    private StaffType staffType;

    @Column(name="STAFF_PERSON_NAME")
    private long name;

    @Column(name="STAFF_PERSON_LASTNAME")
    private long lastName;

    @Column(name="STAFF_NACIONALITY")
    private String nationality;

    @Column(name = "STAFF_PERSON_BDAY")
    private LocalDate birthday;

    @ManyToOne
    @JoinColumn(name = "STAFF_ID")
    private Staff staff;

    public StaffPerson() {

    }
}
