package com.GameUserAdmin.action;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/user")
@Action("/login")
@ResultPath(value="/")
@Result(name="success",location="login.jsp")
public class LoginAction extends ActionSupport{
	public String execute() {
	    return SUCCESS;
	}
} 