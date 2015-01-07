<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="menu">
Menu
    <ul>
        <li>
            <spring:url value="/home" var="homeUrl" htmlEscape="true"/>
            <a href="${homeUrl}">Home</a>
        </li>
        <li>
            <spring:url value="/about" var="aboutUrl" htmlEscape="true"/>
            <a href="${aboutUrl}">About</a>
        </li>
        <li>
            <spring:url value="/register" var="registerUrl" htmlEscape="true"/>
            <a href="${registerUrl}">register</a>
        </li>
        <li>
            <spring:url value="/login" var="loginUrl" htmlEscape="true"/>
            <a href="${loginUrl}">Login</a>
            
        </li>
        <li>
            <spring:url value="/MyDetails" var="MyDetailsUrl" htmlEscape="true"/>
            <a href="${MyDetailsUrl}">User Details</a>
            
        </li>
        <li>
            <spring:url value="/MyDetails" var="MyDetailsUrl" htmlEscape="true"/>
            <a href="${MyDetailsUrl}">My Details Url</a>
            
        </li>
    </ul>
</div>