<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${not empty feedback}">
	<div class="feedback">
		${feedback}
	</div>
	<c:remove var="feedback" />
	<script>
		setTimeout(function(){
			$(".feedback").fadeOut();
		}, 5000);
	</script>
</c:if>

