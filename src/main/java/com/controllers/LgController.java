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
import com.DaoPack.NoticeDao;
import com.DaoPack.ParentDao;
import com.DaoPack.StudentDao;

import com.EntityClasses.LG;
import com.EntityClasses.Leave;
import com.EntityClasses.Notice;
import com.EntityClasses.Parent;
import com.EntityClasses.Student;

@Controller
public class LgController {

	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
	//Objects
	
	LG lg = (LG) context.getBean("LG");;
	LGDao lgDao = (LGDao) context.getBean("lGDao");
	
	Student student = (Student) context.getBean("student");
	StudentDao studentDao = (StudentDao) context.getBean("studentDao");
	
	Parent parent = (Parent) context.getBean("parent");
	ParentDao parentDao = (ParentDao) context.getBean("parentDao");
	
	LeaveDao leaveDao = (LeaveDao) context.getBean("leaveDao");
	Leave leave = (Leave) context.getBean("leave");
	
	Notice notice = (Notice) context.getBean("notice");
	NoticeDao noticeDao = (NoticeDao) context.getBean("noticeDao");
	
	
	@RequestMapping("/")
	public String loginPage(){
		
		return "login";
	}
	
	@RequestMapping(path = "/adminLoginCheck", method = RequestMethod.POST)
	public String afterAdminLogin(Model model,HttpServletRequest request) {
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    String admin = request.getParameter("admin");

	    if (admin != null && admin.equals("admin")) {
	        if ("admin@gmail.com".equals(email) && "admin".equals(password)) {
	            return "adminDashboard";
	        } else {
	            return "error";
	        }
	    }

	    String student1 = request.getParameter("student");

	    if (student1 != null && student1.equals("student")) {
	        // Ensure studentDao is not null before using it
	        if (studentDao != null) {
	            student = studentDao.viewOneStudent(Integer.parseInt(email));

	            if (student != null && Integer.parseInt(email) == student.getPRN() && password.equals(student.getStuPass())) {
	            	String stuName = student.getStuName();
	            	model.addAttribute("stuNameKey", stuName);
	            	
	            	return "studentDashboard";
	            } else {
	                return "error";
	            }
	        } else {
	            // Handle the case where studentDao is null
	            return "error";
	        }
	    }

	    String lg1 = request.getParameter("lg");
	    if (lg1 != null && lg1.equals("lg")) {
	        // Ensure lgDao is not null before using it
	        if (lgDao != null) {
	            lg = lgDao.viewOneLg(Integer.parseInt(email));

	            if (lg != null && Integer.parseInt(email) == lg.getLgId() && password.equals(lg.getLgPassword())) 
	            {
	            	String LgName = lg.getLgName();
	            	model.addAttribute("lgNameKey", LgName);
	                return "LGDashboard";
	            } 
	            else
	            {
	                return "error";
	            }
	        } else {
	            // Handle the case where lgDao is null
	            return "error";
	        }
	    }

	    return "error";
	}

	@RequestMapping("/LGDashboard")
	public String LGDashboard(){
		
		return "LGDashboard";
	}
	
	@RequestMapping("/LGcompleteProfile")
	public String LGcompleteProfile(){
		
		return "LGcompleteProfile";
	}
	
	@RequestMapping(path="/ToAddLG",method = RequestMethod.POST)
	public String ToAddLG(HttpServletRequest request)
	{
		 int lgId = Integer.parseInt(request.getParameter("lgId"));
		 String lgName = request.getParameter("lgName");
		 String lgEmail = request.getParameter("lgEmail");
		 String lgPassword = request.getParameter("lgPassword");
	     String lgQualification = request.getParameter("lgQualification");
	     String lgYear = request.getParameter("lgYear");
		 String lgDiv = request.getParameter("lgDiv");
		 String lgPRNFrom = request.getParameter("lgPRNFrom");
	     String lgPRNTo = request.getParameter("lgPRNTo");
	     
	     
	     
	     lg.setLgId(lgId);
	     lg.setLgName(lgName);
	     lg.setLgEmail(lgEmail);
	     lg.setLgPassword(lgPassword);
	     lg.setLgQualification(lgQualification);
	     lg.setLgYear(lgYear);
	     lg.setLgDiv(lgDiv);
	     lg.setLgPRNFrom(lgPRNFrom);
	     lg.setLgPRNTo(lgPRNTo);
	     
	   
	    int res = lgDao.addNewLg(lg);
	    if (res!=0) 
	    {
	    	return "adminDashboard";
	    }
	    else
	    {
	    	return "error";
	    }
	}
	
	
	
	@RequestMapping("/LGupdate")
	public String LGupdate(){
		
		return "LGupdate";
	}
	@RequestMapping(path="/ToUpdateLG",method = RequestMethod.POST)
	public String ToUpdateLG(Model model,HttpServletRequest request)
	{
	     lg = lgDao.viewOneLg(lg.getLgId());
		 int lgId = lg.getLgId();
		 System.out.println(lgId);
		 String lgName = request.getParameter("lgName");
		 String lgEmail = request.getParameter("lgEmail");
		 String lgPassword = request.getParameter("lgPassword");
	     String lgQualification = request.getParameter("lgQualification");
	     
	     LG lgObj=   lgDao.viewOneLg(lgId);
	     
	     lg.setLgId(lgId);
	     lg.setLgName(lgName);
	     lg.setLgEmail(lgEmail);
	     lg.setLgPassword(lgPassword);
	     lg.setLgQualification(lgQualification);
	     lg.setLgYear(lgObj.getLgYear());
	     lg.setLgDiv(lgObj.getLgDiv());
	     lg.setLgPRNFrom(lgObj.getLgPRNFrom());
	     lg.setLgPRNTo(lgObj.getLgPRNTo());
	     
	     String LgName = lg.getLgName();
     	 model.addAttribute("lgNameKey", LgName);
	      lgDao.updateLg(lg);
	      return "LGDashboard";
	 
	}

	
	
	@RequestMapping("/LGview")
	public String openView(Model model)
	{
	    
		int lgID = lg.getLgId();
		lg = lgDao.viewOneLg(lgID);
		model.addAttribute("lgkey", lg);
		return "LGview";
		
		
	}
	
	
	@RequestMapping("/viewAllLG")
	public String viewAllLG(Model model){
		
		try {
			
			List<LG> LGlist = lgDao.viewAllLg();
			
			model.addAttribute("list", LGlist);
			
			System.out.println("view Page is Running...");
			
			return "viewAllLG";
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return "error";
		}
		
		
	}

	@RequestMapping(path="/deleteLg/{lgId}",method=RequestMethod.GET)
	public RedirectView deleteLg(@PathVariable("lgId")int lgId, HttpServletRequest request)
	{
		lgDao.deleteLg(lgId);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewAllLG");
		return redirectView;
		
	}
	
	@RequestMapping(path="/LGremoveStudent/{PRN}",method=RequestMethod.GET)
	public RedirectView deleteStudent(@PathVariable("PRN")int PRN, HttpServletRequest request)
	{
		studentDao.deleteStudent(PRN);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewMyStudent");
		return redirectView;
		
	}

	
	@RequestMapping("/LGapproveLeave")
	public String LGapproveLeave(Model model){
		
      try {
			
			List<Leave> leavelist = leaveDao.viewAllLeave();
			model.addAttribute("leaveListKey", leavelist);
			return "LGapproveLeave";
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return "error";
		}
		
	}

	@RequestMapping(path="/ApproveLeaveMaping/{PRN}",method=RequestMethod.GET)
	public RedirectView ApproveLeaveMaping(@PathVariable("PRN")int PRN, HttpServletRequest request)
	{
		leave = leaveDao.viewLeave(PRN);
		String curruntLeaveStatus = leave.getLeaveStatus();
		if(curruntLeaveStatus.equals("pending") || curruntLeaveStatus.equals("disapproved"))
		{
			leave.setLeaveStatus("approved");
			leaveDao.updateLeave(leave);
		}	
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/LGapproveLeave");
		return redirectView;
	}
	
	
	@RequestMapping(path="/DisApproveLeaveMaping/{PRN}",method=RequestMethod.GET)
	public RedirectView DisApproveLeaveMaping(@PathVariable("PRN")int PRN, HttpServletRequest request)
	{
		leave = leaveDao.viewLeave(PRN);
		String curruntLeaveStatus = leave.getLeaveStatus();
		if(curruntLeaveStatus.equals("pending") )
		{
			leave.setLeaveStatus("disapproved");
			leaveDao.updateLeave(leave);
		}
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/LGapproveLeave");
		return redirectView;
	}
	
	@RequestMapping("/addNotice")
	public String addNotice(){
		
		return "addNotice";
	}
	
	@RequestMapping(path="/afterAddNotice",method = RequestMethod.POST)
	public String afterAddNotice(@ModelAttribute Notice notice)
	{
		try {
			
			noticeDao.addNotice(notice);			
			return "adminDashboard";	
				
			} 
		    catch (Exception e) {
				System.out.println("Failed to add..");
				e.printStackTrace();
				return "error";
			}
	
	}
	
	
	
	
	@RequestMapping("/viewNotice")
	public String viewNotice(Model model){
		
		try {
			
			List<Notice> noticeList = noticeDao.viewAllNotice();
			
			model.addAttribute("list", noticeList);
			
			return "viewNotice";
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return "error";
		}
	
	}
	
	
	@RequestMapping("/adminViewNotice")
	public String adminViewNotice(Model model){
		
		try {
			
			List<Notice> noticeList = noticeDao.viewAllNotice();
			
			model.addAttribute("listkey", noticeList);
			String LgName = lg.getLgName();
        	model.addAttribute("lgNameKey", LgName);
			return "adminViewNotice";
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return "error";
		}
	
	}
	
	@RequestMapping(path="/deleteNotice/{noticeId}",method=RequestMethod.GET)
	public RedirectView deleteNotice(@PathVariable("noticeId")int noticeId, HttpServletRequest request)
	{
		noticeDao.deleteNotice(noticeId);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/adminViewNotice");
		return redirectView;
		
	}

	
	@RequestMapping("/viewOneStudent")
	public String viewOneStudent(Model model){
		String LgName = lg.getLgName();
    	model.addAttribute("lgNameKey", LgName);
		return "viewOneStudent";
	}
	
	
	@RequestMapping("/viewMyStudent")
	public String viewMyStudent(Model model){
		
		int lgId = lg.getLgId();
		LG lg1 = lgDao.viewOneLg(lgId);
		String lgName = lg1.getLgName();
		List<Student> allStudentData = studentDao.viewAllStudent();
		model.addAttribute("key1",allStudentData);
		model.addAttribute("key2", lgName);
		String LgName = lg.getLgName();
    	 model.addAttribute("lgNameKey", LgName);
		return "viewMyStudent";
	}
	
	@RequestMapping("/studentViewSelf")
	public String studentViewSelf(Model model){
		
		int PRN = student.getPRN();
		student = studentDao.viewOneStudent(PRN);
		model.addAttribute("studentkey2", student);
		return "studentViewSelf";
		
	}
	
}
