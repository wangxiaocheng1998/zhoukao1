/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: ZhiwuController.java 
 * @Prject: zhoukao1
 * @Package: com.wxc.controller 
 * @Description: TODO
 * @author: wxc   
 * @date: 2019年8月6日 上午8:48:08 
 * @version: V1.0   
 */
package com.wxc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxc.entity.Type;
import com.wxc.entity.Zhiwu;
import com.wxc.service.ZhiwuService;

/** 
 * @ClassName: ZhiwuController 
 * @Description: TODO
 * @author: wxc
 * @date: 2019年8月6日 上午8:48:08  
 */
@Controller
public class ZhiwuController {
	@Resource
	private ZhiwuService service;
	
	@RequestMapping("list")
	public String getlist(HttpServletRequest request,@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="3")Integer rows,Zhiwu zhiwu) {
		int total = service.count(zhiwu);
		int pages = total%rows==0?total/rows:total/rows+1;
		List<Zhiwu> list = service.getlist((page-1)*rows, rows, zhiwu);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("pages", pages);
		request.setAttribute("zhiwu", zhiwu);
		return "list";
	}
	@RequestMapping("toadd")
	public String toadd() {
		return "add";
	}
	@RequestMapping("gettype")
	@ResponseBody
	public List gettype() {
		List<Type> list = service.gettype();
		return list;
	}
	@RequestMapping("add")
	@ResponseBody
	public boolean add(Zhiwu zhiwu) {
		return service.add(zhiwu)>0;
	}
	@RequestMapping("toupdate")
	public String toupdate(Integer zid,Model model) {
		Zhiwu zhiwu = service.getzhiwu(zid);
		model.addAttribute("zhiwu", zhiwu);
		return "update";
	}
	@RequestMapping("tolook")
	public String tolook(Integer zid,Model model) {
		Zhiwu zhiwu = service.getzhiwu(zid);
		model.addAttribute("zhiwu", zhiwu);
		return "look";
	}
	@RequestMapping("update")
	@ResponseBody
	public boolean update(Zhiwu zhiwu) {
		return service.update(zhiwu);
	}
	@RequestMapping("del")
	@ResponseBody
	public boolean del(Integer zid) {
		return service.del(zid)>0;
	}
	@RequestMapping("delete")
	@ResponseBody
	public boolean delete(@RequestParam("zid")Integer[] zid) {
		return service.delete(zid)>0;
		
	}
}
