package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.ApplyDAO;
import kr.ac.hansung.model.ApplyCourse;

@Service
public class ApplyService {
	
	private ApplyDAO applyDao;
	
	@Autowired
	public void setApplyDAO(ApplyDAO applyDao) {
		this.applyDao = applyDao;
	}
	
	public List<ApplyCourse> getCurrent(){
		return applyDao.getCourse();
	}
	
	public boolean insert(ApplyCourse apply){
		return applyDao.insert(apply);
	}
	
	
}
