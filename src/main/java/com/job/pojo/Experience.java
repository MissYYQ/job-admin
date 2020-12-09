package com.job.pojo;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Experience implements Serializable {

    private Integer id;

    private String name;

    private String startdate;

    private String enddate;

    private String position;

    private String description;

    private Integer userId;

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", startdate:'" + startdate + '\'' +
                ", enddate:'" + enddate + '\'' +
                ", position:'" + position + '\'' +
                ", description:'" + description + '\'' +
                ", userId:" + userId +
                '}';
    }
}