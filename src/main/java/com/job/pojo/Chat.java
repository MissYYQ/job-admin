package com.job.pojo;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Chat {

    private Integer id;

    private Integer studentId;

    private Integer companyId;

    private Integer jobId;

    private String message;

    private Integer sender;

    private Company company;

    private Job job;

    private Student student;

}