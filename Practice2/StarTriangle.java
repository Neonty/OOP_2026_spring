public class StarTriangle {
    private static final String star = "[*]";
    private final int width;

    public StarTriangle(int widthValue)
    {
        if (widthValue <= 0)
        {
            throw new IllegalArgumentException("Width must be positive");
        }

        this.width = widthValue;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= this.width; i++)
        {
            sb.append(star.repeat(i));
            sb.append('\n');
        }

        return sb.toString();
    }
}
