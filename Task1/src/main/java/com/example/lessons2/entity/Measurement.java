package com.example.lessons2.entity;

import com.example.lessons2.entity.template.Abs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = true)
@Data

@Entity
public class Measurement extends Abs {

}
