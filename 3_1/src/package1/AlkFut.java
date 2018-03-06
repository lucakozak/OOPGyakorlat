package package1;

public class AlkFut {
	public static void main(String[] args) {
		
		Alkalmazott[] alkok = new Alkalmazott[5];
		
		alkok[0] = new Alkalmazott();
		alkok[0].setName("Tomi");
		alkok[0].setPayment(54);
		
		alkok[1] = new Alkalmazott();
		alkok[1].setName("Kitti");
		alkok[1].setPayment(65);
		
		alkok[2] = new Alkalmazott();
		alkok[2].setName("Martin");
		alkok[2].setPayment(12);
		
		alkok[3] = new Alkalmazott();
		alkok[3].setName("Dani");
		alkok[3].setPayment(23);
		
		alkok[4] = new Alkalmazott();
		alkok[4].setName("Márk");
		alkok[4].setPayment(45);
		
		for(Alkalmazott a : alkok)
		System.out.println(a.szovegVissza());
		
		int max = alkok[0].getPayment();
		for(int i=0;i<=alkok.length;i++){
			if(alkok[i].getPayment()>max)
				max= alkok[i].getPayment();
		}
		
		System.out.println("A legnagyobb fizetésû alkalmazott: " + max);
		
		int db=0;
		
		for(int i=0;i<alkok.length;i++){
			if(alkok[i].fizHatar(20, 50));
			db++;
		}
		
		System.out.println("Az alkalmazottak által befizetett adó összesen: "+db);
		//System.out.println(x);
		
		/*System.out.println(alkok[3].szovegVissza());
		
		Alkalmazott alkalmazott1 = new Alkalmazott();

		//alkalmazott1.name = "Tomi";
		alkalmazott1.setName("Tomi");
		//alkalmazott1.payment = 0;
		alkalmazott1.setPayment(8);

		System.out.println(alkalmazott1.szovegVissza());

		alkalmazott1.fizNov(15);
		System.out.println(alkalmazott1.szovegVissza());
		
		boolean isTrue = alkalmazott1.fizHatar(10, 20);
		if(isTrue)
			System.out.println("A megadott határok közé esik.");
		else
			System.out.println("Nem esik a megadott határok közé");
		
		System.out.println("Adóértéke: " + alkalmazott1.getAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		
		alkalmazott2.setName("Kitti");
		alkalmazott2.setPayment(80);
		
		if (alkalmazott1.nagyobbE(alkalmazott2)) {
			System.out.println("Alk1 fizetése nagyobb");
		} else {
			System.out.println("Alk2 fizetése nagyobb");
		}*/
	}

}
