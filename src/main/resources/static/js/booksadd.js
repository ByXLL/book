$(document).ready(function () {
    $.ajax({
        type: 'get',
        url: '/api/getFictionList',
        dataType: 'json',
        jsonp: "jsoncallback",
        success: function(data) {
            var oBooks = $('#oBooks');
            var html = '';
            for (var i = 0; i < data.length; i++) {
                if(i==0){
                    html += '<div class="col-xs-6 col-sm-4 col-md-3 col-lg-4">\n' +
                        '                                        <div class="item">\n' +
                        '                                            <div class="pos-rlt">\n' +
                        '                                                <div class="item-overlay opacity r r-2x bg-black">\n' +
                        '                                                    <div class="text-info padder m-t-sm text-sm">\n' +
                        '                                                        <i class="fa fa-star"></i>\n' +
                        '                                                        <i class="fa fa-star"></i>\n' +
                        '                                                        <i class="fa fa-star"></i>\n' +
                        '                                                        <i class="fa fa-star"></i>\n' +
                        '                                                        <i class="fa fa-star-o text-muted"></i>\n' +
                        '                                                    </div>\n' +
                        '                                                    <div class="center text-center m-t-n">\n' +
                        '                                                        <a href="#"><i class="icon-book-open i-5x" onclick="layerAlert('+ data[i].bookId +')"></i></a>\n' +
                        '                                                    </div>\n' +
                        '                                                    <div class="bottom padder m-b-sm">\n' +
                        '                                                        <a href="#" class="pull-right active" data-toggle="class">\n' +
                        '                                                            <i class="text text-md"></i>\n' +
                        '                                                            <i class="fa fa-heart text-active text-danger"></i>\n' +
                        '                                                        </a>\n' +
                        '                                                        <a href="#">\n' +
                        '                                                            <i class="fa text text-lg" id="zz">作者：' + data[i].author + '</i>\n' +
                        '                                                        </a>\n' +
                        '                                                    </div>\n' +
                        '                                                </div>\n' +
                        '                                                <div class="top">\n' +
                        '                                                    <span class="pull-right m-t-n-xs m-r-sm text-white">\n' +
                        '                                                      <i class="fa fa-bookmark i-lg"></i>\n' +
                        '                                                    </span>\n' +
                        '                                                </div>\n' +
                        '                                                <a href="#"><img src="' + data[i].imgSrc + '" alt="" class="r r-2x img-full"></a>\n' +
                        '                                            </div>\n' +
                        '                                            <div class="padder-v">\n' +
                        '                                                <a href="#" class="text-ellipsis text-lg text-center">《' + data[i].name + '》</a>\n' +
                        '                                            </div>\n' +
                        '                                        </div>\n' +
                        '                                    </div>';

                }else {
                    html += '<div class="col-xs-6 col-sm-4 col-md-3 col-lg-2">\n' +
                        '                      <div class="item">\n' +
                        '                        <div class="pos-rlt">\n' +
                        '                          <div class="item-overlay opacity r r-2x bg-black">\n' +
                        '                            <div class="text-info padder m-t-sm text-sm">\n' +
                        '                              <i class="fa fa-star"></i>\n' +
                        '                              <i class="fa fa-star"></i>\n' +
                        '                              <i class="fa fa-star"></i>\n' +
                        '                              <i class="fa fa-star-o text-muted"></i>\n' +
                        '                              <i class="fa fa-star-o text-muted"></i>\n' +
                        '                            </div>\n' +
                        '\n' +
                        '                            <div class="center text-center m-t-n">\n' +
                        '                              <a href="#"><i class="icon-book-open i-2x" onclick="layerAlert(' + data[i].bookId + ')"></i></a>\n' +
                        '                            </div>\n' +
                        '                            <div class="bottom padder m-b-sm">\n' +
                        '                              <a href="#" class="pull-right active" data-toggle="class">\n' +
                        '                                <i class="text text-lg"></i>\n' +
                        '                                <i class="fa fa-heart text-active text-danger"></i>\n' +
                        '                              </a>\n' +
                        '                              <a href="#">\n' +
                        '                                <i class="fa text text-sm">作者：' + data[i].author + '</i>\n' +
                        '                              </a>\n' +
                        '                            </div>\n' +
                        '\n' +
                        '                          </div>\n' +
                        '                          <a href="#"><img src="' + data[i].imgSrc + '" alt="" class="r r-2x img-full" style="height: 260px;"></a>\n' +
                        '                        </div>\n' +
                        '                        <div class="padder-v">\n' +
                        '                          <a href="#" class="text-ellipsis text-ms text-center">《' + data[i].name + '》</a>\n' +
                        '                        </div>\n' +
                        '                      </div>\n' +
                        '                    </div>';

                }

            }
            oBooks.html(html);
        }
    });
});