import java.awt.Color;


public class Recursion {
 public static int arraySum(Object obj) {
  if (obj instanceof Integer) {
   return (Integer) obj;
  } else {
   Object[] myArray = (Object[]) obj;
   for (int x = 0; x < myArray.length; x++) {
    int sum = arraySum(myArray[x]);
    sum = sum + arraySum(myArray[x + 1]);
    return sum;
   }
   return arraySum(obj);
  }
 }

 public static boolean isonlyDigits(String s) {
  for (int k = 0; k < s.length(); k = k + 1) {
   if (!Character.isDigit(s.charAt(k))) {
    return false;
   }
  }
  return true;
 }

 public static String commafy(long n) {
  if (n < 1000) return "" + n;
  return commafy(n / 1000) + "," + prepend(n % 1000);
  // Use the statement below instead of one above and you don’t need function prepend
  // return commafy(n/1000) + "," + String.format("%03d", n%1000);
 }

 /** Return n as a string of at least 3 digits, prepended with 0's if necessary.
  *  Precondition: n >= 0 */
 public static String prepend(long n) {
  if (n < 10) return "00" + n;
  if (n < 100) return "0" + n;
  return "" + n;
 }

 private void grislySnowflake(double x, double y, int d, double s) {
  if (d == 0) {
   jumpTo(x, y, 0);
   fillHex(s, x + s / 2, y - s * Math.sqrt(3) / 2);
  } else {
	 int my_const = (s * Math.sqrt(3) / 3);
   grislySnowflake(x, y, d - 1, s / 3);
   grislySnowflake(x + 2 * s / 3, y, d - 1, s / 3);
   grislySnowflake(x + s / 3, y - my_const, d - 1, s / 3);
   grislySnowflake(x - s / 3, y - my_const, d - 1, s / 3);
   grislySnowflake(x + s, y - my_const, d - 1, s / 3);
   grislySnowflake(x, y - (2 * my_const, d - 1, s / 3);
   grislySnowflake(x + 2 * s / 3, y - (2 * my_const, d - 1, s / 3);
  }
 }

 public static boolean isPalindrome(String s) {
  if (s.length() == 0 || s.length() == 1)
   return true; //if length = 0 OR 1 then it is a palindrome
  if (s.charAt(0) == s.charAt(s.length() - 1)) //Finds out if it is a palindrome by checking if first and
   return isPalindrome(s.substring(1, s.length() - 1)); //  last match and so on
  return false;
 }

 private void sierpinski(double x, double y, int d, double s) {
  if (d == 0) {
   jumpTo(x, y, 0);
   fillTriangle(s);
  } else {
   sierpinski(x, y, d - 1, s / 2);
   sierpinski(x + s / 2, y, d - 1, s / 2);
   sierpinski(x + s / 4, y - s * (Math.sqrt(3) / 4), d - 1, s / 2);
  }
 }

 public void drawSpiral(int i, Color c) {
  Color save = getColor();
  setColor(c);
  if (i <= n) {
   moveAhead(i * d);
   setColor(save);
   i++;
   if (c == Color.blue) {
    c = Color.red;
   } else if (c == Color.red) {
    c = Color.green;
   } else {
    c = Color.blue;
   }
   addAngle(ang);
   drawSpiral(i, c);
  }
 }


}
