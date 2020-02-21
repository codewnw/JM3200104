<%@ page isELIgnored="false"%>
<html>
<body>
	<h2>Hello World!</h2>
	<a href="date">Show me Date</a>
	<br>
	<a href="users">All Users</a>
	<br>
	<a href="users/Rohit">Rohit Sharma</a>
	<br>
	<a href="users/search?lastName=Kohli">Kohli</a>
	<br>
	<a href="students">Student Form</a>
	<br>

	<form action="users/search">
		<input type="text" name="lastName" /> <input type="submit">
	</form>

	<hr>

	<h2>Item Controller</h2>
	<ul>
		<li><a href="${pageContext.request.contextPath}/items/1">Get
				Item</a></li>
		<li><a href="${pageContext.request.contextPath}/items/fail">Item
				Fail</a></li>
		<li><a href="${pageContext.request.contextPath}/items/">All
				Items</a></li>
	</ul>
	<hr>
	<h1>Customer Controller (project-like)</h1>
	<ul>
		<li><a href="customers/add">Add Customer</a></li>
		<li><a href="customers/list">List Customers</a></li>
	</ul>
	
	
</body>
</html>
