package com.dq.springboot_recruit.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.DeliveryInfo;
import com.dq.springboot_recruit.entity.ResumeInfo;
import com.dq.springboot_recruit.mapper.IDeliveryInfoMapper;
import com.dq.springboot_recruit.service.IDeliveryInfoService;

/**

*/
@Service
public class DeliveryInfoServiceImpl implements IDeliveryInfoService{
	@Autowired
	private IDeliveryInfoMapper deliveryInfoMapper;

	//查找简历编号
	@Override
	public Map<String, Object> findr(ResumeInfo resumeInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		ResumeInfo ri = deliveryInfoMapper.findr(resumeInfo);
		if(ri != null) {
			map.put("rno", ri);
		}else {
			System.out.println("这个用户还暂无简历信息...");
			map.put("rno", 0);
		}
		return map;
	}

	//查找企业名称
	@Override
	public Map<String, Object> findc(CompanyInfo companyInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		CompanyInfo ci = deliveryInfoMapper.findc(companyInfo);
		if(ci != null) {
			map.put("companyname", ci);
		}else {
			System.out.println("这个企业还暂无信息...");
			map.put("companyname", 0);
		}
		return map;
	}

	//投递简历
	@Override
	public Map<String, Object> add(DeliveryInfo deliveryInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		int di = deliveryInfoMapper.add(deliveryInfo);
		if(di > 0) {
			map.put("delivery", di);
		}else {
			System.out.println("投递简历失败...");
			map.put("delivery", 0);
		}
		return map;
	}

	//查找投递记录信息
	@Override
	public Map<String, Object> findd(DeliveryInfo deliveryInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<DeliveryInfo> di = deliveryInfoMapper.findd(deliveryInfo);
		if(di != null) {
			map.put("DeliveryRecord", di);
		}else {
			System.out.println("这个用户还暂无投递信息...");
			map.put("DeliveryRecord", 0);
		}
		return map;
	}

	//查找收到的简历
	@Override
	public Map<String, Object> findReceived(DeliveryInfo deliveryInfo) throws ParseException {
		Map<String, Object> map = new HashMap<String, Object>();
		List<DeliveryInfo> di2 = deliveryInfoMapper.findReceived(deliveryInfo);
		for(DeliveryInfo d : di2) {
			String ddate = d.getDdate();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date dd = dateFormat.parse(ddate);
			Calendar rightNow = Calendar.getInstance();
			rightNow.setTime(dd);
			rightNow.add(Calendar.MONTH, 1);
			Date dt1 = rightNow.getTime();
			Date datanow = new Date();
//			String formatnow = dateFormat.format(data);
			if(dt1.before(datanow)){
				System.out.println(dt1+"在"+datanow+"之前，已过期");
				deliveryInfoMapper.updateState(d);
			}
		}
		List<DeliveryInfo> di = deliveryInfoMapper.findReceived(deliveryInfo);
		if(di != null) {
			map.put("received", di);
		}else {
			System.out.println("暂时没有收到的简历...");
			map.put("received", 0);
		}
		return map;
	}

	//通过简历
	@Override
	public Map<String, Object> approved(DeliveryInfo deliveryInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		int di = deliveryInfoMapper.approved(deliveryInfo);
		if(di > 0) {
			map.put("approved", di);
		}else {
			System.out.println("投递批准失败...");
			map.put("approved", 0);
		}
		return map;
	}

	//拒绝简历
	@Override
	public Map<String, Object> refuse(DeliveryInfo deliveryInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		int di = deliveryInfoMapper.refuse(deliveryInfo);
		if(di > 0) {
			map.put("refuse", di);
		}else {
			System.out.println("拒绝简历失败...");
			map.put("refuse", 0);
		}
		return map;
	}

	@Override
	public Map<String, Object> over(DeliveryInfo deliveryInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		int di = deliveryInfoMapper.over(deliveryInfo);
		if(di > 0) {
			map.put("refuse", di);
		}else {
			System.out.println("结束失败...");
			map.put("refuse", 0);
		}
		return map;
	}

	@Override
	public Map<String, Object> addsroce(DeliveryInfo deliveryInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		int di = deliveryInfoMapper.addsroce(deliveryInfo);
		if(di > 0) {
			map.put("refuse", di);
		}else {
			System.out.println("打分失败...");
			map.put("refuse", 0);
		}
		return map;
	}
}
