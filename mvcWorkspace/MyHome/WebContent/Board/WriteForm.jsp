<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	function checkWrite(){
		if(document.write.title.value == ""){
			alert('제목을 입력하십시오!');
		}else if(document.write.content.value == ""){
			alert('내용을 입력하십시오!');
		}else{
			document.write.submit();
		}
	}
</script>
<jsp:include page="/Layout/Header.jsp"/>
	<div align="center">
		<form action="/MyHome/CheckWrite.brd" method="post" name="write"
		  enctype="multipart/form-data">
			<input type="hidden" name="id" value="${login }">
			<table id="table">
				<tr>
					<th>제목</th>
					<td><input type="text" name="title">
				</tr>
				<tr>
					<td colspan="2">
						<textarea rows="15" cols="65" name="content"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="file" name="filename">
					</td>
				</tr>
			</table>
			<div id="button">
				<input type="button" value="쓰기" onclick="javascript:checkWrite()">
			</div>	
		</form>
	</div>
<jsp:include page="/Layout/Footer.jsp"/>