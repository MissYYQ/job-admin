package com.job.pojo;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Seminar {
    private Integer id;

    private String school;

    private String location;

    private String date;

    private String time;

    private Integer companyId;

    private Company company;

}