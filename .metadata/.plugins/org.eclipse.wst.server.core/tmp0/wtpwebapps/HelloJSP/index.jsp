<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
<p>こんにちは！</p>
<% out.println(new java.util.Date()); %>
<%!
int add(int a, int b){
	return a+b;
}
%>

<p>1+2=<%=add(1,2) %></p>
<p>1+2=<%=add(3,4) %></p>

<%! int countA=0; %>
<%
	int countB=0;
countA++;
countB++;
%>
<p>宣言による変数 dountA= <%=countA %></p>
<p>スクリプトレットによる変数 countB=<%=countB %></p>
<p><% out.println(Math.random()); %></p>
<p><%=Math.random() %></p>
<p>お名前を入力してください。</p>
<form method="post" action="greeting-out.jsp">
<input type="text" name="user">
<input type="submit" value="確定">
</form>








</body>
</html>