package gradle;

public class Triangle {
    public String checkTriangle(int x, int y, int z) {
        if (x <= 0 || y <= 0 || z <= 0)
        return "Value of x, y, or z is not in the range of permitted values.";

        else if (x == y && y == z)
        return "Equilateral Triangle";

        else if (x >= y+z || y >= x+z || z >= x+y)
        return "NotATriangle";

        else if (x == y || y == z || z == x)  
        return "Isosceles Triangle";

        else
        return "Scalene Triangle";
    }

}