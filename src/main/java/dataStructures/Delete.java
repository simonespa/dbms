package dataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Delete implements UpdateQuery {
	private String tableName;
	private ArrayList<Where> where = new ArrayList<Where>();

	public Delete(String tableName) {
		super();
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

	public ArrayList<Where> getWhere() {
		return where;
	}

	public void addWhereClause(String firstTerm, String comparator, String secondTerm) {
		where.add(new Where(firstTerm, comparator, secondTerm));
	}

	public Boolean execute() throws Exception {
		HashMap<String, Integer> mapping = new HashMap<String, Integer>();
		ArrayList<String> values = new ArrayList<String>();
		ArrayList<String> types = new ArrayList<String>();
		File file = new File("dati/" + tableName);
		File tmp = new File("dati/" + tableName + ".tmp");
		if (!file.exists())
			throw new Exception("This table doesn't exists: " + tableName);
		if (where.size() == 0) {
			file.delete();
			file.createNewFile();

			return true;
		}

		PrintWriter pw = new PrintWriter(tmp);
		String row;
		BufferedReader br = new BufferedReader(new FileReader(file));
		row = br.readLine();
		pw.println(row);
		StringTokenizer st = new StringTokenizer(row);
		int index = 0;
		String token;
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			mapping.put(token, index++);
		}
		row = br.readLine();
		pw.println(row);
		st = new StringTokenizer(row);
		while (st.hasMoreTokens()) {
			types.add(st.nextToken());
		}
		for (Where w : where) {
			if (mapping.get(w.firstTerm) == null)
				throw new Exception("Unknown Field: " + w.firstTerm);
		}
		boolean delete = true;
		String firstValue, secondValue;
		while ((row = br.readLine()) != null) {
			values.clear();
			st = new StringTokenizer(row);
			while (st.hasMoreTokens()) {
				values.add(st.nextToken());
			}
			delete = true;
			for (Where w : where) {
				firstValue = values.get(mapping.get(w.firstTerm));
				if (mapping.get(w.secondTerm) == null) {
					secondValue = w.secondTerm;
				} else
					secondValue = values.get(mapping.get(w.secondTerm));
				int first = 0, second = 0;
				if (types.get(mapping.get(w.firstTerm)).equals(DataType.INTEGER)) {
					first = Integer.parseInt(firstValue);
					second = Integer.parseInt(secondValue);
					if (w.comparator.equals("=")) {
						if (first != second) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals("<>")) {
						if (first == second) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals("<")) {
						if (first >= second) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals(">")) {
						if (first <= second) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals("<=")) {
						if (first > second) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals(">=")) {
						if (first < second) {
							delete = false;
							break;
						}
					}
				} else {
					if (w.comparator.equals("=")) {
						if (!firstValue.equals(secondValue)) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals("<>")) {
						if (firstValue.equals(secondValue)) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals("<")) {
						if (firstValue.compareTo(secondValue) >= 0) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals(">")) {
						if (firstValue.compareTo(secondValue) <= 0) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals("<=")) {
						if (firstValue.compareTo(secondValue) > 0) {
							delete = false;
							break;
						}
					} else if (w.comparator.equals(">=")) {
						if (firstValue.compareTo(secondValue) < 0) {
							delete = false;
							break;
						}
					}
				}

			}
			if (!delete)
				pw.println(row);
		}
		pw.close();
		br.close();
		file.delete();
		tmp.renameTo(file);
		return true;
	}
}
