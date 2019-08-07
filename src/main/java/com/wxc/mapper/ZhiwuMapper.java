/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: ZhiwuMapper.java 
 * @Prject: zhoukao1
 * @Package: com.wxc.mapper 
 * @Description: TODO
 * @author: wxc   
 * @date: 2019年8月6日 上午8:44:53 
 * @version: V1.0   
 */
package com.wxc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wxc.entity.Type;
import com.wxc.entity.Zhiwu;

/** 
 * @ClassName: ZhiwuMapper 
 * @Description: TODO
 * @author: wxc
 * @date: 2019年8月6日 上午8:44:53  
 */
public interface ZhiwuMapper {
	List<Zhiwu> getlist(@Param("page")Integer page,@Param("rows")Integer rows,@Param("zhiwu")Zhiwu zhiwu);//查询
	int count(@Param("zhiwu")Zhiwu zhiwu);//计数
	@Select("select * from type")
	List<Type> gettype();//查看类型
	int add(Zhiwu zhiwu);//添加
	Zhiwu getzhiwu(Integer zid);
	void update(Zhiwu zhiwu);//修改
	
	int del(Integer zid);//删除
	int delete(Integer[] zid);
	

}
