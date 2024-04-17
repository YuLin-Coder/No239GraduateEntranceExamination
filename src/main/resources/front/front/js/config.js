
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的订单',
	url: '../order/list.html'
},

{
	name: '我的地址',
	url: '../address/list.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '考研资讯',
	url: './pages/kaoyanzixun/list.html'
}, 
{
	name: '报考指南',
	url: './pages/baokaozhinan/list.html'
}, 
{
	name: '资料信息',
	url: './pages/ziliaoxinxi/list.html'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.html'
}, 
]

var adminurl =  "http://localhost:8080/springboot58ly4/admin/dist/index.html";

var cartFlag = false

var chatFlag = false

var systemName = '考研资讯平台'


chatFlag = true
cartFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"考研资讯","menuJump":"列表","tableName":"kaoyanzixun"}],"menu":"考研资讯管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"报考指南","menuJump":"列表","tableName":"baokaozhinan"}],"menu":"报考指南管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"资料信息","menuJump":"列表","tableName":"ziliaoxinxi"}],"menu":"资料信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"资料分类","menuJump":"列表","tableName":"ziliaofenlei"}],"menu":"资料分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"kefuguanli"}],"menu":"系统管理"},{"child":[{"buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看"],"menu":"已发货订单","tableName":"orders/已发货"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"考研资讯列表","menuJump":"列表","tableName":"kaoyanzixun"}],"menu":"考研资讯模块"},{"child":[{"buttons":["查看"],"menu":"报考指南列表","menuJump":"列表","tableName":"baokaozhinan"}],"menu":"报考指南模块"},{"child":[{"buttons":["查看"],"menu":"资料信息列表","menuJump":"列表","tableName":"ziliaoxinxi"}],"menu":"资料信息模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看","确认收货"],"menu":"已发货订单","tableName":"orders/已发货"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"考研资讯列表","menuJump":"列表","tableName":"kaoyanzixun"}],"menu":"考研资讯模块"},{"child":[{"buttons":["查看"],"menu":"报考指南列表","menuJump":"列表","tableName":"baokaozhinan"}],"menu":"报考指南模块"},{"child":[{"buttons":["查看"],"menu":"资料信息列表","menuJump":"列表","tableName":"ziliaoxinxi"}],"menu":"资料信息模块"}],"roleName":"学生","tableName":"xuesheng"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
