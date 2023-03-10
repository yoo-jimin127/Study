//chapter 5_number 10
package chapter5_yoojimin;

abstract class PairMap {
	protected String keyArray []; //key ���� �迭
	protected String valueArray[]; //value ���� �迭
	abstract String get(String key); // key���� ���� value ����, ������ null ����
	abstract void put(String key, String value); //key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
	abstract String delete(String key); //key ���� ���� ������ (value �� �Բ�) ����, ������ value �� ����
	abstract int length(); //���� ����� �������� ���� ����
}
	
class Dictionary extends PairMap {
	private int dic_count;
	
	public Dictionary(int size) {
		this.dic_count = 0;
		keyArray = new String [size];
		valueArray = new String [size];
	}
	
	@Override
	public String get(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if ( key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}
	
	@Override
	public void put(String key, String value) {
		int i = 0;
		for (i = 0; i < dic_count; i++) {
			if (keyArray[i].equals(key)) {
				break;
			}
		}
			
			if (i == dic_count && i < keyArray.length) {
				dic_count++;	
				keyArray[i] = key;
				valueArray[i] = value;
			}
			
			else {
				keyArray[i] = key;
				valueArray[i] = value;
			}
		}
	
	@Override
	public String delete(String key) {
		int i = 0;
		for (i = 0; i < dic_count; i++) {
			if (keyArray[i].equals(key)) {
				break;
			}
		}
			
		if (i == dic_count) {
			return null;
		}
			
		else {				
			keyArray[i] = null;
			valueArray[i] = null;
		}
		return valueArray[i];
	}
	
	@Override
	public int length() { return dic_count; }
}

public class DictionaryApp {
	
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}
}
