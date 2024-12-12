package com.dq.springboot_recruit.mapper;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;

/**

*/
public interface IForgetPwdMapper {
	//查询是否有求职者账号信息
	JoberInfo joberCheckforgetPwd(JoberInfo joberInfo);
	//查询是否有企业账号信息
	CompanyInfo companyCheckforgetPwd(CompanyInfo companyInfo);
	
	int joberUpdatePwd(JoberInfo joberInfo);
	
	int companyUpdatePwd(CompanyInfo companyInfo);

}
