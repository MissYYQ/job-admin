package com.job.pojo;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Delivery {

    private Integer id;

    private Integer jobId;

    private Integer userId;

    private String deliverytime;

    private Boolean status;

}