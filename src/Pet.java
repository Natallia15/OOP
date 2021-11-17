
    public class Pet {
        String type;
        String name;
        int age;
        int ves;

        Pet() {

        }

        Pet(String type, String name, int age, int ves) {
            this.type = type;
            this.name = name;
            this.age = age;
            this.ves = ves;

        }


        public void getInfo() {
            System.out.println("кто это " + type + ", имя " + name + " , возраст " + age + "вес " + ves);
        }
    }
