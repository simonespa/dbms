package dataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Insert implements UpdateQuery {
	private String tableName;
	private ArrayList<String> values = new ArrayList<String>();

	public Insert(String tableName) {
		super();
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

	public ArrayList<String> getValues() {
		return values;
	}

	public void addValue(String value) {
		values.add(value);
	}

	public Boolean execute() throws Exception {
		File file = new File("dati/" + tableName);
		if (!file.exists())
			throw new Exception("This table doesn't exists: " + tableName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		br.readLine();
		String row = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(row);
		String token;
		int index = 0;
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			if (token.equals(DataType.INTEGER.toString())) {
				try {
					Integer.parseInt(values.get(index));
				} catch (NumberFormatException e) {
					throw new Exception("Not an Integer value!");
				}
			} else if (token.equals(DataType.BOOLEAN.toString())) {
				if (!values.get(index).equals("true") && !values.get(index).equals("false"))
					throw new Exception("Not a boolean value!");
			} else {
				if (!values.get(index).startsWith("\"") || !values.get(index).endsWith("\""))
					throw new Exception("Not a String value!");
			}
			index++;
		}
		FileOutputStream fos = new FileOutputStream(file, true);
		String tmp = "";
		for (String key : values) {
			tmp += key + " ";
		}
		PrintWriter pw = new PrintWriter(fos);
		pw.println(tmp);
		pw.close();
		return true;
	}

}
