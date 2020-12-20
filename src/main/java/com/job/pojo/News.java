package com.job.pojo;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class News {

    private Integer id;

    private Integer studentId;

    private Integer companyId;

    private Integer jobId;

    private String lastmessage;

    private String lastdate;

    private Company company;

    private Job job;

    private Student student;

}