<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
 
 
 
        <div class="body">
            
 
            <center>  
  
<div style="color: teal;font-size: 30px">Being Java Guys | User Details</div>  
  <p>  
${personObj} 
</p>
  
  
<c:if test="${!empty client}">  
<table border="1" bgcolor="black" width="600px">  
<tr style="background-color: teal;color: white;text-align: center;" height="40px">  
<td>User Id</td>  
<td>First Name</td>  
<td>Last Name</td>  
<td>Gender</td>  
 
</tr>  
<c:forEach items="${client}" var="client">  
<tr style="background-color:white;color: black;text-align: center;" height="30px" >  
 <td><c:out value="${client.username}"/></td>  
<td><c:out value="${client.password}"/></td>  
<td><c:out value="${client.enabled}"/></td>  

 
</tr>  
</c:forEach>  
</table>  
</c:if>  
  
  
<a href="register.html" >Click Here to add new User</a>  
</center>  





        </div>
 
 
 
    </tiles:putAttribute>
</tiles:insertDefinition>  



