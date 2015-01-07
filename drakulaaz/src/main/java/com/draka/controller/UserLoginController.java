package com.draka.controller;  
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
import com.draka.service.UserAuthorizedService;
import com.draka.service.UserService;  
import com.draka.service.ClientService;
import com.draka.service.ClientRoleService;

@SessionAttributes("userObj") 
@Controller  
public class UserLoginController {  
  
	@Autowired
	 private UserService userService;  
	
	@Autowired
	 private ClientService ClientService;
	
	@Autowired
	 private ClientRoleService ClientRoleService;
	
	@Autowired
	 private UserAuthorizedService userAuthorizedService;  
  
   @RequestMapping("/register")  
    public ModelAndView getRegisterForm(@ModelAttribute("user") User user,  
            BindingResult result) {  
  
        ArrayList<String> gender = new ArrayList<String>();  
        gender.add("Male");  
        gender.add("Female");  
  
        ArrayList<String> city = new ArrayList<String>();  
        city.add("Delhi");  
        city.add("Kolkata");  
        city.add("Chennai");  
        city.add("Bangalore");  
  
        Map<String, Object> model = new HashMap<String, Object>();  
        model.put("gender", gender);  
        model.put("city", city);  
  
        System.out.println("Register Form");  
        return new ModelAndView("Register", "model", model);  
  
    }  
  
  
    @RequestMapping("/saveUser")  
    public ModelAndView saveUserData(@ModelAttribute("user") User user,  
            BindingResult result) {  
  
        userService.addUser(user);  
        System.out.println("Save User Data");  
        return new ModelAndView("redirect:/userList.html");  
  
    }  
  
  
    @RequestMapping("/userList")  
    public ModelAndView getUserList() {  
  
        Map<String, Object> model = new HashMap<String, Object>();  
        model.put("user", userService.getUser());  
        return new ModelAndView("UserDetails", model); 
  
    }  
    
    @RequestMapping("/registerAuth")  
    public ModelAndView getAuthRegisterForm(@ModelAttribute("AuthorizedUser") AuthorizedUser AuthrizedUser,@ModelAttribute("AuthorizedUserRole") AuthorizedUserRole AuthrizedUserRole,  
            BindingResult result) {  
  
         
        System.out.println("Register Form");  
        return new ModelAndView("RegisterAuth");  
  
    }  
  
  
    @RequestMapping("/saveAuthUser")  
    public ModelAndView saveAuthUserData(@ModelAttribute("AuthorizedUser") AuthorizedUser Authorizeduser,  
            BindingResult result) {  
  
        userAuthorizedService.saveAuthorizedUser(Authorizeduser);  
        System.out.println("Save User Data");  
        return new ModelAndView("redirect:/userAuthList.html");  
  
    }  
  
  
    @RequestMapping("/userAuthList")  
    public ModelAndView getAuthUserList() {  
  
        Map<String, Object> model = new HashMap<String, Object>();  
        model.put("user", userService.getUser());  
        return new ModelAndView("UserDetails", model);  
  
    } 
    
    @RequestMapping("/registerClient")  
    public ModelAndView getClientRegisterForm(@ModelAttribute("newSurvey") Client Client,  
            BindingResult result) {  
  
         
        System.out.println("Register Form");  
        return new ModelAndView("newClient");  
  
    }  
  
  
    @RequestMapping("/saveClient")  
    public ModelAndView saveClientUserData(@ModelAttribute("newSurvey") Client Client1,  
            BindingResult result) {  
  
        ClientService.saveClient(Client1);  
        System.out.println("Save User Data");  
        
        //List <String> ClientRoles1 = Client.getClientRole();  
        String ClientRoles1 = Client1.getClientRole();
        String Username1=Client1.getUsername();
        ClientRole clientrole1 = new ClientRole();
        clientrole1.setUserrole(ClientRoles1);
        clientrole1.setClient(Client1);
        clientrole1.setUsername(Username1);
        ClientRoleService.saveClientRole(clientrole1);
        //ModelAndView modelAndView = new ModelAndView();

        //modelAndView.addObject("personObj", Client1);
        Map<String, Object> model = new HashMap<String, Object>();  
        model.put("personObj", Client1);  
        model.put("client", ClientService.getClient());
        //ClientRole cli = null;  
        //if(ClientRoles1 != null){  
        // for(String ClientRole : ClientRoles1){  
         // cli = new ClientRole();  
          //cli.setUserrole(ClientRole);  
          //cli.setClient(Client);
          //ClientRoleService.saveClientRole(cli);  
            
           //}  
          //}  
          // yaha pe 1 username ki value uthani h aur user authlist me use krni h.. but mere khyal se model attribute ye kaaam kr deta h.. chalo session bnana seekhte h yaha se
        return new ModelAndView("MyDetails",model);  
  
    }  
  
  
    @RequestMapping("/ClientList")  
    public ModelAndView getClientList() {  
  
        Map<String, Object> model = new HashMap<String, Object>();  
        model.put("Client", ClientService.getClient());  
        return new ModelAndView("MyDetails", model);  
  
    }
    
    
    

    @RequestMapping("/MyDetails")  
    public ModelAndView getMyDetailsList() {  
  
        Map<String, Object> model = new HashMap<String, Object>();  
        model.put("client", ClientService.getClient());  
        return new ModelAndView("MyDetails",model);
        }  
    
 }  