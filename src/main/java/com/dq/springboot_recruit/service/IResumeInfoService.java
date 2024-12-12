package com.dq.springboot_recruit.service;

import java.util.Map;

import com.dq.springboot_recruit.entity.ResumeInfo;

/**

*/
public interface IResumeInfoService {
	//显示简历信息
	Map<String, Object> finds(ResumeInfo resumeInfo);
	//创建简历
	int add(ResumeInfo resumeInfo);
	//修改简历
	int updata(ResumeInfo resumeInfo);
	//查重简历电话和邮箱
	ResumeInfo check(ResumeInfo resumeInfo);
}
