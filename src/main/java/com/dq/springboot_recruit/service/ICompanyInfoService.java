package com.dq.springboot_recruit.service;

import java.util.Map;

import com.dq.springboot_recruit.entity.CompanyInfo;

/**

*/
public interface ICompanyInfoService {
	//查找显示企业信息
	Map<String, Object> finds(CompanyInfo companyInfo);
	//修改密码
	int updatePwd(CompanyInfo companyInfo);
	
	//查找企业的职位信息
	Map<String, Object> findAllpositions(CompanyInfo companyInfo);
	
	//分页查询
	Map<String, Object> findBypage(int pageNo, int pageSize, String nickname);

}
