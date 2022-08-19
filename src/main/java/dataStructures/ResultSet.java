package dataStructures;

import java.util.ArrayList;

public class ResultSet {
	private int fieldsNumber;
	private int currentRow = 0;
	private int rows;
	private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
	private ArrayList<String> names = new ArrayList<String>();
	private ArrayList<String> types = new ArrayList<String>();

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

	public void setTypes(ArrayList<String> types) {
		this.types = types;
	}

	public ResultSet(int fieldsNumber) {
		this.fieldsNumber = fieldsNumber;
	}

	public void insertRow(ArrayList<String> row) {
		data.add(row);
		rows++;
	}

	public int getFieldsNumber() {
		return fieldsNumber;
	}

	public boolean hasNext() {
		if (currentRow < data.size())
			return true;
		else
			return false;
	}

	public ArrayList<String> next() {
		return data.get(currentRow++);
	}

	public void reset() {
		currentRow = 0;
	}

	@Override
	public String toString() {
		String buffer = "";
		for (String value : names)
			buffer += value + "\t\t";
		buffer += "\n";
		for (String value : types)
			buffer += value + "\t\t";
		buffer += "\n";
		for (ArrayList<String> row : data) {
			for (String value : row)
				buffer += value + "\t\t";
			buffer += "\n";
		}
		return buffer;
	}
}
