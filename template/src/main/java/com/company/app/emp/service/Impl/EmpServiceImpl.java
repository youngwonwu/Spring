package com.company.app.emp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.emp.mapper.EmpMapper;
import com.company.app.emp.service.EmpReqVO;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

@Service	// 빈 등록
public class EmpServiceImpl implements EmpService{
	
	@Autowired EmpMapper mapper;

	@Override
	public EmpVO getEmp(EmpVO vo) {
		return mapper.getEmp(vo);
	}

	@Override
	public List<EmpVO> getEmpList(EmpVO vo) {
		return mapper.getEmpList(vo);
	}

	@Override
	public List<EmpVO> getEmpByDept(String[] dept) {
		return mapper.getEmpByDept(dept);
	}

	@Override
	public int InsertEmp(EmpVO vo) {
		return mapper.InsertEmp(vo);
	}

	@Override
	public int UpdateEmp(EmpVO vo) {
		return mapper.UpdateEmp(vo);
	}

	@Override
	public int deleteEmp(EmpVO vo) {
		return mapper.deleteEmp(vo);
	}

	@Override
	public List<EmpVO> getEmpReqList(EmpReqVO vo) {
		return mapper.getEmpReqList(vo);
	}

}
