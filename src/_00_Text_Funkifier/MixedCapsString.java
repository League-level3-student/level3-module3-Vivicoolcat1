package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String a="";
		
		
		for (int i = 0; i < s.length(); i++) {
			Character c =s.charAt(i);
			
			if(i%2==0 ) {
				
				Character d= Character.toLowerCase(c);
				a+=d;
			}
			else {
				
			Character e=Character.toUpperCase(c);
			a+=e ;
			}
			
		}
		return a;
	}

}
