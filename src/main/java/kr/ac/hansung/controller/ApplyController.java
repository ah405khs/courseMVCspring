package kr.ac.hansung.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.model.ApplyCourse;
import kr.ac.hansung.service.ApplyService;

@Controller
public class ApplyController {
	
	private ApplyService applyService;
	@Autowired
	public void setCourseService(ApplyService applyService) {
		this.applyService = applyService;
	}
	
	@RequestMapping("/apply_course")
	public String apply(){
		
		return "apply";
	}
	
	@RequestMapping(value="/applynew", method=RequestMethod.POST)
	public String newApply(Model model, HttpServletRequest request){		
		ApplyCourse apply = new ApplyCourse();	
		apply.setCourse_id(request.getParameter("course_id"));
		apply.setCoursename(request.getParameter("coursename"));
		apply.setCredit(Integer.parseInt(request.getParameter("credit")));
		apply.setDivision(request.getParameter("division"));
		apply.setTerm(Integer.parseInt(request.getParameter("term")));
		apply.setYear(Integer.parseInt(request.getParameter("year")));
		applyService.insert(apply);
		List<ApplyCourse> applyCourse = applyService.getCurrent();
		model.addAttribute("applycourse",applyCourse);
		return "applycourse";
	}
	
	@RequestMapping("/apply_check")
	public String showApplyCourse(Model model){
		List<ApplyCourse> applyCourse = applyService.getCurrent();
		model.addAttribute("applycourse",applyCourse);
		return "applycourse";
	}
	
}
