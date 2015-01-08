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
  
  
  
<c:if test="${!empty duser}">  
<table border="1" bgcolor="black" width="600px">  
<tr style="background-color: teal;color: white;text-align: center;" height="40px">  
<td>User Id</td>  
<td>First Name</td>  
<td>Last Name</td>  
<td>Gender</td>  
<td>email</td>  
</tr>  
<c:forEach items="${duser}" var="duser">  
<tr style="background-color:white;color: black;text-align: center;" height="30px" >  
<td><c:out value="${duser.id}"/></td>  
<td><c:out value="${duser.firstName}"/></td>  
<td><c:out value="${duser.lastName}"/></td>  
<td><c:out value="${duser.gender}"/></td>  
<td><c:out value="${duser.email}"/></td>  
</tr>  
</c:forEach>  
</table>  
</c:if>  
  
  
<a href="registerOrLogin.html" >Click Here to add new User</a>  
</center>  





        </div>
 
 
 
    </tiles:putAttribute>
</tiles:insertDefinition>  



