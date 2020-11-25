package com.job.util;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BaseData {
    private int sta;  //成功状态 1  失败状态 0
    private String msg;  //信息
    private Object obj;  //结果集

//    @Override
//    public String toString() {
//        return "BaseData{" +
//                "sta=" + sta +
//                ", msg='" + msg + '\'' +
//                '}';
//    }
}
