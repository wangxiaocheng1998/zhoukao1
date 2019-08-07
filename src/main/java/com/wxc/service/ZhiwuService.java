/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: ZhiwuService.java 
 * @Prject: zhoukao1
 * @Package: com.wxc.service 
 * @Description: TODO
 * @author: wxc   
 * @date: 2019年8月6日 上午8:46:35 
 * @version: V1.0   
 */
package com.wxc.service;

import java.util.List;

import com.wxc.entity.Type;
import com.wxc.entity.Zhiwu;

/** 
 * @ClassName: ZhiwuService 
 * @Description: TODO
 * @author: wxc
 * @date: 2019年8月6日 上午8:46:35  
 */
public interface ZhiwuService {
	List<Zhiwu> getlist(Integer page,Integer rows,Zhiwu zhiwu);
	int count(Zhiwu zhiwu);
	List<Type> gettype();
	int add(Zhiwu zhiwu);
	Zhiwu getzhiwu(Integer zid);
	boolean update(Zhiwu zhiwu);
	int del(Integer zid);
	int delete(Integer[] zid);
}
