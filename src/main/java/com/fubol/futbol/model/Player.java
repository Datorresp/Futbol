package com.fubol.futbol.model;

import com.fubol.futbol.model.enums.PlayerType;
import com.fubol.futbol.model.enums.StaffType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Builder
@AllArgsConstructor
@Table(name="PLAYER")
@NamedQuery(name="PLAYER.findAll", query="SELECT i FROM Player i")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="PLAYER_ID")
    private long playerID;

    @Column(name="PLAYER_TYPE")
    private PlayerType playerType;

    @Column(name="PLAYER_NAME")
    private String name;

    @Column(name="PLAYER_LASTNAME")
    private String lastName;

    @Column(name="PLAYER_NACIONALITY")
    private String nationality;

    @Column(name = "PLAYER_BDAY")
    private LocalDate birthday;

    @Column(name = "PLAYER_DATE_OF_ADMISSION")
    private LocalDate dateOfAdmission;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;


    public Player() {

    }
}
