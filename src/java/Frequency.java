
public class Frequency_Word {

public static void main(String[] args) {String str = "aliveli6traaligh& merdaliveli";
String str2 = "veli";
int m = str2.length();int count = 0;for (int i = 0; i < str.length()-(m-1); i++) {
if( str.substring(i,i+m).equals(str2)){
count++;
}
}System.out.println(count);}}