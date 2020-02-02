package com.fangxin.cesuan.param;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <pre>
 * 订单记录表 查询参数对象
 * </pre>
 *
 * @author geekidea
 * @date 2020-01-26
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class LeaveInfoQueryParam extends OrderQueryParam {
    private static final long serialVersionUID = 1L;
}
