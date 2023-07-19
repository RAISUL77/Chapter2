public class SpaceRemove {
    private String string;

    public SpaceRemove() {
        string = "      my favorite player is cristiano ronaldo            ";
    }
    public SpaceRemove(String string)
    {
        this.string=string;
        System.out.println("before remove:"+string);
    }
    public String trim()
    {
        String Result;
        Result=string.trim();


        return Result;
    }
}
