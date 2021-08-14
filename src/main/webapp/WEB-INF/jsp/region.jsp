<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>country List</title>
 <link href="../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
 <script src="../webjars/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
 <script src="../webjars/jquery/3.0.0/js/jquery.min.js" ></script>

</head>

<body>
<br>
 <h2 style=" text-align: center; ">Region </h2><br><br>
 
  <table id="displaytable" class="table table-striped"  cellpadding="1" cellspacing="0" >
   <thead>
    <tr>
     <th scope="row">Region ID</th>
     <th scope="row">Region Name</th>
    </tr>
   </thead>
   <tbody>
     <tr>
      <td>${region.regionId}&nbsp;&nbsp;</td>
       <td>${region.regionName}&nbsp;&nbsp;</td>
     </tr>
  
   </tbody>
  </table>

 </div>
</body>
</html>