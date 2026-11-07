package algorithms.leetcode.topInterview150;

public class ZigzagConversion {

//    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
//    (you may want to display this pattern in a fixed font for better legibility)
//    P   A   H   N
//    A P L S I I G
//    Y   I   R
//    And then read line by line: "PAHNAPLSIIGYIR"
//
//    Write the code that will take a string and make this conversion given a number of rows:

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }


    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder result = new StringBuilder();
        int step = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int i = row; i < s.length(); i += step) {
                result.append(s.charAt(i));

                int diag = i + step - 2 * row;
                if (row > 0 && row < numRows - 1 && diag < s.length()) {
                    result.append(s.charAt(diag));
                }
            }
        }

        return result.toString();
    }


}
