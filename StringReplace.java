public class StringReplace {
    private String stateName;

    public StringReplace() {
        stateName ="mississippi";
    }
    public StringReplace(String stateName)
    {
        this.stateName=stateName;
    }
    public String replace()
    {
        String newState;
        newState=stateName.replace("i","ii");
        return newState;
    }
    public String replaceSS()
    {
        String newState;
        newState=stateName.replace("ss","s");
        return newState;
    }
}
