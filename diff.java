import java.io.*;
class Diff
{
  public static Double DerivativeTerm(String s, Double w1, Double w2)
  {
    l
  }
  public static Double Derivative(String s, Double w1, Double w2)
  {
    double ans = 0D;
    String str = "";
    Character ch[] = s.toCharArray();
    for(Character i:ch)
    {
      if(i == '+' || i == '-')
      {
        ans += DerivativeTerm(str, w1, w2);
        str = "";
      }
      else
      {
        str += i;
      }
    }
    return ans;
  }
  public static void main(String []args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the polynomial expression : ");
    String str = br.readLine();
    Double w1 = 0D, w2 = 0D;
    System.out.println("Enter the intial values for w1 and w2 : ");
    w1 = Double.parseDouble(br.readLine());
    w2 = Double.parseDouble(br.readLine());
    System.out.println("Result : "+Derivative(w1, w2));
  }
}
