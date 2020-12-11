package com.job.pojo;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Job {

    private Integer id;

    private String name;

    private String salary;

    private String city;

    private String experience;

    private String degree;

    private String claim;

    private String duty;

    private String keywords;

    private String industry;

    private Integer kind;

    private Date deadline;

    private Integer companyId;

    private Integer pageviews;

    private Company company;

    private CollectionJob collectionjob;

    private Delivery delivery;

}