package com.fu.gmall.user.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UmsMember implements Serializable {
    private static final long serialVersionUID = -8831274796965808831L;

    @Id
    //主键返回
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberLevelId;

    private String username;

    private String password;

    private String nickname;

    private String phone;

    private Integer status;

    private Date createTime;

    private String icon;

    private Integer gender;

    private Date birthday;

    private String city;

    private String job;

    private String personalizedSignature;

    private Integer sourceType;

    private Integer integration;

    private Integer growth;

    private Integer luckeyCount;

    private Integer historyIntegration;

}