package com.dq.springboot_recruit.mapper;

import com.dq.springboot_recruit.entity.ResumeInfo;

/**

*/
public interface IResumeInfoMapper {
	//显示简历信息
	ResumeInfo finds(ResumeInfo resumeInfo);
	//创建简历
	int add(ResumeInfo resumeInfo);
	//修改简历
	int updata(ResumeInfo resumeInfo);
	
	//查重简历电话和邮箱
	ResumeInfo check(ResumeInfo resumeInfo);
}
