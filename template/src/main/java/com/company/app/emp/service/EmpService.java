package com.company.app.emp.service;

import java.util.List;

public interface EmpService {
	
	public EmpVO getEmp(EmpVO vo);
	public List<EmpVO> getEmpList(EmpVO vo);
	public List<EmpVO> getEmpByDept(String[] dept);
	int InsertEmp(EmpVO vo);
	int UpdateEmp(EmpVO vo);
	int deleteEmp(EmpVO vo);
	
	public List<EmpVO> getEmpReqList(EmpReqVO vo);

}
