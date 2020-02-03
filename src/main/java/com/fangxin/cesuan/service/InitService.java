package com.fangxin.cesuan.service;


import com.fangxin.cesuan.dao.InitDao;
import com.fangxin.cesuan.pojo.Init;
import com.fangxin.cesuan.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre>
 * 初始化信息表service
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
@Service
public class InitService {
    @Autowired
    private InitDao initDao;
    @Autowired
    private IdWorker idWorker;

    /*添加*/
    public void add(Init init) {
        //设置RecordId
        init.setRecordId(String.valueOf(idWorker.nextId()));
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        init.setCreateTime(Timestamp.valueOf(date));
        init.setUpdateAt(Timestamp.valueOf(date));
        init.setIdDelete((short) 2);
        initDao.save(init);
    }
}
