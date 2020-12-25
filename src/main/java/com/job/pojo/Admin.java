package com.job.pojo;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Admin {

    private Integer id;

    private String username;

    private String password;

    private String avatar;

}