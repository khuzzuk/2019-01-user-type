package com.example.usertype.model;

import com.example.usertype.common.EnumType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Person {
    @SequenceGenerator(name = "person_seq_gen",
            sequenceName = "person_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq_gen")
    @Id
    private Long id;
    private String firstName;
    private String phoneNumber;
    @Type(type = EnumType.DEF)
    private PhoneType phoneType;
}
