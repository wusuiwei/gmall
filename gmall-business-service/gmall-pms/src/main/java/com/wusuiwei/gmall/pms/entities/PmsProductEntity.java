package com.wusuiwei.gmall.pms.entities;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;

@Entity
@Data
@Table(name = "pms_product")
@FieldNameConstants
public class PmsProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




}
