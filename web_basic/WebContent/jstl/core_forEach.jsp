<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%
	int sum = 0;
for (int i = 0; i < 11; i++) {
	sum += i;
}

out.println("1부터 10까지 더한 값 : " + sum);
%>

<hr>


<c:set var="sum" value="0" />
<c:forEach var="i" begin="1" end="10" step="1">
	<c:set var="sum" value="${sum+i }" />
</c:forEach>

1부터 10까지 더한 값 : ${sum}

<hr>

집합체 반복
<%
	int[] k = { 1, 2, 3, 4, 5, 6, 7 };
int sumn = 0;
for (int i : k) {
	sumn = sumn + i;
}
out.println("{1,2,3,4,5,6,7}의 원소를 모두 더한 값 : " + sumn);
%>

<hr>

<c:set var="k" value="1,2,3,4,5,6,7"></c:set>
<c:set var="sumn" value="0"/>
<c:forEach var="i" items="${k }">
	<c:set var="sumn" value="${sumn + i}"/>
</c:forEach>

{1,2,3,4,5,6,7}의 원소를 모두 더한 값 : ${sumn}