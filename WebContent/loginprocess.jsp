<%@page import="gr.hua.dit.bean.LoginDao"%>  
<%@page import="gr.hua.dit.hibernate.Users"%>
<jsp:useBean id="obj" class="gr.hua.dit.bean.LoginBean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
boolean status=LoginDao.validate(obj);  
if(status){  
out.println("You are successfully logged in");  
session.setAttribute("session","TRUE");
}  
else  
{  
out.print("Sorry, username or password error");  
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>  
