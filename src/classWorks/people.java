package classWorks;

public enum people {
    WORM("Amaka"),
    DEJI(),
    BUNMI ("Love", "Florence");
    private  String[] boyFriendName;

    people(String name){
        boyFriendName =  new String[1];
        boyFriendName[0] = name;
    }
    people(String... names){
        boyFriendName =names;
    }

    public String[] getBoyFriendName() {
        return boyFriendName;
    }
    public void greetBoyfriend (){
        for (String boyfriend: boyFriendName){
            System.out.println("Hello" + boyfriend);
        }
    }
    public String toString(){
        switch (this){
            case DEJI: return "Deji";
            case WORM: return "Worm";
            case BUNMI: return "King Bunmi";
            default: return null;
        }
    }
}
