package gr.hua.dit.controller;
import java.sql.SQLException;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.hibernate.*;
import gr.hua.dit.testdb.TestDb;

public class HomeController {
	Student st = new Student();
	Users u = new Users();
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws InstantiationException {
		TestDb.init();
		model.addAttribute("welcome to erasmus system!!" );
		return "home";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		String msg;
		msg = "Welocome!";
		model.addAttribute("msg", msg);
		return "login";
	}
	@RequestMapping(value = "/successLogin", method = RequestMethod.GET)
	public String successLogin(@RequestParam("user") String user, @RequestParam("pwd") String pwd, Model model) throws SQLException {
		String msg=null;
		if((user!=null && pwd!=null )||(user!="" && pwd!="")){
			u = TestDb.Login(user, pwd);
			if(st.getId() == 0){
				msg="The user not found!";
				return "login";
			}else{ 
				msg="Login successful!";
			}
		}else{
			msg="Username or password is null or empty.";
			return "login";
		}	
		System.out.println(msg);
		model.addAttribute("msg", msg);
		return "successlogin";
	}
	
	@RequestMapping(value = "/homeAdmin")
	public String homeAdmin(){
		return "homeAdmin";	
	}
	
	
	
	
	
	
}
