<%@ include file= "common/header.jspf" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<br><br>
<div class="container">

<form:form modelAttribute="owners" method="post">

<div class="row">
    <div class="col-sm-4">

    <form:hidden path="id"/>
    <form:errors path="firstName"/><br><br>
	<form:label path="firstName">FirstName</form:label>
	<form:input  path="firstName" type="text"/>
	</div>
	
	 <div class="col-sm-4">
	<form:errors path="lastName"/><br><br>
	<form:label path="lastName">LastName</form:label>
	<form:input path="lastName" type="text"/>
	</div>
	
	 <div class="col-sm-4">
	<form:errors path="address"/><br><br>
	<form:label path="address">Address</form:label>
	<form:input path="address" type="text"/>
	</div>
	
	 <div class="col-sm-4">
	<form:errors path="city"/><br><br>
	<form:label path="city">City</form:label><br>
	<form:input path="city" type="text"/>
	</div>
	
	 <div class="col-sm-4">
	<form:errors path="telephone"/><br><br>
	<form:label path="telephone">Telephone</form:label>
	<form:input path="telephone" type="text"/>
	</div>
	
	
	
	 <div class="col-sm-4">
	<input class="sub1" type="submit">
	</div>
	
	</div>

</form:form>
</div>





<br><br>
<%@ include file= "common/footer.jspf" %>

