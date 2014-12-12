package tpcw;

import java.util.ResourceBundle;

/**
 * This program check and get all information for the database.properties file
 * found in the classpath.
 * 
 * @author <a href="mailto:Emmanuel.Cecchet@inrialpes.fr">Emmanuel Cecchet</a>
 *         and <a href="mailto:julie.marguerite@inrialpes.fr">Julie
 *         Marguerite</a>
 * @version 1.0
 */

public class DatabaseProperties {
	private static ResourceBundle configuration = null;

	private String db_driver;
	private String db_url;
	private String db_username;
	private String db_password;

	/**
	 * Creates a new <code>DatabaseProperties</code> instance. If the
	 * cjdbc.properties file is not found in the classpath, the current thread
	 * is killed.
	 */
	public DatabaseProperties() {
		// Get and check database.properties
		System.out.println("Looking for database.properties in classpath ("
				+ System.getProperty("java.class.path", ".") + ")");
		try {
			configuration = ResourceBundle.getBundle("database");
		} catch (java.util.MissingResourceException e) {
			System.err
					.println("No database.properties file has been found in your classpath.");
			Runtime.getRuntime().exit(1);
		}
	}

	/**
	 * Returns the value corresponding to a property in the database.properties
	 * file.
	 * 
	 * @param property
	 *            the property name
	 * @return a <code>String</code> value
	 */
	protected String getProperty(String property) {
		String s = configuration.getString(property);
		return s;
	}

	/**
	 * Check for all needed fields in database.properties and inialize
	 * corresponding values.
	 */
	public boolean checkPropertiesFile() {
		try {
			System.out.println("\n### Database information ###");
			db_url = getProperty("db_url");
			System.out.println("Database url       : " + db_url);
			db_driver = getProperty("db_driver");
			System.out.println("Database driver    : " + db_driver);
			db_username = getProperty("db_username");
			System.out.println("Username           : " + db_username);
			db_password = getProperty("db_password");
			System.out.println("Password           : " + db_password);

			return true;
		} catch (Exception e) {
			System.err.println("Error while checking database.properties: "
					+ e.getMessage());
			return false;
		}
	}

	/**
	 * Get the database URL for the SQL database
	 * 
	 * @return database url
	 */
	public String getDatabaseURL() {
		return db_url;
	}

	/**
	 * Get the database driver class name for the SQL database
	 * 
	 * @return database driver class name
	 */
	public String getDatabaseDriver() {
		return db_driver;
	}

	/**
	 * Get the username for the SQL database
	 * 
	 * @return username
	 */
	public String getDatabaseUsername() {
		return db_username;
	}

	/**
	 * Get the password for the SQL database
	 * 
	 * @return password
	 */
	public String getDatabasePassword() {
		return db_password;
	}

}
