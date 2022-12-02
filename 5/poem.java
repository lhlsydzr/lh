package poem;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class poem {
	public static void main(String[] args) {
	String data = "汉皇重色思1倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>";
	int count = 1;	
	
	Pattern pattern1 = Pattern.compile("<未完，待续>");
	Matcher matcher1 = pattern1.matcher("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>");
	String data1 = matcher1.replaceAll("......");
	
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