<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<%@ page session="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>




<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>  
<head>  
<title>User Page | www.beingjavaguys.com</title>  
</head>  
<body>  
<c:url value="/j_spring_security_logout" var="logoutUrl" />  
 <center>  
    
   
   
  
  <h2>User | You are now logged in</h2>  
  
<sec:authorize access="hasRole('ROLE_ADMIN')">
         This session will be visible to an admin only.<br/>
         You are an Administrator.<br/>
        
         <li>
            <spring:url value="/admin" var="adminUrl" htmlEscape="true"/>
            <a href="${adminUrl}">AdminMainPage</a>
        </li>
        </sec:authorize>
        


  
  
  <h3><a href="${logoutUrl}">Logout</a></h3>  
 </center>  
</body>  
</html>