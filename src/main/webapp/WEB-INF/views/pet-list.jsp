<%@ include file= "common/header.jspf" %>
<br><br>
<table class="table text-light ">
  <thead>
    <tr class="bg-secondary">
      <th scope="col">Name</th>
      <th scope="col"> DateOfBirth</th>
      <th scope="col">PetType</th>
      <th scope="col">Visits</th>
      
     <th scope="col"> Update</th>
      
	 
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${pets}" var="pet">
    <tr>
      <th scope="row">${pet.name}</th>
      <td>${pet.dateOfBirth}</td>
      <td>${pet.petType.name}</td>
        <td>${pet.visits.description}</td>
     
      
      <td><a class="a" style="font-size:15px;text-transform:Lowercase; background-color: green ;border:solid green; color: white
       ;" href="/update-pet?id=${pet.id}">Update</a>
       
    </tr>
    
    </c:forEach>
  </tbody>
</table>
<div class="container1">

       </div>








<br><br><br>
<%@ include file= "common/footer.jspf" %>