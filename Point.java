class Point {
  private double x;
  private double y;

  public Point() {
    setX(0);
    setY(0);
  }

  public Point(double x, double y) {
    setX(x);
    setY(y);
  }

  public Point(Point point) {
    setX(point.getX());
    setY(point.getY());
  }

  public Point copyPoint() {
    return new Point(this);
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public void shiftX(double distance) {
    setX(getX() + distance);
  }

  public Point shiftXCreate(double distance) {
    return new Point(getX() + distance, getY());
  }

  public void shiftY(double distance) {
    setY(getY() + distance);
  }

  public Point shiftYCreate(double distance) {
    return new Point(getX(), getY() + distance);
  }

  public void shiftPoint(double distanceX, double distanceY) {
    shiftX(distanceX);
    shiftY(distanceY);
  }

  public Point shiftPointCreate(double distanceX, double distanceY) {
    return new Point(getX() + distanceX, getY() + distanceY);
  }

  public double measureDistance(Point point) {
    return Math.sqrt(Math.pow((getX() - point.x), 2) + Math.pow((getY() - point.y), 2));
  }

  public static double measureDistanceStatic(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
  }

  public boolean equals(Point point) {
    return getX() == point.x && getY() == point.y;
  }

  public String toString() {
    return "x: " + getX() + ", y: " + getY();
  }
}
