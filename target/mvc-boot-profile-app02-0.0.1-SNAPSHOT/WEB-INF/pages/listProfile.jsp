<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
    <c:when test="${!empty listProfiles}">
        <h1 style="color: #bf42ff">Profile Details</h1>
        <table border="1" width="100%" height="35%" style="font-family: Calibri;text-align: center;box-sizing: content-box" bgcolor="#da70d6">
            <tr style="font-size: x-large" bgcolor="#8a2be2"><th>profile_id</th><th>profile_name</th><th>email</th><th>followers</th><th>friends</th></tr>
            <c:forEach var="dto" items="${listProfiles}">
                <tr bgcolor="#f0ffff" style="font-size: x-large" >
                    <td>${dto.profileId}</td>
                    <td>${dto.profileName}</td>
                    <td>${dto.email}</td>
                    <td>${dto.followers}</td>
                    <td>${dto.friends}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
</c:choose>
