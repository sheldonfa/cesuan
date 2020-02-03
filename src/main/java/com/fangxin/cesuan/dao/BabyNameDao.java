package com.fangxin.cesuan.dao;

import com.fangxin.cesuan.pojo.BabyName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <pre>
 * 宝宝起名表Dao
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
public interface BabyNameDao extends JpaRepository<BabyName,String>,JpaSpecificationExecutor<BabyName> {
}
