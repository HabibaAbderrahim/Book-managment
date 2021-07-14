package com.ha.tn.ktebi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
//single , Table per class , joined
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")
//@DiscriminatorValue("PERSON")

@Entity
public class Person {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String name ;
    private String surname ;
    private String mail ;
    private String password ;
    private LocalDate birthDay;
    @Lob
    private byte[] picture ;
    //user admin
    //private String role ;


}
