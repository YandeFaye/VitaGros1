<%@ include file= "common/header.jspf" %>

<div class="container" style="height: 100%">
    <form action="/owner-search" class="col-12 col-md-9">
        <fieldset>
            <div class="form-group row">
                <label for="name" style="font-size:20px">Find Owner</label>
                <input type="text" style="width:600px" class="col-md-3 form-control" id="name" name="name" placeholder="first Name, Last Name or Full Name">&nbsp;
                 <button type="submit"style="width:100px" class="btn btn-primary"> <i class="fa fa-search"></i> Find</button>
            </div>
           
        </fieldset>
    </form>
</div><br><br>

<table class="table text-light" style="magin-top:-2000px;">
  <thead>
    <tr class="bg-secondary">
      <th scope="col">Name</th>
      <th scope="col"> Address</th>
      <th scope="col"> City</th>
      <th scope="col">Telephone</th>
      <th scope="col">Pets</th>
     <th scope="col"> Update&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Delete&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Detail</th>
      
	 
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${owners}" var="owner">
    <tr>
      <th scope="row"; class="text-success">${owner.firstName} ${owner.lastName}</th>
      <td>${owner.address}</td>
      <td>${owner.city}</td>
      <td>${owner.telephone}</td>
      <td> 
       <c:forEach items="${owner.pet}" var="pets">
       <c:if test="${owner.pet.iterator().hasNext()}">
       <span><c:out value="${pets.name}"></c:out></span>
       </c:if> 
        </c:forEach>
       </td>
      <td><a class="a" style="font-size:15px;text-transform:Lowercase; background-color: warning;border:solid green; color: white
       ;" href="/update-owner?id=${owner.id}">Update</a>&nbsp;&nbsp;
       <a class="a"style="font-size:15px;text-transform:Lowercase;border:solid red;
        background-color: warning ; color: white ;" href="/delete-owner?id=${owner.id}">Delete</a>&nbsp;&nbsp;
        <a  class="a" style="font-size:15px;text-transform:Lowercase;border:solid blue;
        background-color: warning ; color: white ;" href="/owner-detail?id=${owner.id}">Details</a></td>
    </tr>
    
    </c:forEach>
  </tbody>
</table>
<br><br>
<div>

<a class="b" href="add-owner" style="margin-right:1000px;"  > Add Owners</a>
</div>






<%@ include file= "common/footer.jspf" %>


