package com.fangxin.cesuan.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <pre>
 * 初始化信息表实体类
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
@Entity
@Table(name = "init")
public class Init implements Serializable {
    @Id
    private String recordId; //唯一标识
    @Column(name = "customer_ip")
    private String customerIp; //客户ip
    @Column(name = "customer_address")
    private String customerAddress; //客户地址
    @Column(name = "create_time")
    private Timestamp createTime; //创建时间
    @Column(name = "update_at")
    private Timestamp updateAt; //更新时间
    @Column(name = "is_delete")
    private Short idDelete; //是否删除 1 删除 2 正常

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
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
