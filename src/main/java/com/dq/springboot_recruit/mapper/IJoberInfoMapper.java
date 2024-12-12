package com.dq.springboot_recruit.mapper;

import com.dq.springboot_recruit.entity.JoberInfo;

/**

*/
public interface IJoberInfoMapper {
	//查找显示求职者信息
	JoberInfo finds(JoberInfo joberInfo);
	//修改密码
	int updatePwd(JoberInfo joberInfo);

}
