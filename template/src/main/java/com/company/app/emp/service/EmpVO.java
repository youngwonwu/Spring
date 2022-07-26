package com.company.app.emp.service;

//import java.sql.Date;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	
//	private String first_name;
//	private String last_name;
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd") // 데이터타입을 바꿔줌, util로 했을때
	private Date hireDate;
	private String jobId;
	private String salary;
	private String departmentId;

}
