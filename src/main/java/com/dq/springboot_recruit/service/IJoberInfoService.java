package com.dq.springboot_recruit.service;

import java.util.Map;

import com.dq.springboot_recruit.entity.JoberInfo;

/**

*/
public interface IJoberInfoService {
	//查找显示求职者信息
	Map<String, Object> finds(JoberInfo joberInfo);
	//修改密码
	int updatePwd(JoberInfo joberInfo);

}
