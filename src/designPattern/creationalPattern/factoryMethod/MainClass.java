package designPattern.creationalPattern.factoryMethod;

public class MainClass {
	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();
		Profession doc = professionFactory.getProfession("doctor"); 
		doc.print();
		
		Profession eng = professionFactory.getProfession("engineer"); 
		eng.print();
		
		Profession teacher = professionFactory.getProfession("teacher");
		teacher.print();
	}
}
