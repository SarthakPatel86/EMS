package com.ems.amz.entity;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

	private String eid;
	private String mid;
	private String hid;
	private String ename;
	private String desgn;
	private Address add;//one to one
	private double sal;
	private Account acc;//one to one
	private double leaves;
	private boolean ismgr;
	private boolean ishr;
	private String dp;
	private Date doj;
	private List<Project> prj;//many to many
	private boolean isactive;
	private String email;
	private List<Long> phon;//one to many
	private String role;
	private String gender;
	private Date dor;
	private String adhno;
	
	
}
