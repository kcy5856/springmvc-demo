/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Demo
 * Author:   kcy
 * Date:     2018/2/24 14:44
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.test.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * 〈test〉
 *
 * @author kcy
 * @create 2018/2/24
 * @since 1.0.0
 */
public interface DemoDao {

    Map queryById(@Param("id") String id);

}