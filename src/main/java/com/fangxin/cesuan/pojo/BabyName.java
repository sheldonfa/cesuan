package com.fangxin.cesuan.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * <pre>
 * 宝宝起名表实体类
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
@Entity
@Table(name = "baby_name")
public class BabyName implements Serializable{
    @Id
    private Long id; //自增主键
    @Column(name = "record_id")
    private String recordId; //唯一标识
    @Column(name="customer_birth_status")
    private Short customerBirthStatus; //出生状态：1-已出生 2-未出生
    @Column(name = "customer_last_name")
    private String customerLastName; //客户姓氏
    @Column(name = "customer_sex")
    private Short customerSex; //客户性别：1-男 2-女 0-未知
    @Column(name = "calendar_type")
    private Short calendarType; //日期类型：0-农历 1-阴历

    private Date birthday; //出生日期

    private Integer hour; //出生时辰
    @Column(name = "create_time")
    private Timestamp createTime; //创建时间
    @Column(name = "update_at")
    private Timestamp updateAt; //更新时间
    @Column(name = "is_delete")
    private Short idDelete; //是否删除 1 删除 2 正常

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Short getCustomerBirthStatus() {
        return customerBirthStatus;
    }

    public void setCustomerBirthStatus(Short customerBirthStatus) {
        this.customerBirthStatus = customerBirthStatus;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public Short getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(Short customerSex) {
        this.customerSex = customerSex;
    }

    public Short getCalendarType() {
        return calendarType;
    }

    public void setCalendarType(Short calendarType) {
        this.calendarType = calendarType;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public Short getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(Short idDelete) {
        this.idDelete = idDelete;
    }
}
