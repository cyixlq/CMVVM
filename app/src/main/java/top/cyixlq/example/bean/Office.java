package top.cyixlq.example.bean;

public class Office {
    public final String address;
    public final int capacity;
    public final int occupancy;
    public final int sqft;

    private Office(Builder builder) {
        address = builder.address;
        capacity = builder.capacity;
        occupancy = builder.occupancy;
        sqft = builder.sqft;
    }

    public static class Builder {
        private String address;
        private int capacity;
        private int occupancy;
        private int sqft;

        Office build() {
            return new Office(this);
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setOccupancy(int occupancy) {
            this.occupancy = occupancy;
            return this;
        }

        public Builder setSqft(int sqft) {
            this.sqft = sqft;
            return this;
        }
    }
}
