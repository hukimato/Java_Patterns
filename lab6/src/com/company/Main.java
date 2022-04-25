package com.company;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor("Профессор 0");
        Professor professor1 = new Professor("Профессор 1");

        Listener BM_1 = new MathsDepartment("ВМ_1");
        Listener PF = new PhysicsDepartment("ПФ");
        Listener CS =  new CSDepartment("СПИНТех");

        professor1.events.subscribe("Maths", BM_1);
        professor1.events.subscribe("Physics", PF);
        professor1.events.subscribe("CS", CS);


        professor.events.subscribe("Maths", BM_1);
        professor.events.subscribe("Physics", PF);
        professor.events.subscribe("CS", CS);



        for (int i = 0; i < 10; i++){
            int a = (int) (Math.random()*6);
            switch (a){
                case 0: professor.maths();
                case 1: professor.physics();
                case 2: professor.cs();
                case 3: professor1.maths();
                case 4: professor1.physics();
                case 5: professor1.cs();
            }
        }

        professor.events.unsubscribe("Maths", BM_1);
        //professor1.events.unsubscribe();
        System.out.println("-------------------------------------");

        for (int i = 0; i < 10; i++){
            int a = (int) (Math.random()*5);
            switch (a){
                case 0: professor.maths();
                case 1: professor.physics();
                case 2: professor.cs();
                case 3: professor1.maths();
                case 4: professor1.physics();
            }
        }
    }
}
