package com.fubol.futbol.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@Table(name="Team")
@NamedQuery(name="Team.findAll", query="SELECT a FROM Team a")
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="TEAM_ID_GENERATOR", allocationSize = 1, sequenceName="TEAM_SEQ")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TEAM_ID_GENERATOR")
    @Column(name="TEAM_ID")
    private long teamID;

    @Column(name="TEAM_NAME")
    private String teamName;

    @Column(name="TEAM_CATEGORY")
    private String teamCategory;

    @Column(name="TEAM_TRAINIG_PLACE")
    private String trainingPlace;

    @Column(name="TEAM_STADIUM")
    private String stadium;

    @Column(name = "TEAM_FUNDATION_DATE")
    private LocalDate fundation;

    @OneToMany(mappedBy="team")
    private List<Staff> staffList;

    @OneToMany(mappedBy="team")
    private List<Player> players;

    @OneToMany(mappedBy="team")
    private List<Team> subsidiaries;

    public Team() {

    }
}
