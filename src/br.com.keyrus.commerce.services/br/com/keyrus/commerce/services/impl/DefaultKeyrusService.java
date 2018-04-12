public class DefaultKeyrusService implements KeyrusService {

	private KeyrusDao keyrusDao;

	public DefaultKeyrusService() {
		keyrusDao = new KeyrusDao();
	}

	public String getKeyrusName() {
		return keyrusDao.findKeyrusName();
	}

}