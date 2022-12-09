
<%@ include file="common/header.jspf"%>

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
</div>


<div class="container">
    <h1 class="display-4" style="color: white">Result</h1>

    <table class="table text-light ">
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
            <tr>
                <th scope="row">${owner.firstName} ${owner.lastName}</th>
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
                <td><a class="a" style="font-size:15px;text-transform:Lowercase; background-color: green ;border:solid green; color: white
       ;" href="/update-owner?id=${owner.id}">Update</a>&nbsp;&nbsp;
                    <a class="a"style="font-size:15px;text-transform:Lowercase;border:solid red;
        background-color: red ; color: white ;" href="/delete-owner?id=${owner.id}">Delete</a>&nbsp;&nbsp;
                    <a  class="a" style="font-size:15px;text-transform:Lowercase;border:solid blue;
        background-color: blue ; color: white ;" href="/owner-detail?id=${owner.id}">Details</a></td>
            </tr>
        </tbody>
    </table>


</div>
<%@ include file="common/footer.jspf"%>
