/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: ZhiwuServiceimpl.java 
 * @Prject: zhoukao1
 * @Package: com.wxc.service 
 * @Description: TODO
 * @author: wxc   
 * @date: 2019年8月6日 上午8:47:22 
 * @version: V1.0   
 */
package com.wxc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wxc.entity.Type;
import com.wxc.entity.Zhiwu;
import com.wxc.mapper.ZhiwuMapper;

/** 
 * @ClassName: ZhiwuServiceimpl 
 * @Description: TODO
 * @author: wxc
 * @date: 2019年8月6日 上午8:47:22  
 */
@Service
public class ZhiwuServiceimpl implements ZhiwuService{
	@Resource
	private ZhiwuMapper mapper;

	/* (non Javadoc) 
	 * @Title: getlist
	 * @Description: TODO
	 * @return 
	 * @see com.wxc.service.ZhiwuService#getlist() 
	 */
	@Override
	public List<Zhiwu> getlist(Integer page,Integer rows,Zhiwu zhiwu) {
		// TODO Auto-generated method stub
		return mapper.getlist(page, rows, zhiwu);
	}

	/* (non Javadoc) 
	 * @Title: count
	 * @Description: TODO
	 * @return 
	 * @see com.wxc.service.ZhiwuService#count() 
	 */
	@Override
	public int count(Zhiwu zhiwu) {
		// TODO Auto-generated method stub
		return mapper.count(zhiwu);
	}

	/* (non Javadoc) 
	 * @Title: gettype
	 * @Description: TODO
	 * @return 
	 * @see com.wxc.service.ZhiwuService#gettype() 
	 */
	@Override
	public List<Type> gettype() {
		// TODO Auto-generated method stub
		return mapper.gettype();
	}

	/* (non Javadoc) 
	 * @Title: add
	 * @Description: TODO
	 * @param zhiwu
	 * @return 
	 * @see com.wxc.service.ZhiwuService#add(com.wxc.entity.Zhiwu) 
	 */
	@Override
	public int add(Zhiwu zhiwu) {
		// TODO Auto-generated method stub
		return mapper.add(zhiwu);
	}

	/* (non Javadoc) 
	 * @Title: getzhiwu
	 * @Description: TODO
	 * @param zid
	 * @return 
	 * @see com.wxc.service.ZhiwuService#getzhiwu(java.lang.Integer) 
	 */
	@Override
	public Zhiwu getzhiwu(Integer zid) {
		// TODO Auto-generated method stub
		return mapper.getzhiwu(zid);
	}

	/* (non Javadoc) 
	 * @Title: update
	 * @Description: TODO
	 * @param zhiwu 
	 * @see com.wxc.service.ZhiwuService#update(com.wxc.entity.Zhiwu) 
	 */
	@Override
	public boolean update(Zhiwu zhiwu) {
		// TODO Auto-generated method stub
		try {
			mapper.update(zhiwu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/* (non Javadoc) 
	 * @Title: del
	 * @Description: TODO
	 * @param zid
	 * @return 
	 * @see com.wxc.service.ZhiwuService#del(java.lang.Integer) 
	 */
	@Override
	public int del(Integer zid) {
		// TODO Auto-generated method stub
		return mapper.del(zid);
	}

	/* (non Javadoc) 
	 * @Title: delete
	 * @Description: TODO
	 * @param zid
	 * @return 
	 * @see com.wxc.service.ZhiwuService#delete(java.lang.Integer[]) 
	 */
	@Override
	public int delete(Integer[] zid) {
		// TODO Auto-generated method stub
		return mapper.delete(zid);
	}

}
