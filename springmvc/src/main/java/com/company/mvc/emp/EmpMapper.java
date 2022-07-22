package com.company.mvc.emp;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
	
	public EmpVO getEmp(EmpVO vo);
	//public Map<String, Object> getEmp(EmpVO vo);
	
	public List<EmpVO> getEmpList(EmpVO vo);
	public List<EmpVO> getEmpByDept(String[] dept);
	int InsertEmp(EmpVO vo);
	int UpdateEmp(EmpVO vo);
	int deleteEmp(EmpVO vo);
	
	public List<EmpVO> getEmpReqList(EmpReqVO vo);

}
