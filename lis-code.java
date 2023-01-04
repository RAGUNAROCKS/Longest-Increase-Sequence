import Java.lang.*;

public class MyClass {
    public static int tamanho_msc(String s1, String s2){
	int tam_s1 = s1.length(), tam_s2 = s2.length();
	int mat[][] = new int[tam_s1 + 1][tam_s2 + 1];
	for(int i = 1; i <= tam_s1; i++){
		for(int j = 1; j <= tam_s2; j++){
			if(s1.charAt(i-1) == s2.charAt(j-1))
				mat[i][j] = mat[i-1][j-1] + 1;
			else
				mat[i][j] = Math.max(mat[i][j - 1], mat[i-1][j]);
		}
	}
	return mat[tam_s1][tam_s2];
}
    public static void main(String args[]) {
      String s1 = "ABCDE", s2 = "BCDA";
      int tam__msc = tamanho_msc(s1, s2);
      System.out.println("Tamanho = " + tam__msc);
    }
}