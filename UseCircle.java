class UseCircle {
  public static void main(String[] args) {
    Point point1 = new Point(2, 5);
    double radius1 = 4;
    Circle circle1 = new Circle(point1, radius1);

    Point point2 = new Point(5, 7);
    double circumference1 = 15;
    Circle circle2 = new Circle(circumference1, point2);

    Point point3 = new Point(3, 4);

    System.out.println(circle1);
    System.out.println(circle2);
    System.out.println(circle1.isInsight(point3));
  }
}
