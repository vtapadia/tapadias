package com.envy.personal.tapadias.domain;

import com.envy.personal.tapadias.config.LocalDateConverter;
import com.envy.personal.tapadias.config.LocalDateTimeConverter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String firstName;
    public String middleName;
    public String lastName;

    public String previousLastName;

    @Enumerated(EnumType.STRING)
    public Gender gender;

    @Convert(converter = LocalDateTimeConverter.class)
    public LocalDateTime dateOfBirth;
    @Convert(converter = LocalDateConverter.class)
    public LocalDate dateOfMarriage;
    @Convert(converter = LocalDateConverter.class)
    public LocalDate dateOfDeath;

    @ManyToOne
    public Person mother;
    @OneToOne
    public Person spouse;

}
