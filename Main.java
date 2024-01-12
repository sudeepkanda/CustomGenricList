
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		CustomGenricList<Character> list=new CustomGenricList<>();
		for(int i=0;i<26;i++){
		    list.add((char)('a'+i));
		}
		System.out.println(list);
	}
}
