package com.fubol.futbol.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;

@Entity
@Builder
@AllArgsConstructor
@Table(name="PERFORMANCE")
@NamedQuery(name="PERFORMANCE.findAll", query="SELECT i FROM Performance i")
public class Performance implements Serializable {

    @Id
    @SequenceGenerator(name="PERFORMANCE_ID_GENERATOR", allocationSize = 1, sequenceName="PERFORMANCE_SEQ")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERFORMANCE_ID_GENERATOR")
    @Column(name="PERFORMANCE_ID")
    private long performanceID;


    public Performance() {

    }
}
