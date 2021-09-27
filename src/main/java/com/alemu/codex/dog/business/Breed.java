package com.alemu.codex.dog.business;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Breed {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String breed;
    @ElementCollection
    private List<String> sub_breed;



}
