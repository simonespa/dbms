package dataStructures;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;

public class Create implements UpdateQuery {

	private String tableName;
	private HashMap<String, DataType> fields = new HashMap<String, DataType>();

	public Create(String tableName) {
		super();
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

	public void addField(String name, DataType type) {
		fields.put(name, type);
	}

	public HashMap<String, DataType> getFields() {
		return fields;
	}

	public Boolean execute() throws Exception {
		File file = new File("dati");
		if (!file.exists())
			file.mkdir();
		file = new File("dati/" + tableName);
		if (file.exists())
			throw new Exception("Duplicate table name: " + tableName);
		file.createNewFile();
		String names = "", types = "";
		for (String key : fields.keySet()) {
			names += key + " ";
			types += fields.get(key).toString() + " ";
		}
		PrintWriter pw = new PrintWriter(file);
		pw.println(names);
		pw.println(types);
		pw.close();
		return true;
	}
}
