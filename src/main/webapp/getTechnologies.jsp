<%@ page language="java"
	contentType="text/html; charset=ISO-8859-1"
  	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<html lang="en">
<head>
</head>
<body>
    <table>
           <tr>
               <th>Sl.No </th>
               <th>Technology Name</th>
               <th>Version</th>
               <th>Release Year</th>
           </tr>
       < c:forEach items="${ add }" var="book" >
           <tr>
           <td>${ book.getId() }</td>
           <td>${ book.getTechnologyName() }</td>
           <td>${ book.getVersion() }</td>
           <td>${ book.getReleaseYear() } </td>
           <td> <a href="update?id=${ book.getId() }">Update</a>
           &nbsp; &nbsp; &nbsp;
           <a href="delete?id=${ book.getId() }">Delete</a>
           </td>
           </tr>
           </c:forEach >
       </table>
</body>
</html>