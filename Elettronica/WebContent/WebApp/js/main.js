jQuery(document).ready(function($){
    
    // jQuery sticky Menu
    
	$(".mainmenu-area").sticky({topSpacing:0});
    
    
    $('.product-carousel').owlCarousel({
        loop:true,
        nav:true,
        margin:20,
        responsiveClass:true,
        responsive:{
            0:{
                items:1,
            },
            600:{
                items:3,
            },
            1000:{
                items:5,
            }
        }
    });  
    
    $('.related-products-carousel').owlCarousel({
        loop:true,
        nav:true,
        margin:20,
        responsiveClass:true,
        responsive:{
            0:{
                items:1,
            },
            600:{
                items:2,
            },
            1000:{
                items:2,
            },
            1200:{
                items:3,
            }
        }
    });  
    
    $('.brand-list').owlCarousel({
        loop:true,
        nav:true,
        margin:20,
        responsiveClass:true,
        responsive:{
            0:{
                items:1,
            },
            600:{
                items:3,
            },
            1000:{
                items:4,
            }
        }
    });    
    
    
    // Bootstrap Mobile Menu fix
    $(".navbar-nav li a").click(function(){
        $(".navbar-collapse").removeClass('in');
    });    
    
    // jQuery Scroll effect
    $('.navbar-nav li a, .scroll-to-up').bind('click', function(event) {
        var $anchor = $(this);
        var headerH = $('.header-area').outerHeight();
        $('html, body').stop().animate({
            scrollTop : $($anchor.attr('href')).offset().top - headerH + "px"
        }, 1200, 'easeInOutExpo');

        event.preventDefault();
    });    
    
    // Bootstrap ScrollPSY
    $('body').scrollspy({ 
        target: '.navbar-collapse',
        offset: 95
    })      
});

$( document ).ready(function() {
	//una volta caricato il DOM esegui questo codice
	//console.log( "DOM ready!" );
	$(window).load(function() {
	//una volta caricata l'intera pagina (immagini e i frames..) esegui questo codice
	//console.log( "Page ready!" );
	//faccio scomparire l'immagine di caricamento
	$(".loader").fadeOut("slow");
	});
	});