package com.job.pojo;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Company {

    private Integer id;

    private String name;

    private String email;

    private String logourl;

    private String size;

    private String financingstage;

    private String region;

    private String detailedaddress;

    private String introduction;

    private String worktime;

    private String welfare;

    private String industry;

    private Integer userId;

    private Integer pageviews;

    private Integer status;
}