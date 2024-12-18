package com.dq.springboot_recruit.mapper;

import java.util.List;
import java.util.Map;

import com.dq.springboot_recruit.entity.AdminInfo;
import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.entity.PositionsInfo;

/**

*/
public interface IAdminInfoInfoMapper {
	//查找显示管理员信息
	List<AdminInfo> finds();

	//添加管理员信息
	int add(AdminInfo adminInfo);
	
	//重置管理员密码
	int resetPwd(AdminInfo af);

	//修改管理员信息
	int update(AdminInfo adminInfo);

	//删除管理员信息
	int delete(AdminInfo adminInfo);

	//查找显示求职者信息
	List<JoberInfo> findJobersInfo();

	//查找显示企业信息
	List<CompanyInfo> findCompany();

	//修改求职者信息
	int updateJober(JoberInfo joberInfo);

	//删除求职者信息
	int deleteJober(JoberInfo joberInfo);

	//修改企业信息
	int updateCompany(CompanyInfo companyInfo);

	//删除企业信息
	int deleteCompany(CompanyInfo companyInfo);
	
	//分页查找职位信息findPositionsByPage	
	List<Map<String,Object>> findPositionsByPage(int pageNo, int pageSize);

	//分页查找职位信息总页数findTotalPositions
	List<PositionsInfo> findTotalPositions();

	//解封企业
	int reCompany(CompanyInfo companyInfo);


}
