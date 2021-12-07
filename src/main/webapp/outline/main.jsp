<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String url = (String)request.getAttribute("url");
%>
<!-- 메인 게시글 팝니다 START -->
      <div class="container">
        <!-- 스와이퍼 START -->
        <div class="swiper mySwiper">
          <div class="swiper-wrapper">
            <div class="swiper-slide">
              <img src="<%=url%>/deco/img/main_banner1.png" class="main_banner">
            </div>
            <div class="swiper-slide">
              <img src="<%=url%>/deco/img/main_banner2.png" class="main_banner">
            </div>
            <div class="swiper-slide">
              <img src="<%=url%>/deco/img/main_banner3.png" class="main_banner">
            </div>
            <div class="swiper-slide">
              <img src="<%=url%>/deco/img/main_banner4.png" class="main_banner">
            </div>
            <div class="swiper-slide">
              <img src="<%=url%>/deco/img/main_banner5.png" class="main_banner">
            </div>
          </div>

          <i class='xi-angle-left navi prev'></i>
				  <i class='xi-angle-right navi next'></i>

          <div class="swiper-pagination"></div>
        </div>
        <!-- 스와이퍼 END -->
        <div class="home_product">
          <div class="product_title">
            <div class="ptitle"> 내 주변의 중고물품은 ? </div>
            <div class="pstitle"> 현재 인기있는 판매 게시글 </div>
          </div>
          <div class="product_list_wrap">
            <div class="product_list list_first">
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/sale_product1.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">디지털기기</p>
                    </div>
                    <p class="name">아이폰 xs 64기가 블랙 네고x</p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 150,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/sale_product2.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">생활/인테리어</p>
                    </div>
                    <p class="name">사용감 있는 소파 싸게 팝니다~</p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 300,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/sale_product3.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">생활/인테리어</p>
                    </div>
                    <p class="name">우드 원목 행거 및 협탁 판매</p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 70,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/sale_product4.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">패션/디자인</p>
                    </div>
                    <p class="name">몽클레어 키즈 12f/w </p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 35,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/sale_product5.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">디지털기기</p>
                    </div>
                    <p class="name">65인치 LG 스마트TV </p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 295,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/sale_product6.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">가정/생활용품</p>
                    </div>
                    <p class="name">베이비젠 요요 휴대용 유모차 </p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 140,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/sale_product7.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">가정/주방용품</p>
                    </div>
                    <p class="name">2인용 식탁 화이트 </p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 60,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/sale_product8.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">패션/디자인</p>
                    </div>
                    <p class="name">어그 양털슬리퍼 </p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 30,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
            </div>
          </div>
        </div>
        <!-- 메인게시글 팝니다 END -->
        <!-- 공간분리용 빅 배너 -->
        <div class="banner lg">
          <div class="banner item">
            <div class="item_inner">
              <div class="img_box">
                <img src="<%=url%>/deco/img/big_banner1.png" class="big_banner">
              </div>
            </div>
          </div>
        </div>
        <!-- 공간분리용 빅 배너 -->
        <!-- 메인게시글 삽니다 게시글 -->
        <div class="home_product">
          <div class="product_title">
            <div class="ptitle"> 혹시 가지고 계신가요? </div>
            <div class="pstitle"> 비슷한 물건을 찾고있어요 </div>
          </div>
          <div class="product_list_wrap">
            <div class="product_list list_first">
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/buy_product1.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">주방/생활용품</p>
                    </div>
                    <p class="name">LG DIOS 양문형 냉장고 구매</p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 550,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/buy_product2.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">디지털기기</p>
                    </div>
                    <p class="name">아들 취미용 전자드럼 구매중</p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 175,000</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/buy_product3.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">명품/패션</p>
                    </div>
                    <p class="name">루이비통 가방 중고구매</p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 가격 협의</em>
                        <span class="won"></span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
              <div class="product_item">
                <a href="" class="item_inner">
                  <div class="thumb_box">
                    <div class="product">
                      <img src="<%=url%>/deco/img/buy_product4.jpeg" class="product_img">
                    </div>
                  </div>
                  <div class="info_box">
                    <div class="brand">
                      <p class="brand-text">여행/숙박권</p>
                    </div>
                    <p class="name">서울 아난티 코브 12/25 크리스마스</p>
                    <div class="price">
                      <div class="amount">
                        <em class="num"> 11,111</em>
                        <span class="won">원</span>
                      </div>
                      <div class="desc">
                        <p>인천 서구 심곡동</p>
                      </div>
                    </div>
                  </div>
                </a>
              </div>
            </div>
          </div>
        </div>
        <div class="banner lg">
          <div class="banner item">
            <div class="item_inner">
              <div class="img_box">
                <img src="<%=url%>/deco/img/big_banner2.png" class="big_banner">
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>