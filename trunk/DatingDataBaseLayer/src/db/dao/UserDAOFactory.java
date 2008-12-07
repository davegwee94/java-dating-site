package db.dao;

public class UserDAOFactory {
	private static UserDAO userDAO;
	public static UserDAO getUserDAO(){
		if (userDAO == null) {
			userDAO = new UserDAO();
		}
		return userDAO;
	}
}
