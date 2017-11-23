package ua.rinnah.oop.lesson3;

public enum Gender{
    MAN(true), WOMAN(false);

    private boolean sex;

    private Gender(boolean sex){
        this.sex = sex;
    }

    public String getGender(){
        if(sex)
            return "MAN";
        return "WOMAN";
    }
}