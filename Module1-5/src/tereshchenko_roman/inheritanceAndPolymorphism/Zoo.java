package tereshchenko_roman.inheritanceAndPolymorphism;

public class Zoo {

    // Определяем размер зоопарка:
    public static int zooSize = 20;

    // Создаём места для зверей:
    static Animal[] zooResidents = new Animal[zooSize];

//    // Делаем все места в зоопарке равными и пустыми (это нужно, чтобы сработал метод takeAnimals):
//    static void createSpots(Animal[] arr) {
//        for (Animal spot : zooResidents) {
//            spot = null;
//        }
//    }

    // Принимаем зверей по 3 за один раз(в следующие свободные места принимаем 3 новых зверей, делаем это один раз):
    public void takeAnimals(Animal newResident1, Animal newResident2, Animal newResident3) {
        for (int i = 0; i < zooSize - 2; i++) {
            if (zooResidents[i] == null) {
                zooResidents[i] = newResident1;
                zooResidents[i + 1] = newResident2;
                zooResidents[i + 2] = newResident3;
                break;
            }
        }

    }

    int count = 0; //Счётчик для метода showAnimals

    //    Показываем список принятых зверей, при этом проверяем, чтобы каждый следующий зверь не был кем-то из предыдущих:
    public void showAnimals(Animal[] arr) {
//        for (Animal zooResident : arr) {// Без проверки зверя равен ли он предыдущему.
//            if (zooResident != null) {
//                System.out.println(zooResident.getName() + ", " + zooResident.getAge() + " years old");
//            }
        System.out.println(arr[0].getName() + ", " + arr[0].getAge() + " years old");// Данные по первому зверю берутся
        // без проверки

        // Проверка равен ли последующий зверь какому-то из предыдущих:
        for (int m = 1; m < arr.length; m++) {// Берётся каждый зверь, начиная со второго, чтобы проверить, равен
            // ли он кому-то из предыдущих.
            for (int n = 0; n < m; n++) { //Берётся каждый предыдущий зверь, чтобы проверить, равен ли ему зверь m.
                if (arr[m] != null) { // Эта проверка здесь ни при чём, она только для метода takeAnimals (чтобы не
                    // выводить пустые места)
                    if (arr[m].equals(arr[n])) {
                        break;
                    }
                    count++;
                    if (count == m) {
                        System.out.println(arr[m].getName() + ", " + arr[m].getAge() + " years old");// Выводит зверя, если
                        // он не равен ни одному из предыдущих
                        count = 0;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        //Создаём определённый зоопарк:
        Zoo zoo1 = new Zoo();

//      Здесь можно изменить число мест в этом зоопарке: zoo1.zooSize = 10;

//        //Делаем в этом зоопарке места равными и пустыми, чтобы сработал метод takeAnimals:
//        zoo1.createSpots(zooResidents);

        //Создаём определённых зверей:
        Tiger tiger1 = new Tiger("Tiger1", 5);
        Bear bear1 = new Bear("Bear1", 3);
        Goat goat1 = new Goat("Goat1", 4);

        //Принимаем зверей в зоопарк и выводим их данные:
        zoo1.takeAnimals(tiger1, bear1, goat1);
//        zoo1.showAnimals(zooResidents);

        //Создаём и принимаем следующих зверей:
        Tiger tiger2 = new Tiger("Tiger2", 15);
        Bear bear2 = new Bear("Bear1", 3);
        Goat goat2 = new Goat("Goat2", 14);

        //Принимаем следующих зверей в зоопарк и выводим их данные:
        zoo1.takeAnimals(tiger2, bear2, goat2);
        zoo1.showAnimals(zooResidents);
        //И т. д. пока зоопарк не заполнится.
    }
}

