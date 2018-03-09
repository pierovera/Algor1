public class test {
    public static void main(String[] args) {
	boolTest t = new boolTest();

	long i = 0;

	while(i < 92233720000L) {
	    t.withVar(i);
	    i++;
	}
	       
    }
}
