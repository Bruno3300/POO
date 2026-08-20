package poo.ads;

public class Character {
    // Properties
    private String name, choosenClass;
    private int str;
    private int dex;
    private int vit;
    private int mag;
    private int hp;

    private int enemyHp = 100;

    //Methods
    public void setName (String n) {
        name = n;
    }

    public void setClass(String classe) {
        choosenClass = classe;
        switch (classe) {
            case "guerreiro" -> {str =6; dex=3; vit=5; mag=1;}
            case "mago" -> {str =1; dex=4; vit=3; mag=6;}
            case "ladino" -> {str =4; dex=6; vit=3; mag=3;}
            default -> {str=0; dex=3; vit=5; mag=1;}
        }
        hp = vit * 100;
    }

    public String getName() {
        return name;
    }

    public String getChoosenClass() {
        return choosenClass;
    }

    public int getAttribute(String attribute) {
        switch (attribute.toLowerCase()) {
            case "str" -> {return str;}
            case "dex" -> {return dex;}
            case "vit" -> {return vit;}
            case "mag" -> {return mag;}
            default -> {return 0;}
        }
    }

    public int getHp() {
        return hp;
    }

    public int getEnemyHp() {
        return enemyHp;
    }
}
