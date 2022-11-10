class Circle {
  private Point center;
  private double radius;

  public Circle() {
    setCenter(new Point(0, 0));
    setRadius(5);
  }

  public Circle(Point center, double radius) {
    setCenter(new Point(center));
    setRadius(radius);
  }

  public Circle(double circumference, Point center) {
    setCenter(new Point(center));
    setRadius(getRadiusFromCircumference(circumference));
  }

  public Circle(Circle circle) {
    setCenter(new Point(circle.center));
    setRadius(circle.radius);
  }

  public Point getCenter() {
    return center;
  }

  public double getRadius() {
    return radius;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public void setRadius(double radius) {
    this.radius = radius > 0 ? radius : 1;
  }

  public double getRadiusFromCircumference(double circumference) {
    return circumference / (2 * Math.PI);
  }

  public boolean isInsight(Point point) {
    return getCenter().measureDistance(point) < getRadius();
  }

  public boolean equals(Circle circle) {
    return getCenter() == circle.center && getRadius() == circle.radius;
  }

  public String toString() {
    return "center: " + getCenter() + ", radius: " + getRadius();
  }
}
