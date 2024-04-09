package review2.sakitamako.com.github;

public class ColorTest {
	public static void main(String[] args) {
		ColorChart red = new ColorChart();
		red.color = "赤";
		red.level = 7;
		red.length = "ミディアム";
		
		System.out.println(red.color);
		System.out.println(red.level);
		System.out.println(red.length);
		
		ColorChart blue = new ColorChart();
		blue.color = "青";
		blue.level = 5;
		blue.length = "ロング";
		
		System.out.println(blue.color);
		System.out.println(blue.level);
		System.out.println(blue.length);
		
		red.style();
		blue.style();
	}

}
