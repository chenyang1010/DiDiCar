package com.tt.servic;

public class OrderList {
 
	//1---Home����Ӧ�������������
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
	
	//2---����ҳ���QQͼ������QQ����������
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
	
	

	//3---�ڵ�����QQ�����ϵ������
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
	
	
	//4---����hyl ѡ���һ�� ǰ�������뷨����������ģʽ
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
	
	//5---�����������ѡ���һ��
	static String[] orderSelect5  = {
		"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 1",
	"sendevent /dev/input/event4 3 53 438",
	"sendevent /dev/input/event4 3 54 223",
	"sendevent /dev/input/event4 0 0 0",
	"sendevent /dev/input/event4 1 330 0",
	"sendevent /dev/input/event4 0 0 0"
	};
	
	//6---�������� �������뷨
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
	
	//7---�����뷨���� ���� ��� �ĸ���
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
	
	
	//8---������Ͱ�ť����
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
