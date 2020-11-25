package com.job.pojo;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Integer id;

    private String gender;

    private String nickname;

    private String city;

    private String province;

    private String country;

    private String avatarurl;

    private String openid;

}