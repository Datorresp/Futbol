package com.fubol.futbol.model;

import com.fubol.futbol.model.enums.StaffType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@Table(name="STAFF")
@NamedQuery(name="STAFF.findAll", query="SELECT i FROM Staff i")
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="STAFF_ID_GENERATOR", allocationSize = 1, sequenceName="STAFF_SEQ")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STAFF_ID_GENERATOR")
    @Column(name="STAFF_ID")
    private long staffID;

    @Column(name="STAFF_NAME")
    private String staffName;

    @OneToMany(mappedBy="staff")
    private List<StaffPerson> personList;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public Staff() {

    }
}
