package PatikaÖdevleri.Class.OBS_Update;

public class Course { //Bu classta ders adı ve prefixini constructorla alıp data classında kullanacağız

    String name;
    String prefix;

    public Course() {
    }

    public Course(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }

    void ogretmenAtama() { // Teacher classından branch ile coursenin prefixi eşitliğini kontrol ediyoruz.
        Data cou = new Data();
        for (int i = 0; i < cou.teacEkle().size(); i++) {
            for (int j = 0; j < cou.courseEkle().size(); j++) {

                if (cou.teacEkle().get(i).branch.equals(cou.courseEkle().get(j).prefix)) {
                    System.out.println(cou.teacEkle().get(i).name + " hoca " +
                            cou.courseEkle().get(j).name + " dersine atandı.");
                }
            }
        }
    }
}
