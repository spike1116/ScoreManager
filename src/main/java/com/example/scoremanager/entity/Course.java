package com.example.scoremanager.entity;

import lombok.Data;
import java.time.LocalTime;
import java.time.Year;

@Data
public class Course {

    private Integer cId;
    private Integer tId;
    private String cName;
    private Double cCredit;
    private Year cYear;
    private Integer cSemester;
}
