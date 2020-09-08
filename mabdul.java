package UTS;

public class mabdul {

	public static void main(String[] args) {
		
		//data-data yang tersedia untuk di outputkan 
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";

		//pengambilan data dari data string di atas untuk Nama
		char dul1 = a.charAt(12);
		char dul2 = a.charAt(14);
		char dul3 = a.charAt(2);
		char dul4 = a.charAt(7);
		char dul5 = a.charAt(27);
		char dul6 = a.charAt(0);
		char dul7 = a.charAt(1);
		char dul8 = a.charAt(3);
		char dul9 = a.charAt(20);
		char dul10 = a.charAt(11);
		char dul11 = a.charAt(27);
		char dul12 = a.charAt(17);
		char dul13 = a.charAt(0);
		char dul14 = a.charAt(2);
		char dul15 = a.charAt(7);
		char dul16 = a.charAt(12);
		char dul17 = a.charAt(0);
		char dul18 = a.charAt(13);
		
		//pengambilan data dari data string di atas untuk Kelas
		char kls1 = a.charAt(23);
		char kls2 = a.charAt(8);
		char kls3 = a.charAt(8);
		char kls4 = a.charAt(27);
		char kls5 = a.charAt(17);
		char kls6 = a.charAt(15);
		char kls7 = a.charAt(11);
		char kls8 = a.charAt(27);
		char kls9 = a.charAt(1);

		//output Nama
		System.out.println("Nama : "+dul1+""+dul2+""+dul3+""+dul4+""+dul5+""+dul6+""+dul7+""+dul8+""+dul9+
				           ""+dul10+""+dul11+""+dul12+""+dul13+""+dul14+""+dul15+""+dul16+""+dul17+""+dul18);
		
		//output Kelas
		System.out.println("Kelas : "+kls1+""+kls2+""+kls3+""+kls4+""+kls5+""+kls6+""+kls7+""+kls8+""+kls9);
	}

}
