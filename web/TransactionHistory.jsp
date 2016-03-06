<jsp:use ..>


<p>
<table border=1 cellpadding=3 cellspacing=0 width=300 summary="transactionTable">
<tr>
  <td><b><fmt:message key-"transactionDate"/></b></td>
  <td><b><fmt messgae key="transactionDescription"/></b></td>
  <td><b><fmt messgae key="transactionQuantity"/></b></td>
  <td><b><fmt messgae key="transactionCost"/></b></td>
</tr>
  //Included theh headers to the page
  
  //<c:forEach> tag used to iterate over a collection of objects
  
<c:forEach items="${TransactionHistoryBean.orders}" var="transaction">
<tr>
<td>${transacation.dateTimeStamp}</td>
<td>$<transacation.description}</td>
<td><b><fmt message key="transactionQty" type="currency"></td>
<td><b><fmt message key="transactionCst" type="currency"></td>
</tr>
</table>
