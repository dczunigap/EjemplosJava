package com.mx.dzuniga;

final class FinalClassNoExtend {

}


class FinalMethods{
	final String method(){
		return "Jajaja";
	}
}

public class FinalClass extends FinalMethods /*FinalClassNoExtend*/ {
	/*public String method(){
		//Launch error compile
	}*/
}
