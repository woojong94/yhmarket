<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String url = (String)request.getAttribute("url");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <link rel='stylesheet' href="https://unpkg.com/swiper/swiper-bundle.min.css">
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
    <script src="<%=url%>/deco/js/ckeditor/ckeditor.js"></script>
	<script src="//cdn.ckeditor.com/4.17.1/full/ckeditor.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=url%>/deco/css/style.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script src="<%=url%>/deco/js/script.js"></script>
    <title>연희마켓 | 모든 물건을 사고/팔고</title>
  </head>
  <body>
        <!-- 헤더 START --> 
    <div id="layout">
      <div class="header">
        <div class="header_top">
          <div class="top_inner">
            <ul class="top_list">
              <li class="top_item">
                <a href="" class="top_link">고객센터</a>
              </li>
              <li class="top_item2">
                <a href="" class="top_link">마이페이지</a>
              </li>
              <li class="top_item3">
                <a href="<%=url%>/member/login" class="top_link">로그인</a>
              </li>
              <li class="top_item4">
                <a href="<%=url%>/member/join" class="top_link">회원가입</a>
              </li>
            </ul>
          </div>
        </div>
        <!-- 로고 , 공지사항, 삽니다, 팝니다 -->
        <div class="header_main">
          <div class="main_inner">
            <h1 class="inner_h">
              <a href="" class="logo">
                <img src='<%=url%>/deco/img/market-logo.png' class="market_logo">
              </a>
            </h1>
            <div class="inner_area">
              <nav class="inner">
                <ul class="inner_list">
                  <li class="inner_item">
                    <a href="" class="inner_link">공지사항</a>
                  </li>
                  <li class="inner_item">
                    <a href="<%=url%>/list" class="inner_link">삽니다</a>
                  </li>
                  <li class="inner_item">
                    <a href="<%=url%>/list2" class="inner_link">팝니다</a>
                  </li>
                </ul>
              </nav>
            </div>
          </div>
        </div>
      </div>
   
 
  
 