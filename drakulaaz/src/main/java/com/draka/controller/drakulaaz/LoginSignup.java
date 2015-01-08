package com.draka.controller.drakulaaz;  
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;
import java.util.Map;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;  

import com.draka.domain.Answer;
import com.draka.domain.AuthorizedUser;
import com.draka.domain.AuthorizedUserRole;
import com.draka.domain.Client;
import com.draka.domain.ClientRole;
import com.draka.domain.Question;
import com.draka.domain.User;  
import com.draka.domain.drakulaaz.Duser;
import com.draka.service.UserAuthorizedService;
import com.draka.service.UserService;  
import com.draka.service.ClientService;
import com.draka.service.ClientRoleService;
import com.draka.service.drakulaaz.DuserService;

@SessionAttributes("userObj") 
@Controller  
public class LoginSignup{  
  
	@Autowired
	 private DuserService duserService;  
	
	
	
	@Autowired
	 private ClientRoleService ClientRoleService;
	
	
  
   @RequestMapping("/registerOrLogin")  
    public ModelAndView getRegisterForm(@ModelAttribute("duser") Duser duser,  
            BindingResult result) {  
  
        ArrayList<String> gender = new ArrayList<String>();  
        gender.add("Male");  
        gender.add("Female");  
  
       
  
        Map<String, Object> model = new HashMap<String, Object>();  
        model.put("gender", gender);  
          
  
        System.out.println("Register Form");  
        return new ModelAndView("drakulaaz/LoginSignupForm", "model", model);  
  
    }  
  
  
    @RequestMapping("/saveDuser")  
    public ModelAndView saveUserData(@ModelAttribute("duser") Duser duser,  
            BindingResult result) {  
  
        duserService.addDuser(duser);  
        System.out.println("Save User Data");  
        return new ModelAndView("redirect:/duserList.html");  
  
    }  
  
  
    @RequestMapping("/duserList")  
    public ModelAndView getUserList() {  
  
        Map<String, Object> model = new HashMap<String, Object>();  
        model.put("duser", duserService.getDuser());  
        return new ModelAndView("drakulaaz/duserDetails", model); 
  
    }  
    
    
    
 }  