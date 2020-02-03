package com.fangxin.cesuan.dao;
import com.fangxin.cesuan.pojo.Init;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <pre>
 * 初始化信息表Dao
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
public interface InitDao extends JpaRepository<Init, String>, JpaSpecificationExecutor<Init> {
}
