

<%@page import="com.learn.icinbank.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ICIN Bank</title>
        <%@include file="components/common_css_js.jsp" %>
      
     </head>
     <body>
        
             
        <%@include file="components/navbar.jsp" %>
<div style="background-color:#0b7249;color:white;padding:20px;">
    <br><br>
    <center>
    <h1 style=font-size:95px><B>ICIN BANK</B></h1>
    <H2>AT YOUR SERVICE, ALWAYS!</H2></center>
    
    <form action="register.jsp">
      <div class="wrap" style="width: 90%;   position: absolute;   top: 50%;   left: 50%;   transform: translate(-50%, -50%);">
   <div class="search" style="width: 100%;   position: relative;   display: flex;">
       
      <input type="text" class="searchTerm" placeholder="Email Address" style="width: 100%;    border: 3px solid #ffffff;   border-right: none;   padding: 5px;   height: 40px;   border-radius: 5px 0 0 5px;   outline: none;   color: #9DBFAF;">
      <button type="submit" class="searchButton" style="width: 200px;  height: 40px;  border: 1px solid #e57373;   background: #e57373;   text-align: center;   color: #fff;   border-radius: 0 5px 5px 0;   cursor: pointer;   font-size: 20px;">
       &nbsp;&nbsp;&nbsp;&nbsp;   Register &nbsp;&nbsp;&nbsp;&nbsp;
     </button>
     
   </div>
      </div></form>
    <br><br>  <br>   <br>     <br>
</div> 
<div  style="background-color:#ffffff">
       <br><br>  <br>   <br>
       <h2 style="color: #0b2239">
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           ICIN BANK</h2><br><br>
       <div class="clearfix" style="padding-left:80px; padding-right:80px; text-align: justify">
        <img class="indeximg" src="img/bank1.jpg" style="float:right; width:30%" /> 
        ICIN Bank is an Indian private sector bank headquartered in Mumbai, Maharashtra. 
        It sells financial services to <br>large and mid-size companies,
        SMEs and retail businesses. As of 30 June 2016, 30.81% shares are owned <br>by the promoters and the promoter group.<br>
        <br><b>
        <ul>
        <li>Axis Bank wins Best Regional Communication Campaign award at ET Brand Equity Kaleido Awards </li>
        <li>Axis Bank wins ‘Digital Lending with the Private Sector Bank’ award at The ASSOCHAM National <br>E-Summit &amp; Awards Banking &amp; Financial Lending Companies “Digital Financial Services</li>
        <li>Axis Bank wins ‘Best Digital Bank’ award at the Asiamoney Banking Awards for the second <br>consecutive year and in four of the past five years</li><!-- comment -->
        <li>Axis Bank wins 'Best Data Analytics Project' at The Asset Triple A Digital Awards</li><!-- comment -->
       </ul>
            </b>
      </div>
       </div>   
        <%@include file="components/footer.jsp" %>
    </body>
</html>
