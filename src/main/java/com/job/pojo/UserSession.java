package com.job.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserSession {
    private String session_key;
    private String openid;
}
