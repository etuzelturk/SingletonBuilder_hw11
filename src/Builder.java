public class Builder
{
    private final String name;
    private final String surname;
    private final Integer age;

    private Builder(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
    }

    public static class PersonBuilder {
        private final String name;
        private final String surname;
        private int age;

        public PersonBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Builder build() {
            return new Builder(this);
        }
    }
    @Override
    public String toString() {
        return "Person name:" + name + ", surname:" + surname + ", age:" + age;
    }
}
