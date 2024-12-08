package src.DAY_4;

public class Line implements Comparable<Line> {
    private final Point start;
    private final Point end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }
    @Override
    public int compareTo(Line otherLine) {
        return Double.compare(this.getLength(), otherLine.getLength());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Line otherLine = (Line) obj;
        return Double.compare(this.getLength(), otherLine.getLength()) == 0;
    }
    @Override
    public int hashCode() {
        return Double.hashCode(this.getLength());
    }
}
