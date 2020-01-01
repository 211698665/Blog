//评论内容
$(".id1").on("click", ".plun", function() {
	var txt = $('.pluncon').val();
	var userName = $('.userName').val(); //这个是获取输入框的值
	var toName = $('#tt1').html();//这个是获取标签中的内容
	$(".id1_2").append("<div class='comment-secondary-panel'>" +
		"<span class='triangle-icon'><i class='fa fa-sort-asc' aria-hidden='true'></i></span>" +
		"<div class='comment-panel-content'>" +
		"<div class='comment-panel-content-item'>" +
		"<div class='comment-author'><span class='a_send' id='tt1'> "+ userName + "</span><font style='color: #666;'>回复</font><span class='a_receive'>" + toName + "</span></div>" +
		"<div>2017-10-01 18:00</div>" +
		"</div>" +
		"<div class='comment-panel-content-main'>" + txt + "</div>" +
		"</div>" +
		"<span class='clearfix'></span>" +
		"<div class='text-primary1'><a href='javascript:;' class='reply_btn'>回复</a></div>" +
		"</div>");
	$(".reply_textarea").remove();
});

$(".user-select").on("click", "#close-button", function() {
	$("baguetteBox-overlay").hide();
});