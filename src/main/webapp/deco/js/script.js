window.onload = function() {
	var swiper = new Swiper(".container .mySwiper", {
		navigation: {
			nextEl: ".container .next",
			prevEl: ".container .prev",
		},
		pagination: {
          el: ".container .swiper-pagination",
		  clickable : true,
        },
		loop : true,
    autoplay : {
      delay: 3500,
      disableOnInteraction: false,
    },
	});
};