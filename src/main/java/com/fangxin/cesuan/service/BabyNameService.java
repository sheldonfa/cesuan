package com.fangxin.cesuan.service;

import com.fangxin.cesuan.dao.BabyNameDao;
import com.fangxin.cesuan.dao.BabyNameDao;
import com.fangxin.cesuan.pojo.BabyName;
import com.fangxin.cesuan.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre>
 * 宝宝起名表service
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
@Service
public class BabyNameService {
    @Autowired
    private BabyNameDao babyNameDao;
    @Autowired
    private IdWorker idWorker;

    /*添加*/
    public void add(BabyName babyName) {
        //判断姓氏不为空则调用
        if ("".equals(babyName.getCustomerLastName()) && babyName.getCustomerLastName() != null) {
            //设置RecordId
            babyName.setRecordId(String.valueOf(idWorker.nextId()));
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
            babyName.setCreateTime(Timestamp.valueOf(date));
            babyName.setUpdateAt(Timestamp.valueOf(date));
            babyName.setIdDelete((short) 2);
            babyNameDao.save(babyName);
        }
    }
}
