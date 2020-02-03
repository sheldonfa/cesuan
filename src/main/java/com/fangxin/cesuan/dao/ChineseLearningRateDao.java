package com.fangxin.cesuan.dao;

import com.fangxin.cesuan.pojo.ChineseLearningRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <pre>
 * 国学打分表Dao
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
public interface ChineseLearningRateDao extends JpaRepository<ChineseLearningRate,String>,JpaSpecificationExecutor<ChineseLearningRate>{
}
