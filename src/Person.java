
    public class Person {
        String name ;
        int age;
        Car car;
        Pet [] pets;
        Person (String name, int age, Car car, Pet [] pets ) {
            this.name = name;
            this.age = age;
            this.car = car;
            this.pets = pets;
        }

        Person(String name) {
            this.name = name;
        }

        public void getInfo () {
            System.out.println( "name "+ name+ ", age " + age + "  машина " + car.model+" " +car.color+ " год выпуска " + car.god);
        }
    }

