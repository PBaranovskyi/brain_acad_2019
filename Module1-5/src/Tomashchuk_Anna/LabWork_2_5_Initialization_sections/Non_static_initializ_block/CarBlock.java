package Tomashchuk_Anna.LabWork_2_5_Initialization_sections.Non_static_initializ_block;

public class CarBlock {
    private static int numOfCars;

    {
        numOfCars++;
    }

    public CarBlock() {
        ///
    }
    public CarBlock(int maxSpeed){

    }
}
