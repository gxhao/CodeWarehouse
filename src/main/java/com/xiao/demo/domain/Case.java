package com.xiao.demo.domain;

import java.util.Date;
import net.sf.json.JSONObject;
public class Case {
	private Integer caseId;
	private String caseName;
	private Date createDate;
	private Date appDate;
	public Integer getCaseId() {
		return caseId;
	}
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	public String getCaseName() {
		return caseName;
	}
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}
	@Override
	public String toString() {
		return "Case [caseId=" + caseId + ", caseName=" + caseName
				+ ", createDate=" + createDate + ", appDate=" + appDate + "]";
	}
	public static void main(String[] args) {
		Case case1 = new Case();
		case1.setCaseName("案件");
		case1.setCreateDate(new Date());
		case1.setAppDate(new Date());
		JSONObject jsonObject = JSONObject.fromObject(case1);
		String json = jsonObject.toString();
		System.out.println(json);
	}
}