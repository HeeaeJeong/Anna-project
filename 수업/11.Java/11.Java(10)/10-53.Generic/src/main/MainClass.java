package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		Generic == template(����)
					: �ڷ��� ����
					: ���� Ŭ�������� �پ��� �ڷ����� ����ϰ� ���� ���, �����ϴ� ���
	*/		
	Box<Integer> box = new Box<Integer>( 123 );
	box.setTemp( 234 );
	System.out.println(box.getTemp());
	
	Box<String> sbox = new Box<String>( "hello" );
	sbox.setTemp("world");
	System.out.println(sbox.getTemp());
	
//	Box<int> tbox = new Box<int>(1);	�Ϲ� �ڷ����� ��� ����
	
	BoxMap<Integer, String> bmap = new BoxMap<Integer, String>(1001, "ȫ�浿");
	System.out.println(bmap.getKey());
	System.out.println(bmap.getValue());
	
	BoxMap<String, String> smap = new BoxMap<String, String>("apple", "���");
	
	/*
	BoxMap<Double, Integer> _smap
	BoxMap<Integer, Integer>
	BoxMap<Double, Double>
	*/
	}
	}

	class Box<T>{	// T = Integer, String
		T temp;

		public Box(T temp) {		
			this.temp = temp;
		}

		public T getTemp() {
			return temp;
		}

		public void setTemp(T temp) {
			this.temp = temp;
		}	
	}

	class BoxMap<KEY, VALUE>{
		KEY key;
		VALUE value;

		public BoxMap(KEY key, VALUE value) {		
			this.key = key;
			this.value = value;
		}

		public KEY getKey() {
			return key;
		}

		public void setKey(KEY key) {
			this.key = key;
		}

		public VALUE getValue() {
			return value;
		}

		public void setValue(VALUE value) {
			this.value = value;
		}	
		
	}
	

















