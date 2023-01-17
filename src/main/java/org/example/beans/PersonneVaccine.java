package org.example.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class PersonneVaccine{
    private  int dep;
    private  String jour;
    private int n_rappel;
    private  int n_rappel1;
    private  int n_rappel2;
    private  int n_rappel3;
    private  int n_cum_dose1;
    private int n_cum_complet;
    private int n_cum_rappel;
    private int couv_dose1;
    private int couv_complet;
    private int couv_rappel;


}
