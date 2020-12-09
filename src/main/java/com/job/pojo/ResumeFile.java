package com.job.pojo;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class ResumeFile {

    private Integer id;

    private String name;

    private String path;

    private Integer userId;

}