package com.fangxin.cesuan.service;


import com.fangxin.cesuan.dao.ChineseLearningRateDao;
import com.fangxin.cesuan.pojo.ChineseLearningRate;
import com.fangxin.cesuan.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre>
 * 国学打分表service
 * </pre>
 *
 * @author chengyz
 * @since 2020-02-02
 */
@Service
public class ChineseLearningRateService {

    @Autowired
    private ChineseLearningRateDao chineseLearningRateDao;
    @Autowired
    private IdWorker idWorker;

    /*添加*/
    public void add(ChineseLearningRate chineseLearningRate){
//        chineseLearningRate.setId(1L);
        //设置RecordId
        chineseLearningRate.setRecordId(String.valueOf(idWorker.nextId()));
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        chineseLearningRate.setCreateTime(Timestamp.valueOf(date));
        chineseLearningRate.setUpdateAt(Timestamp.valueOf(date));
        chineseLearningRate.setIdDelete((short) 2);
        chineseLearningRateDao.save(chineseLearningRate);
    }


}
