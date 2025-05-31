
abstract class Animal {
    
    abstract void sound();

    static class Tiger extends Animal {
        @Override
        void sound() {
            System.out.println("Tiger growls");
        }
    }

    static class Lion extends Animal {
        @Override
        void sound() {
            System.out.println("Lion growls");
        }
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.sound(); 

        Lion lion = new Lion();
        lion.sound(); 
        System.out.println("Yashaswi Reddy 24351 CSE-C");
    }
}







