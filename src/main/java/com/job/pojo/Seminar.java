package com.job.pojo;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Seminar {
    private Integer id;

    private String school;

    private String location;

    private Date date;

    private String time;

    private Integer companyId;

    private Company company;

}