<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>图书商城</title>
	<link rel="shortcut icon" type="image/x-icon" />
	<link rel="stylesheet" type="text/css"
			href="assets/jslib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet" type="text/css"
			href="assets/css/theme.css">
		<link rel="stylesheet"
			href="assets/jslib/font-awesome/css/font-awesome.css">
		<script src="assets/jslib/jquery-1.7.2.min.js"
			type="text/javascript"></script>
	
<!-- <input class="input-medium search-query" id="getsearch" type="text" /> <button type="submit" id="search" class="btn">查找</button> -->

	<script type="text/javascript">
	
	$(document).ready(function(){
		$("#search").click(function(){
			
			$getsearch=$("#getsearch");
			var getsearch = $getsearch.val();  
			/* window.location.href = getsearch+"/search"; */
			window.location.href = "www.baidu.com";
		});
		
	}); 
	
	</script>


</head>
<body>
<div class="container-fluid">
		<div class="navbar-inner">
			<ul class="nav pull-right">
				<li id="fat-menu" class="dropdown"><a href="#" role="button"
					class="dropdown-toggle" data-toggle="dropdown"> <!-- <i
						class="icon-user"></i>登陆 
						<i class="icon-caret-down"></i> -->
				</a>

					<ul class="dropdown-menu">
						<li><a tabindex="-1" href="#">修改密码</a></li>
						<li class="divider"></li>
						<li><a tabindex="-1" class="visible-phone" href="#">Settings</a>
						</li>
						<li class="divider visible-phone"></li>
						<li><a tabindex="-1" href="sys/user?cmd=logout"
							target="_top">Logout</a></li>
					</ul></li>
			</ul>
			<a class="brand" href="index.jsp"><span class="first">用最平静的心来遨游图书的海洋</span>
			</a>
		</div>
	<div class="row-fluid">
		<div class="span2">
			<dl>
				<c:forEach items="${sessionScope.hot }" var="book" varStatus="sta">
					<dt>
						${book.bookname }
					</dt>
					<dd>
					    ${book.booksimple }
					</dd>
				</c:forEach>
				<!-- <dt>
					Vacheron Constantin
				</dt>
				<dd>
					始创于1775年的江诗丹顿已有250年历史，
				</dd>
				<dd>
					是世界上历史最悠久、延续时间最长的名表之一。
				</dd>
				<dt>
					IWC
				</dt>
				<dd>
					创立于1868年的万国表有“机械表专家”之称。
				</dd>
				<dt>
					Cartier
				</dt>
				<dd>
					卡地亚拥有150多年历史，是法国珠宝金银首饰的制造名家。
				</dd> -->
			</dl>
		</div>
		<div class="span6">   
			<!-- <form class="form-search" action="/search" method="POST">
				<input class="input-medium search-query" name="getsearch" type="text" /> 
				<button type="submit" id="search" class="btn">查找</button>
			</form> -->
			<div class="btn-group" id="btn-group">
				<%-- <c:forEach items="${sessionScope.list }" var="book" varStatus="sta">
				</c:forEach> --%>
				 <!-- <button class="btn" type="button">文学</button> 
				 <button class="btn" type="button">流行</button> 
				 <button class="btn" type="button">文化</button>  -->
				 <button class="btn" type="button">小说</button> 
				 <button class="btn" type="button">童话</button> 
				 <a href="/科幻/type"><button class="btn" type="button">科幻</button></a>
				 <button class="btn" type="button">言情</button> 
				 <button class="btn" type="button">历史</button> 
				 <a href="/哲学/type"><button class="btn" type="button">哲学</button></a>
				 <!-- <button class="btn" type="button">我的收藏</button> 
				 <button class="btn" type="button">我的购买</button>
				 <button class="btn" type="button">我的评论</button> 
				 <button class="btn" type="button">我的发布</button> -->
				 
<!-- 				 <button class="btn" type="button"><em class="icon-align-left"></em></button> 
				 <button class="btn" type="button"><em class="icon-align-center"></em></button>
				 <button class="btn" type="button"><em class="icon-align-right"></em></button> 
				 <button class="btn" type="button"><em class="icon-align-justify"></em></button> -->
			</div>
			<ul class="thumbnails">
				<c:forEach items="${pi.list }" var="book" varStatus="sta">
					<li class="span4">
						<div class="thumbnail">
							<img alt="300x200" src="assets/img/${book.bookimg }" />
							<div class="caption">
								<h3>
									${book.bookname }
								</h3>
								<p>
									${book.booksimple }
								</p>
								<p>
									<a class="btn btn-primary" href="#">购买</a> <a class="btn" href="#">收藏</a>
								</p>
							</div>
						</div>
					</li>
				</c:forEach>
			</ul>
			
			
			
			
			<div class="pagination">
				<%-- <ul>
					<li>
						<a href="#">上一页</a>
					</li>
					<li>
						<a href="/store/BookInf">1</a>
					</li>
					<li>
						<a href="/store/BookInf2">2</a>
					</li>
					<li>
						<a href="/store/BookInf3">3</a>
					</li>
					<li>
						<a href="/store/BookInf3">3</a>
					</li>
					<li>
						<a href="#">下一页</a>
					</li>
				</ul>
				<div class="page-info">
					<span>当前第${pi.current }页/共${pi.count }条/${pi.total }页</span>
					
					<c:if test="${pi.current gt 1 }">
						<a href="?current=1"">首页</a>
						<a href="?current=${pi.current - 1 }">上一页</a>
					</c:if>
					
					<c:if test="${pi.current lt pi.total }">
						<a href="?current=${pi.current + 1 }">下一页</a>
						<a href="?current=${pi.total }">尾页</a>
					</c:if>
				</div> --%>
				<div class="page-info">
					<ul>
					<li><span>当前第${pi.current }页/共${pi.count }条/${pi.total }页</span></li>
					<li>
					<c:if test="${pi.current gt 1 }">
						<a href="?current=1"">首页</a>
						<a href="?current=${pi.current - 1 }">上一页</a>
					</c:if>
					</li>
					<li>
					<c:if test="${pi.current lt pi.total }">
						<a href="?current=${pi.current + 1 }">下一页</a>
						<a href="?current=${pi.total }">尾页</a>
					</c:if>
					</li>
					</ul>
				</div>
			</div>
			
			
			
			
		</div>
		<div class="span4">
			<ul class="breadcrumb">
				<li>
					<a href="#">用户</a> <span class="divider">/</span>
				</li>
				<li>
					<a href="#">管理员</a> <span class="divider">/</span>
				</li>
				<li class="active">
					登陆角色
				</li>
			</ul>
			<form  class="form-horizontal" action="collection" method="POST">
				<div class="control-group">
					 <label class="control-label" for="inputEmail">账号</label>
					<div class="controls">
						<input id="inputusername" name="inputusername"  type="text" />
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputPassword">密码</label>
					<div class="controls">
						<input id="inputPassword" name="inputPassword" type="password" />
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						 <button type="submit" class="btn">登陆</button>
					</div>
				</div>
			</form>
			<%-- <from:from action="login" method="Post" modelAttribute="user">
				账号:<from:input path="userName" /><br/>
				密码:<input name="usermoney" type="password" /><br/>
				<input type="submit" value="登陆"/>
			
			</from:from> --%>
			<!-- <div class="user-function">
				 <button class="btn" type="button">我的收藏</button> 
				 <button class="btn" type="button">我的购买</button>
				 <button class="btn" type="button">我的评论</button> 
				 <button class="btn" type="button">我的发布</button>
			 </div> -->
		</div>
	</div>
</div>

</body>
</html>