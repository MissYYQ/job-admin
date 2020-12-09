package com.job.pojo;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Interview {

    private Integer id;

    private String date;

    private String time;

    private String region;

    private String detailedaddress;

    private Integer userId;

    private Integer jobId;

    private Job job;

    private Company company;

}