<jsp:include page="header.jsp" />

<%
    String numStr = request.getParameter("num");
    if (numStr != null) {
        try {
            int n = Integer.parseInt(numStr);
            int cube = n * n * n;
%>
            <h3>Cube of <%= n %> is <%= cube %></h3>
<%
        } catch (NumberFormatException e) {
%>
            <p style="color: red;">Please enter a valid number!</p>
<%
        }
    } else {
%>
    <p>No number entered yet.</p>
<%
    }
%>
