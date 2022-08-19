package dataStructures;

import java.io.File;

public class Drop implements UpdateQuery {
	private String tableName;

	public Drop(String tableName) {
		super();
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

	public Boolean execute() throws Exception {
		File file = new File("dati/" + tableName);
		if (!file.exists())
			throw new Exception("This table doesn't exists: " + tableName);
		file.delete();
		return true;
	}
}
