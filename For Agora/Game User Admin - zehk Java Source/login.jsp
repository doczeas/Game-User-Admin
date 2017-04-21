<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<h1>Game User Admin</h1>
<s:form action="result">
	<s:textfield name="userName" label="User Name"/>
	<s:password name="pwd" label="Password"/>
	<s:submit/>
</s:form>
</body>
</html> 