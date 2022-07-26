package com.company.app.emp.mapper;

import java.util.List;
import java.util.Map;

import com.company.app.emp.service.EmpReqVO;
import com.company.app.emp.service.EmpVO;

public interface EmpMapper {
	
	public EmpVO getEmp(EmpVO vo);
	public List<EmpVO> getEmpList(EmpVO vo);
	public List<EmpVO> getEmpByDept(String[] dept);
	int InsertEmp(EmpVO vo);
	int UpdateEmp(EmpVO vo);
	int deleteEmp(EmpVO vo);
	
	public List<EmpVO> getEmpReqList(EmpReqVO vo);

}
