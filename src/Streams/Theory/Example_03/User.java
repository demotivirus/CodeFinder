package Streams.Theory.Example_03;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String sex;
    private int age;

    public User(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public User(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
