public class everyNth {
String str; 
int n;
  String result = "";
    for (int a=0; a<str.length(); a = a + n) {
    result = result + str.charAt(a);
  }
  return result;
}
