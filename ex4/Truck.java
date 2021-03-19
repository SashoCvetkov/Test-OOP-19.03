package testOOP;

    class Truck extends Vehicle
    {
        public int weightLimit;

        public Truck(String _brand, String _model, int _wheels, int _weightLimit)
        {
            brand = _brand;
            model = _model;
            wheels = _wheels;
            weightLimit = _weightLimit;
        }

        @Override
        public void PrintInfo()
        {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Wheels: " + wheels);
            System.out.println("Weight limit (tons): " + weightLimit);
        }

}
