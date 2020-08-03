package com.qsf.currency.entity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name ="tb_person_info")
@Data
public class PersonInfo {
    //会员id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    //会员昵称
    private String name;
    //电话
    private String phone;
    //密保问题
    private String securityQuestion;
    //答案
    private String encryptedAnswers;
    //开户人姓名
    private String accountName;
    //开户银行
    private String depositBank;
    //卡号
    private String cardNumber;
    //支行
    private String subBranch;
    //会员状态
    private Integer enableStatus;
    //推荐人id
    private Integer referrerId;
    //推荐人昵称（数据库无字段）
    //推荐人绝对代数
    private Integer referrerLevel;
    //推荐人绝对路径
    private String referrerPath;
    //接点人id
    private Integer contactId;
    //接点人姓名（数据库无字段）
    //接点人结对层数
    private Integer contactLevel;
    //接点人绝对路径
    private String contactPath;
    //所处的位置（左，右）
    private Integer threeplace;
    //报单币
    private Double bill;
    //奖金币
    private Double bonus;
    //用户身份（1，会员，2，管理员）
    private Integer userType;
    //注册时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //激活时间
    private Date activationTime;
}
