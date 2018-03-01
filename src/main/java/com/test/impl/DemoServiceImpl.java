/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: DemoServiceImpl
 * Author:   kcy
 * Date:     2018/2/24 14:47
 * Description: asd
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.test.impl;

import com.test.dao.DemoDao;
import com.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * demo service implement
 *
 * @author kcy
 * @create 2018/2/24
 * @since 1.0.0
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private DemoDao demoDao;

    @Override
    public Map queryInfoById(String id) {
        return demoDao.queryById(id);
    }
}