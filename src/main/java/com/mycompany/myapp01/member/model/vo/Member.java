package com.mycompany.myapp01.member.model.vo;

public class Member {
	private static final long serialVersionUID = 1111L;
	private String id;
	private String pwd;
	private String name;
	
	public Member() {}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}