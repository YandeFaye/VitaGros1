<%@ include file= "common/header.jspf" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<br><br>

<div class="container">

<form:form modelAttribute="pets" method="post">

<div class="row">
    <div class="col-sm-4">

    <form:hidden path="id"/>
    
    <form:errors path="name"/><br><br>
	<form:label path="name">Name</form:label>
	<form:input  path="name" type="text"/>
	</div>
	
	 <div class="col-sm-4">
	<form:errors path="dateOfBirth"/><br><br>
	<form:label path="dateOfBirth">DateOfBirth</form:label>
	<form:input path="dateOfBirth" type="text"/>
	</div>
	<div class="col-sm-4">
	<form:errors path="petType"/><br><br>
    <form:label path="petType" for="pet-select">Choose a pet:</form:label>

<form:select path="petType" id="pet-select">
    <option value="">--TypePets--</option>
    <option value="dog">Dog</option>
    <option value="cat">Cat</option>
    <option value="hamster">Hamster</option>
    <option value="parrot">Parrot</option>
    <option value="spider">Spider</option>
    <option value="goldfish">Goldfish</option>
</form:select>
</div>
	
	
	
	 <div class="col-sm-4">
	<input class="sub" type="submit">
	</div>
	
	</div>

</form:form>
</div>



<br><br><br><br><br><br>


<%@ include file= "common/footer.jspf" %>

