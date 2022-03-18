public class Task {
    public static void main(String[] args) {
        Person p = new Person("Kim Possible", "2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        Resume.Education ed = r.new Education("NEIU", "Computer Science");

        r.addEducation(ed);
        Resume.Experience ex = new Resume.Experience("Busboy", 2004, 2007);

        r.addExperience(ex);
        r.addExperience(new Resume.Experience("Analyst", 2012, 2013));
        r.addExperience(new Resume.Experience("Sr Analyst", 2013, 2016));
        System.out.println(r);
    }
}