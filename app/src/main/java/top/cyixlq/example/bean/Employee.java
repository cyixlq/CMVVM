package top.cyixlq.example.bean;

public class Employee {
    public final String firstName;
    public final String lastName;
    public final String id;
    public final boolean isManager;
    public final String managerId;

    private Employee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.id = builder.id;
        this.isManager = builder.isManager;
        this.managerId = builder.managerId;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String id;
        private boolean isManager;
        private String managerId;

        Employee build() {
            return new Employee(this);
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsManager(boolean manager) {
            isManager = manager;
            return this;
        }

        public Builder setManagerId(String managerId) {
            this.managerId = managerId;
            return this;
        }
    }
}
