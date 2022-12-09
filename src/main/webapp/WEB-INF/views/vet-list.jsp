<%@ include file= "common/header.jspf" %>



<body style="background-color:white;">
<br><br>
<table class="table text-light ">
  <thead>
    <tr class="bg-secondary">
      <th scope="col">Name</th>
      <th scope="col"> Specialty</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${vets}" var="vet">
    <tr>
      <th scope="row">${vet.firstName} ${vet.lastName}</th>
      <td>${vet.specialties.name}</td>
    </tr>
    </c:forEach>
    </tbody>
    </table>
    </body>
    
 
 
 
 
 
 
 
<%@ include file= "common/footer.jspf" %>