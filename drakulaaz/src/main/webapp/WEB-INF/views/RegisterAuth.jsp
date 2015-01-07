<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
 
 
 
        <div class="body">
            
 
            <p>Tiles 3 integration with Spring Framework.</p>
            <p>Uses Tiles 3.0.3 and springframework 3.2.7.</P>


  

 
<center>  
  
<div style="color: teal;font-size: 30px">Being Java Guys | Registration Form</div>  
  
  
 
<c:url var="userAuthRegistration" value="saveAuthUser.html"/>  
<form:form id="registerForm2" modelAttribute="AuthorizedUserRole,AuthorizedUser" method="post" action="${userAuthRegistration}">  
<table width="400px" height="150px">  
<tr>  
<td><form:label path="username">User Name</form:label></td>  
<td><form:input  path="username"/></td>  
</tr>  
<tr>  
<td><form:label path="password">password</form:label></td>  
<td><form:input  path="password"/></td>  
</tr>  
<tr>  
<td><form:label path="enabled">enabled</form:label></td>  
<td><form:input  path="enabled"/></td>  
</tr>  
<tr>  
<td><form:label path="userrole">user role</form:label></td>  
<td><form:input  path="userrole"/></td>  
</tr>

  
<tr><td></td><td>  
<input type="submit" value="Register" />  
</td></tr>  
</table>  
</form:form>  
  
  
<a href="userAuthList.html" >Click Here to see User List</a>  
</center>  






        </div>
 
 
 
    </tiles:putAttribute>
</tiles:insertDefinition>  