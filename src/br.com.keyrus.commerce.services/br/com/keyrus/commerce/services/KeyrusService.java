
public interface KeyrusService {

	static KeyrusService getInstance() {
		return new DefaultKeyrusService();
	}
	
	String getKeyrusName();

}