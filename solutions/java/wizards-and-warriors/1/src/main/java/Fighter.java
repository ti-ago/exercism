class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {
 
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable(){
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable()){
            return 10;
        }
        return 6;
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {
    
    boolean spell = false;

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        spell = true;
    }

    @Override
    public boolean isVulnerable(){
        if(spell){
            spell = false;
            return false;
        }
        return true;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
        if(spell){
            spell = false;
            return 12;
        }
        return 3;
    }
}

