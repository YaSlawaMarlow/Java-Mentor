class Chislo{
    int nom;

    public void setNom(int nom){
        if (nom<0 | nom>10){
            System.out.println("Ошибка:Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            System. exit(0);
        }
        this.nom = nom;
    }
    public int getNom(){
        return this.nom;
    }
}