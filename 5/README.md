古诗词文本处理

实验目的
掌握字符串String及其常用方法的使用

业务要求
有《长恨歌》古诗词，在经某程序处理后，被删去了非汉字部分，如标点符号、回车换行等。现请设计程序恢复。要求如下：

每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；
允许提供输入参数，统计古诗中某个字或词出现的次数。
输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>

输出：

汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
......

整体分段
```
	char [] sz = data1.toCharArray();
	for (int i=1; i<=sz.length; i++) {
			System.out.print(sz[i-1]);
			if(i%7 ==0) {	
				count++;
				if(count%2 == 0){
					System.out.print("，");
					
			}else {	
				System.out.println("。");
				}
			}
		}
   
```
汉字查询
```
System.out.println(data);
	Scanner in = new Scanner(System.in);
	int c =1;
	while(c==1) {
	
	System.out.println("\n请输入想要查找出现次数的汉字：");
    String b = in.next();
     int n=data.indexOf(b);
        int time= 0;
        while (n >=0) {
        	time++;
        	int x =n + b.length();
        	n= data.indexOf(b,x);
        }
        System.out.println(time);
    }
 }
}
```
#### 运行截图
https://gitee.com/xing-kuizheng/experiment-5/blob/master/%E5%AE%9E%E9%AA%8C%E4%BA%94.png