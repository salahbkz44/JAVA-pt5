package projecttp02;

public class main {

	public static void main(String[] args) {
		puce ooredoo = new puce("0553468596");
		puce djezzy = new puce("0756987458");
		MobilePhone p1 = new MobilePhone("samsung","M52",8,2.3,ooredoo);
		MobilePhone p2 = new MobilePhone("iphone","iphone 7",4,3.2,djezzy);
		if(p1.performance()>p2.performance()) {
			System.out.println(p1.getmarque() + " " + p1.getmodel() + " est plus fort que " + p2.getmarque() + " " + p2.getmodel());
		}else {
			if(p1.performance()<p2.performance()){
				System.out.println(p2.getmarque() + " " + p2.getmodel() + "est plus fort que" + p1.getmarque() + " " + p1.getmodel());
			}else {
				System.out.println(p1.getmarque() + " " + p1.getmodel() + "est equivalent à" + p2.getmarque() + " " + p2.getmodel());
			}
		}
	}

}
