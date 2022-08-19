package dataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Select implements DataQuery {
	private ArrayList<String> fields = new ArrayList<String>();
	private String table;
	private ArrayList<Where> where = new ArrayList<Where>();

	public void setTable(String table) {
		this.table = table;
	}

	public ArrayList<String> getFields() {
		return fields;
	}

	public ArrayList<Where> getWhere() {
		return where;
	}

	public void addWhereClause(String firstTerm, String comparator, String secondTerm) {
		where.add(new Where(firstTerm, comparator, secondTerm));
	}

	public void addField(String field) {
		fields.add(field);
	}

	public ResultSet execute() throws Exception {
		HashMap<String, Integer> mapping = new HashMap<String, Integer>();
		ArrayList<String> values = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> types = new ArrayList<String>();
		ArrayList<String> projection;
		File file = new File("dati/" + table);
		if (!file.exists())
			throw new Exception("This table doesn't exists: " + table);
		String row;
		BufferedReader br = new BufferedReader(new FileReader(file));
		row = br.readLine();
		StringTokenizer st = new StringTokenizer(row);
		int index = 0;
		String token;
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			mapping.put(token, index++);
			names.add(token);
		}

		row = br.readLine();
		st = new StringTokenizer(row);
		while (st.hasMoreTokens()) {
			types.add(st.nextToken());
		}

		ResultSet rs = new ResultSet(fields.size());
		if (fields.get(0).equals("*")) {
			rs.setNames(names);
			rs.setTypes(types);
		} else {
			rs.setNames(fields);
			ArrayList<String> projectedTypes = new ArrayList<String>();
			for (String field : fields)
				projectedTypes.add(types.get(mapping.get(field)));
			rs.setTypes(projectedTypes);
		}
		for (Where w : where) {
			if (mapping.get(w.firstTerm) == null)
				throw new Exception("Unknown Field: " + w.firstTerm);
		}
		boolean toAdd = true;
		String firstValue, secondValue;
		while ((row = br.readLine()) != null) {
			values.clear();
			st = new StringTokenizer(row);
			while (st.hasMoreTokens()) {
				values.add(st.nextToken());
			}
			toAdd = true;
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
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals("<>")) {
						if (first == second) {
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals("<")) {
						if (first >= second) {
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals(">")) {
						if (first <= second) {
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals("<=")) {
						if (first > second) {
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals(">=")) {
						if (first < second) {
							toAdd = false;
							break;
						}
					}
				} else {
					if (w.comparator.equals("=")) {
						if (!firstValue.equals(secondValue)) {
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals("<>")) {
						if (firstValue.equals(secondValue)) {
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals("<")) {
						if (firstValue.compareTo(secondValue) >= 0) {
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals(">")) {
						if (firstValue.compareTo(secondValue) <= 0) {
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals("<=")) {
						if (firstValue.compareTo(secondValue) > 0) {
							toAdd = false;
							break;
						}
					} else if (w.comparator.equals(">=")) {
						if (firstValue.compareTo(secondValue) < 0) {
							toAdd = false;
							break;
						}
					}
				}

			}
			if (toAdd) {
				projection = new ArrayList<String>();
				if (fields.get(0).equals("*"))
					projection.addAll(values);
				else {
					for (String field : fields) {
						projection.add(values.get(mapping.get(field)));
					}
				}
				rs.insertRow(projection);
			}
		}
		br.close();
		return rs;
	}

}
