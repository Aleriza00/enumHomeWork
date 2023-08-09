public enum Days {
    MONDAY("Дуйшомбу куну жава окуйм"),
    TUESDAY("Шейшемби куну англис тилин окуйм "),
    WEDNESDAY("Шаршемби жава боюнча практика"),
    THURSDAY("Бейшемби теория сабагы"),
    FRIDAY("Жума англис тилин окуйм"),
    SATURDAY("Ишемби практика"),
    SUNDAY("Дем алуу куну");
    private String lessons;
    Days (String lessons){
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Days{" +
                "lessons='" + lessons + '\'' +
                '}';
    }
}
