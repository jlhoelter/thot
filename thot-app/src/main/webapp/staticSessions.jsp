<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>

<%@ include file="header.jsp"%>
<body onload="JavaScript:initTab();">
	<%@ include file="menu.jsp"%>

	<div class="container-fluid">
		<!--/span-->
		<div class="well well-small">
			<h1>
				<spring:message code="sessions" text="sessions" />
			</h1>
			<br />
			<p>Select the day of the conference that you are interested in.</p>
		</div>

		<br style="clear: both;" />

		<ul class="nav nav-tabs">
			<c:forEach items="${sessionDays}" var="day" varStatus="status">
				<li><a href="#date${status.index}" data-toggle="tab"> ${day} </a></li>
			</c:forEach>
		</ul>
		
		<div class="tab-content">
			 <c:forEach items="${sessionMap}" var="entry" varStatus="status">
			 	<div class="tab-pane" id="date${status.index}">

					<div class="row-fluid">
						<table class="table table-striped">
							<%@ include file="schedule_tableheader.html"%>
							<tbody>
								<c:forEach items="${entry.value}" var="session">
			                        <c:url value="comments" var="url" scope="page">
			                            <c:param name="sessionId" value="${session.id}" />
			                        </c:url>
									<tr class="sessions" data-link="${url}">
										<td>${session.date}</td>
										<td>${session.start}</td>
										<td>${session.end}</td>
										<td>
			                                ${session.title}<a href='${url}'>  </a>
										</td>
										<td>${session.author}</td>
										<td>${session.location}</td>
										<td></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>

			 	</div>
			</c:forEach>
		</div>


    <script type="text/JavaScript">
    <!--
        function initTab() {
            $('#daysTab a:last').tab('show');
        }
    //   -->
    </script>
    <%@ include file="footer.html"%>