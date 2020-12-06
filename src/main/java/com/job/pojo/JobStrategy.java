package com.job.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class JobStrategy {

    private Integer id;

    private String title;

    private String content;

    private Integer kind;

}