import java.util.ArrayList;
  public class Example {
    public static void main(String[] args){
      ArrayList<String> list = new ArrayList();
      System.out.println(list.size());
      list.add ("Brandon");
      list.add (0,"Henk");
      System.out.println(list.size());
      System.out.println(list);
      System.out.println(list.contains("Kulis"));
      System.out.println(list.contains("Henk"));
      String firstName = list.get(1);
      System.out.println(firstName);
    }
  }

//<String extends Compaiable<? Super String>
