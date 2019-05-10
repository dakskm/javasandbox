package leetcode.google.easy.judge.route.circle;

public class JudgeRouteCircle {
  public static void main(String args[]) {
    System.out.println(judgeCircle("UDUDUDUDUDLRLRLR"));
    System.out.println(judgeCircle("LRRD"));
  }

  public static boolean judgeCircle(String moves) {
    int x = 0, y = 0;
    for (char move: moves.toCharArray()) {
      if (move == 'U') y--;
      else if (move == 'D') y++;
      else if (move == 'L') x--;
      else if (move == 'R') x++;
    }
    return x == 0 && y == 0;
  }
}
