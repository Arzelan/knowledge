package com.java456.entity;

import java.util.Date;

/**
 * 
 * �����û� ��ʾ�˵���˼·���˵�����ǰ̨֮ǰ Ӧ�ù���һ�ߡ�
 * �õ��û���treeMenusIdsȻ�����һ�£�
 */
public class User {
	private Integer id;
	private String name;//�ʺ�
	private String password;//����
	private Date createDateTime;
	
	private String menuIds;
	private String remark;//��ע
	private String trueName;//��ʵ����
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getMenuIds() {
		return menuIds;
	}
	public void setMenuIds(String menuIds) {
		this.menuIds = menuIds;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	
	
}