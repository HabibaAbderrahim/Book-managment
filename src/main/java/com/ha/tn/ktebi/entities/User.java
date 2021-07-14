package com.ha.tn.ktebi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class User extends Person {


    @OneToMany(mappedBy = "userid" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<Comment> commentList;
}
