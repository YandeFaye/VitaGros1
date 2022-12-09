<%@ include file= "common/header.jspf" %>


<br><br>
<div class="container">
<table class="table text-light ">
  <thead>
    <tr class="bg-secondary">
      <th scope="col">Name</th>
     <th scope="col"> ${owner.firstName} ${owner.lastName}</th>
     </tr>
     <tr>
      <th scope="col"> Address</th>
        <th scope="col">${owner.address}</th>
      </tr>
      <tr>
      <th scope="col"> City</th>
        <th>${owner.city}</td>
        </tr>
        <tr>
      <th scope="col">Telephone</th>
       <th>${owner.telephone}</th>
      </tr>
      <tr>
     
      </tr>
  </thead>
  
  </table>
  <br><br>
<a href="/update-owner?id=${owner.id}" class="btn1">Edit Owner</a>
<a href="/add-pet?id=${owner.id}" class="btn1">Add New Pets</a>
<br><br><br>
<h5  style="color:white;">Pets and Visit</h5>
<hr style="height:5px;background-color:black;">
<div class="box">

<div class="box1">
 <c:forEach items="${owner.pet}" var="pets">
       <c:if test="${owner.pet.iterator().hasNext()}">

<strong>Name:</strong> &nbsp;&nbsp;<c:out value="${pets.name}"></c:out><br>
<strong>Birth date: &nbsp;&nbsp;</strong><c:out value="${pets.dateOfBirth}"></c:out> <br>
 <strong>Type: &nbsp;&nbsp;</strong><c:out value="${pets.petType.name}"></c:out>
 
     </c:if>
         </c:forEach> 
  </div>
<div class="box2">
<strong>Visit Date:</strong>
<c:out value="${pets.visits.date}"></c:out> &nbsp;&nbsp; 
<strong>Description:</strong><c:out value="${pets.visits.description}"></c:out><br><br>
&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
 <a style="color:green"> Edit Pet</a> &nbsp;&nbsp;&nbsp;&nbsp; <a style="color:green"> Add Vivit</a></p></div>

 
</div>
  <br><br>
  </div>
  
 


 <%@ include file= "common/footer.jspf" %>

