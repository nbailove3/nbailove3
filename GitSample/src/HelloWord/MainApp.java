package HelloWord;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.print("3nd Version");
   
   Math cMath = new Math();
   System.out.println();
   System.out.print(cMath.add(5, 5));
	}

}

class Math{
	int add(int x, int y) {
		return x+y;
	}
}