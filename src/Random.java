import java.util.concurrent.ThreadLocalRandom;
public class Random {
	public int rands(){
		return ThreadLocalRandom.current().nextInt(0,10001);
	}
}
