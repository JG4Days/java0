/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goldblatt_8_java0.java;

/**
 *
 * @author james
 */
public class Goldblatt_8_java0Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal human = new Animal();
        Animal lion = new Animal("Lion");
        Animal fish = new Animal(4,0,"fish",false,false);
    }
}
    class Animal {

        int age;
        int legnum;
        String Name;
        boolean eatsmeat;
        boolean isMammal;

        public Animal() {
        }

        public Animal(String name) {
            this.Name = name;
        }

        public Animal(int Age, int Legnum, String name, boolean Eatsmeat, boolean IsMammal) {
            this.age = Age;
            this.legnum = Legnum;
            this.Name = name;
            this.eatsmeat = Eatsmeat;
            this.isMammal = IsMammal;
        }

        public int getAge() {
            return age;
        }

        public int getlegnum() {
            return legnum;
        }

        public String getName() {
            return Name;
        }
        
        public void setAge(int age){ 
            this.age = age;
        }
        public void setlegnum(int legnum){ 
            this.legnum = legnum;
        }
        
        public void setName(String Name){ 
            this.Name = Name;
        }
        
        void Eat(){
            System.out.println("nom nom");
        }
        
        void Noise(){
            System.out.println("Roar");
        }
        
        void Lick(){
            System.out.println("Lick noise");
        }
    }


