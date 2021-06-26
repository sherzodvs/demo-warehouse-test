package com.example.lessons2.entity;

import com.example.lessons2.entity.template.Abs;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends Abs {

}
