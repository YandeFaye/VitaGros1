<%@ include file= "common/header.jspf" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<br><br>
<div class="container">

<form:form modelAttribute="visits" method="post">

<div class="row">
    <div class="col-sm-4">

    <form:hidden path="id"/>
    <form:errors path="date"/><br><br>
	<form:label path="date">Date</form:label>
	<form:input  path="date" type="text"/>
	</div>
	
	 <div class="col-sm-4">
	<form:errors path="description"/><br><br>
	<form:label path="description">Description</form:label>
	<form:input path="description" type="text"/>
	</div>
	
	 
	
	 <div class="col-sm-4">
	<input class="sub1" type="submit">
	</div>
	
	</div>

</form:form>
</div>

<%@ include file= "common/footer.jspf" %>


