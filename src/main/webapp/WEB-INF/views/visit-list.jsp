<%@ include file= "common/header.jspf" %>
<br><br>
<table class="table text-light ">
  <thead>
    <tr class="bg-secondary">
      <th scope="col">DATE</th>
      <th scope="col"> DESCRIPTION</th>
      
     <th scope="col"> Update</th>
      
	 
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${visits}" var="visit">
     <tr>
      <th scope="row">${visit.date}</th>
      <td>${visit.description}</td>
      
      <td><a class="a" style="font-size:15px;text-transform:Lowercase; background-color: green ;border:solid green; color: white
       ;" href="/update-pet?id=${visit.id}">Update</a></td>
       
    </tr>
    
    </c:forEach>
  </tbody>
</table>


<div class="container1">
<a class="a1" style="font-size:30px;;color: white
       ;" href="/add-visit">Add VISITS</a>
       
       </div>

<%@ include file= "common/footer.jspf" %>