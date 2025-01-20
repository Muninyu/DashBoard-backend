package com.example.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "cda")
public class CDA {
    @Id
    private Date CDADate;
    @Column(name = "cda01")
    private Integer CDA01;
    @Column(name = "cda02")
    private Integer CDA02;
    @Column(name = "cda03")
    private Integer CDA03;
    @Column(name = "cda_air_consume")
    private Integer CDAAirConsume;
    @Column(name = "cda_air_consume_unit")
    private Float CDAAirConsumeUnit;

    @Override
    public String toString() {
        return "CDA{" +
                "CDADate=" + CDADate +
                ", CDA01=" + CDA01 +
                ", CDA02=" + CDA02 +
                ", CDA03=" + CDA03 +
                ", CDAAirConsume=" + CDAAirConsume +
                ", CDAAirConsumeUnit=" + CDAAirConsumeUnit +
                '}';
    }

    public Date getCDADate() {
        return CDADate;
    }

    public void setCDADate(Date CDADate) {
        this.CDADate = CDADate;
    }

    public Integer getCDA01() {
        return CDA01;
    }

    public void setCDA01(Integer CDA01) {
        this.CDA01 = CDA01;
    }

    public Integer getCDA02() {
        return CDA02;
    }

    public void setCDA02(Integer CDA02) {
        this.CDA02 = CDA02;
    }

    public Integer getCDA03() {
        return CDA03;
    }

    public void setCDA03(Integer CDA03) {
        this.CDA03 = CDA03;
    }

    public Integer getCDAAirConsume() {
        return CDAAirConsume;
    }

    public void setCDAAirConsume(Integer CDAAirConsume) {
        this.CDAAirConsume = CDAAirConsume;
    }

    public Float getCDAAirConsumeUnit() {
        return CDAAirConsumeUnit;
    }

    public void setCDAAirConsumeUnit(Float CDAAirConsumeUnit) {
        this.CDAAirConsumeUnit = CDAAirConsumeUnit;
    }
}
