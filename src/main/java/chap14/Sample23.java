package chap14;

public class Sample23 {

	//Potential heap pollution via varargs parameter toAdd
	@SafeVarargs
	public final <T> void safe(T... toAdd) {}
	
	@SafeVarargs
	public static void safe(int... toAdd) {}
	
	@SafeVarargs
	private <T> void safe2(T... toAdd)	{}
}
