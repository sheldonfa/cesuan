package com.fangxin.cesuan.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * 订单记录表 查询结果对象
 * </pre>
 *
 * @author geekidea
 * @date 2020-01-26
 */
@Data
@Accessors(chain = true)
public class LeaveInfoQueryVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String recordId;

    private String entryCode;

    private String customerName;

    private Boolean customerSex;

    private Date createTime;

    private Date updateTime;

    private Boolean isDelete;

}