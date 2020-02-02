/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fangxin.cesuan.param;

import com.fangxin.cesuan.constant.CommonConstant;
import lombok.Data;

import java.io.Serializable;

/**
 * 查询参数
 *
 * @author geekidea
 * @since 2018-11-08
 */
@Data
public abstract class QueryParam implements Serializable {
    private static final long serialVersionUID = -3263921252635611410L;

    private Integer current = CommonConstant.DEFAULT_PAGE_INDEX;
    private Integer size = CommonConstant.DEFAULT_PAGE_SIZE;
    private String keyword;

    public void setCurrent(Integer current) {
        if (current == null || current <= 0) {
            this.current = CommonConstant.DEFAULT_PAGE_INDEX;
        } else {
            this.current = current;
        }
    }

    public void setSize(Integer size) {
        if (size == null || size <= 0) {
            this.size = CommonConstant.DEFAULT_PAGE_SIZE;
        } else {
            this.size = size;
        }
    }

}
