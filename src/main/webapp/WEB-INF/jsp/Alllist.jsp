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


     <h2 style=" text-align: center; ">Country <h2>
  <input type="text" id="myInput" placeholder="Search for Country Name .."  >
  <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" 
  class="bi bi-search" viewBox="0 0 16 16"
      onclick='ser();'
  >
   <style>
   svg:hover path { 
    fill: blue;
}
    </style>
  <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
</svg> 
  &nbsp;&nbsp;
 <input type="button" class="btn btn-primary " value="Show All" onclick='myfunction();'>
 <br>    <br> 
  <table id="displaytable" class="table table-striped" style="display:none"  cellpadding="1" cellspacing="0" >
  
   <thead>
    <tr>

     <th scope="row">Country Name</th>


    </tr>
   </thead>
   <tbody>
    <c:forEach items="${Alllist}" var="country" >
     <tr>
      <td>${country.countryName}&nbsp;&nbsp; <td class="badge bg-primary rounded-pill">${country.countryId}</td></td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
 </div>
     <script>
     function myfunction()
{
    if (document.getElementById("displaytable").style.display === "none")
       {
        document.getElementById("displaytable").style.display="block";
        }
    else
        document.getElementById("displaytable").style.display="none";
}
     </script>
     
        <script>
function ser() {
  document.getElementById("displaytable").style.display="block";
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();

  table = document.getElementById("displaytable");
   
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue =  td.innerText;
  
      if (txtValue.toUpperCase().startsWith(filter)) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>

<hr>
<h2 style=" text-align: center; ">search from id  Region<h2>
  
 <form action ="getRegion">
 <lable>Region ID :<lable>
 <input id="region_id"    name="region_id" >
  <button class="btn btn-primary" type='submit'>get From Id Region</button>
  </form>
  
  <hr>
<h2 style=" text-align: center; ">search from id  Country<h2>
  
 <form action ="getCountry">
 <lable>Country ID :<lable>
 <input id="country_id"    name="country_id" >
  <button class="btn btn-primary" type='submit'>get From Id Country</button>
  </form>
  
  <hr>
  <h2 style=" text-align: center; ">ADD New Country<h2>
  
 <form action ="Add">
  <lable>Country ID :<lable> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
 <input id="country_id"    name="country_id" >&nbsp;&nbsp; 
  <lable>Country Name :<lable>
  <input id="country_name"    name="country_name" ><br><br>
   <lable>Region Name :<lable>&nbsp&nbsp
   <select  id='region_id' name="region_id">
    <c:forEach items="${Alllist}" var="country" >
     
       <option value=${country.region.getRegionId()}>${country.region.getRegionName()}</option>
       </c:forEach>
   <select>
  <button class="btn btn-primary" type='submit' onclick="Fun()">Add New Country</button>
  </form>
  <script>function Fun() { alert("Country added successfully"); }</script>
 </div>
</body>
</html>