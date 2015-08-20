package com.tt.servic;

public class OrderList {
 
	//1---Home键对应输入的驱动代码
	static String[] orderHome1 = {
		"sendevent /dev/input/event1 0 0 0",
		"sendevent /dev/input/event1 1 102 1",
		"sendevent /dev/input/event1 0 0 0",
		"sendevent /dev/input/event1 1 102 0",
		"sendevent /dev/input/event1 0 0 0",
		"sendevent /dev/input/event1 0 0 0"
	};
	
	//1--Tab
	static String[] tap = {
		"input tap 185 795",
	};
	
	//2---从主页点击QQ图标启动QQ的驱动代码
	static String[] orderQQ2  = {
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 83",
		"sendevent /dev/input/event4 3 54 916",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 0 0 0"
	};
	
	

	//3---在弹出的QQ界面上点击搜索
	static String[] orderSearch3  = {
	"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 1",
	"sendevent /dev/input/event4 3 53 363",
	"sendevent /dev/input/event4 3 54 194",
	"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 0",
	"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 0 0 0"
	};
	
	
	//4---输入hyl 选择何一柳 前提是输入法是中文输入模式
	static String[] orderInput4  = {
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 219",
		"sendevent /dev/input/event4 3 54 1014",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 530",
		"sendevent /dev/input/event4 3 54 1127",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 367",
		"sendevent /dev/input/event4 3 54 1003",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 130",
		"sendevent /dev/input/event4 3 54 768",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 0 0 0"
	};
	
	//5---从搜索结果中选择何一柳
	static String[] orderSelect5  = {
		"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 1",
	"sendevent /dev/input/event4 3 53 438",
	"sendevent /dev/input/event4 3 54 223",
	"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 0",
	"sendevent /dev/input/event4 0 0 0"
	};
	
	//6---点击输入框 弹出输入法
	static String[] orderGetInput6  = {
		"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 1",
	"sendevent /dev/input/event4 3 53 412",
	"sendevent /dev/input/event4 3 54 1233",
	"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 0",
	"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 0 0 0"
	};
	
	//7---从输入法打字 输入 你好 四个字
	static String[] orderInputText7  = {
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 524",
		"sendevent /dev/input/event4 3 54 1020",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 222",
		"sendevent /dev/input/event4 3 54 1006",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 3 53 221",
		"sendevent /dev/input/event4 3 54 1006",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 209",
		"sendevent /dev/input/event4 3 54 1009",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 350",
		"sendevent /dev/input/event4 3 54 903",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 521",
		"sendevent /dev/input/event4 3 54 992",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 1",
		"sendevent /dev/input/event4 3 53 115",
		"sendevent /dev/input/event4 3 54 762",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 1 330 0",
		"sendevent /dev/input/event4 0 0 0",
		"sendevent /dev/input/event4 0 0 0"
	};
	
	
	//8---点击发送按钮代码
	static String[] orderInputSend8  = {
		"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 1",
	"sendevent /dev/input/event4 3 53 658",
	"sendevent /dev/input/event4 3 54 639",
	"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 0",
	"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 0 0 0"
	};
}
