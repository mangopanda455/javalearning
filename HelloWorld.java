public class HelloWorld {
  public static void main(String[] args) {
    //write a program that camel cases any string
    String str = "hello world";
    String[] words = str.split(" ");
    String camelCase = "";
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String firstLetter = word.substring(0, 1);
      String restOfWord = word.substring(1);
      camelCase += firstLetter.toUpperCase() + restOfWord;
    }
    System.out.println(camelCase);
  }
}
