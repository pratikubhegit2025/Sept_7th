package StringBufferAndBuilder;

public class Delete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
  sb.delete(2, 4);
  System.out.println(sb);
	}

}
