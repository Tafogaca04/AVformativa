package AVformativa;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bingo[]= new int[20];
		
		for (int i=0; i<20; i++)	{
	
				if(i<=20){
					bingo [i] = (int)Math.round(Math.random()*100);
				}
			System.out.print(bingo[i]+ ",");
	}

}
}

