package com.dq.springboot_recruit.service;

import java.text.ParseException;
import java.util.Map;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.DeliveryInfo;
import com.dq.springboot_recruit.entity.ResumeInfo;

/**

*/
public interface IDeliveryInfoService {
	//查找简历编号
	Map<String, Object> findr(ResumeInfo resumeInfo);

	//查找企业名称
	Map<String, Object> findc(CompanyInfo companyInfo);

	//投递简历
	Map<String, Object> add(DeliveryInfo deliveryInfo);

	//查找投递记录信息
	Map<String, Object> findd(DeliveryInfo deliveryInfo);

	//查找收到的简历
	Map<String, Object> findReceived(DeliveryInfo deliveryInfo) throws ParseException;
	//批准简历
	Map<String, Object> approved(DeliveryInfo deliveryInfo);
	//拒绝简历
	Map<String, Object> refuse(DeliveryInfo deliveryInfo);

	// 结束兼职
	Map<String, Object> over(DeliveryInfo deliveryInfo);

	Map<String, Object> addsroce(DeliveryInfo deliveryInfo);
}
