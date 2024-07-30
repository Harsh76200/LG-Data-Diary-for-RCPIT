package com.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.DaoPack.LGDao;
import com.DaoPack.LeaveDao;
import com.DaoPack.ParentDao;
import com.DaoPack.StudentDao;
import com.EntityClasses.LG;
import com.EntityClasses.Leave;
import com.EntityClasses.Parent;
import com.EntityClasses.Student;

@Controller
public class StudentController {

ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
	//Objects
	
	LG lg = (LG) context.getBean("LG");;
	LGDao lgDao = (LGDao) context.getBean("lGDao");
	
	Student student = (Student) context.getBean("student");
	StudentDao studentDao = (StudentDao) context.getBean("studentDao");
	
	Parent parent = (Parent) context.getBean("parent");
	ParentDao parentDao = (ParentDao) context.getBean("parentDao");
	
	Leave leave = (Leave) context.getBean("leave");
	LeaveDao leaveDao = (LeaveDao) context.getBean("leaveDao");
	
	
	
	@RequestMapping("/viewAllStudent")
	public String viewAllStudent(Model model){
		
		try {
			
			List<Student> Studlist = studentDao.viewAllStudent();
			
			model.addAttribute("list", Studlist);
			
			System.out.println("view Page is Running...");
			
			return "viewAllStudent";
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return "error";
		}
		
	}
	
	
	@RequestMapping("/StudentAddParentDetails")
	public String StudentAddParentDetails(){
		
		return "StudentAddParentDetails";
	}
	
	@RequestMapping(path="/afterAddParent",method = RequestMethod.POST)
	public String afterAddParent(HttpServletRequest request)
	{
	  int parentMob = Integer.parseInt(request.getParameter("parentMob"));
	  String parentAddress = request.getParameter("parentAddress");
	  int parentPincode = Integer.parseInt(request.getParameter("parentPincode"));
	  String parentCity = request.getParameter("parentCity");
	  String parentEmail = request.getParameter("parentEmail");
	  String parentType = request.getParameter("parentType");
	  
	  parent.setParentMob(parentMob);
	  parent.setParentAddress(parentAddress);
	  parent.setParentCity(parentCity);
	  parent.setParentEmail(parentEmail);
	  parent.setParentPincode(parentPincode);
	  parent.setParentType(parentType);
	  
	 int res =  parentDao.addParent(parent);
	 if(res!=0){
		 return "studentDashboard";
	 }
	 else{
		 return "error";
	 }
		
	}
	
	@RequestMapping("/StudentAddDetails")
	public String StudentAddDetails(){
		
		return "StudentAddDetails";
	}
	
	@RequestMapping(path="/afterAddStudent",method = RequestMethod.POST)
	public String afterAddStudent(@ModelAttribute Student student)
	{
      try {
			
    	  studentDao.addNewStudent(student);
		  return "studentDashboard";
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to add..");
			e.printStackTrace();
			return "error";
		}

		 
	}
	

	
	@RequestMapping("/LGupdateStudent")
	public String LGupdateStudent(){
		
		return "LGupdateStudent";
	}
	
	@RequestMapping(path="/ToUpdateStudent",method = RequestMethod.POST)
	public String ToUpdateStudent(Model model,HttpServletRequest request)
	{
		int PRN =  Integer.parseInt(request.getParameter("PRN"));
		String stuAge = request.getParameter("stuAge");
		String stuCgpa = request.getParameter("stuCgpa");
		String stuDiv = request.getParameter("stuDiv");
		String stuYear = request.getParameter("stuYear");
		String stuAddress = request.getParameter("stuAddress");
		String stuPass = request.getParameter("stuPass");
		String stuMob = request.getParameter("stuMob");
		
		Student stuData = (Student) studentDao.viewOneStudent(PRN);
		student.setPRN(PRN);
		student.setStuAge(stuAge);
		student.setStuCgpa(stuCgpa);
		student.setStuDiv(stuDiv);
		student.setStuYear(stuYear);
		student.setStuCurrAddress(stuAddress);
		student.setStuPass(stuPass);
		student.setStuMob(stuMob);
		student.setStuAadhar(stuData.getStuAadhar());
		student.setStuAddmissionYear(stuData.getStuAddmissionYear());
		student.setStuBranch(stuData.getStuBranch());
		student.setStuDob(stuData.getStuDob());
		student.setStuEmail(stuData.getStuEmail());
		student.setStuGender(stuData.getStuGender());
		student.setStuHostel(stuData.getStuHostel());
		student.setStuLg(stuData.getStuLg());
		student.setStuName(stuData.getStuName());
		student.setStuParentMob(stuData.getStuParentMob());
		student.setStuReligion(stuData.getStuReligion());
		student.setStuPerAddress(stuData.getStuPerAddress());
		
		studentDao.updateStudent(student);
		return "LGDashboard";
		
	}
	
	
	
	
	@RequestMapping(path="/StudentviewForm",method = RequestMethod.POST)
	public String StudentviewForm(Model model,HttpServletRequest request)
	{
		int PRN = Integer.parseInt(request.getParameter("PRN"));
		Student studentObj = studentDao.viewOneStudent(PRN);
		model.addAttribute("studentkey", studentObj);
		return "viewOneStudent";
	
	}
	
	
	@RequestMapping("/addLeave")
	public String addLeave(){
		
		return "addLeave";
	}
	
	@RequestMapping(path="/afterLeaveSubmit",method = RequestMethod.POST)
	public String afterLeaveSubmit(@ModelAttribute Leave leave)
	{
		try {
			
			leaveDao.addNewLeave(leave);			
			return "studentDashboard";	
				
			} 
		    catch (Exception e) {
				System.out.println("Failed to add..");
				e.printStackTrace();
				return "error";
			}
	
	}
	
	@RequestMapping("/viewLeave")
	public String viewLeave(){
		
		return "viewLeave";
	}
	
	
	@RequestMapping(path="/afterViewLeave",method = RequestMethod.POST)
	public String afterViewLeave(Model model,HttpServletRequest request)
	{
		int PRN = Integer.parseInt(request.getParameter("PRN"));
		Leave leave = leaveDao.viewLeave(PRN);
		model.addAttribute("studentkey", leave);
		return "viewLeave";
	}
	
	
	@RequestMapping(path="/deleteLeave/{PRN}",method=RequestMethod.GET)
	public RedirectView deleteLeave(@PathVariable("PRN")int PRN, HttpServletRequest request)
	{
		leaveDao.deleteLeave(PRN);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewLeave");
		return redirectView;
		
	}
}
