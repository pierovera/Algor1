public class boolTest {
    public boolean withVar(long n) {
	boolean res;

	if (n % 2 == 0)
	    res = true;
	else
	    res = false;

	return res;
    }

    public boolean noVar( long n) {
	if(n % 2 == 0)
	    return true;
	return false;
    }
}
